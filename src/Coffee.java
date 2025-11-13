import java.util.ArrayList;
import java.util.List;

public class Coffee extends Items {
    private String milkType;
    private boolean isIced;
    private final List<AddOn> addOns = new ArrayList<>();

    public Coffee(String name, String size, double price, String milkType, boolean isIced) {
        super(name, size, price);
        this.milkType = milkType;
        this.isIced = isIced;
    }
    private static double basePrice(String size) {
        return switch (size.toLowerCase()) {
            case "small" -> 5.00;
            case "medium" -> 6.00;
            case "large" -> 6.50;
            default -> 5.50;
        };
    }
    public void addAddOn (AddOn addOn) {
        addOns.add(addOn);
    }
    @Override
    public double calculatePrice() {
        double total = price;
        for (AddOn addOn : addOns) {
            total += addOn.getPrice();
        }
        if (isIced) total += 0.50;
        return total;
    }
    @Override
    public String getDescription() {
        StringBuilder desc = new StringBuilder(super.getDescription())
                .append(" (").append(milkType)
                .append(isIced ? ", Iced" : "").append(")");
        if (!addOns.isEmpty()) {
            desc.append(" + ").append(addOns);
        }
        return desc.toString();
    }
}

import java.util.ArrayList;
import java.util.List;

public class Drink extends Items {
    private final String flavors;
    private final List<AddOn> addOn = new ArrayList<>();

    public Drink(String name, String size, String milk, String flavors) {
        super(name, size, basePrice(size));
        this.flavors = flavors;
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
            this.addOn.add(addOn);
        }
        @Override
        public double calculatePrice() {
            double total = basePrice;
            for (AddOn addOn : addOn) {
                total += addOn.getPrice();
            }
            return total;
        }
        @Override
        public String getDescription() {
            StringBuilder desc = new StringBuilder(super.getDescription())
                    .append(" (").append(flavors).append(")");
            if (!addOn.isEmpty()) {
                desc.append(" + ").append(addOn);
            }
            return desc.toString();
        }
    }

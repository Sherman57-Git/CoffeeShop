import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Items {
    protected String name;
    protected String size;
    protected double basePrice;
    protected List<AddOn> addOns;

    public Items(String name, String size, double basePrice) {
        this.name = name;
        this.size = size;
        this.basePrice = basePrice;
        this.addOns = new ArrayList<>();
    }
    public void addAddOn(AddOn addOn) {
        this.addOns.add(addOn);
    }
    //Gets the total cost of add ons
    public double addOnTotal() {
        return addOns.stream()
                .mapToDouble(AddOn::getPrice)
                .sum();
    }
    public abstract double calculatePrice();
    public String getDescription(){
        StringBuilder desc = new StringBuilder(size + "  " + name);
        if (!addOns.isEmpty()) {
            String addOnNames = addOns.stream()
                    .map(AddOn::getName)
                    .collect(Collectors.joining(", "));
            desc.append(" + ").append(addOns);
        }
        return desc.toString();
    }

}


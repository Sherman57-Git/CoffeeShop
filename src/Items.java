import java.util.ArrayList;
import java.util.List;

public abstract class Items {
    protected String name;
    protected String size;
    protected double basePrice;
    protected List<AddOn> addOn;

    public Items(String name, String size, double basePrice) {
        this.name = name;
        this.size = size;
        this.basePrice = basePrice;
        this.addOn = new ArrayList<>();
    }
    public void addAddOn(AddOn addOn) {
        this.addOn.add(addOn);
    }
    //Gets the total cost of add ons
    public double addOnTotal() {
        return addOn.stream()
                .mapToDouble(AddOn::getPrice)
                .sum();
    }

    public abstract double calculatePrice();
    public String getDescription(){
        return size + "  " + name;
    }

    public void add(int i, List<Items> items) {
    }
}

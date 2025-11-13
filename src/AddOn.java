public class AddOn {
    private final String name;
    private final double price;
    public AddOn(String name, double price) {
        this.name = name;
        this.price =price;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return name + " ($" + String.format("%.2f", price) + ")";
    }
}

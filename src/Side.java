public class Side extends Items {
    public Side(String name) {
        super(name, "Regular", 1.50);
    }
    @Override
    public double calculatePrice() {
        return price;
    }
}

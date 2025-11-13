import java.util.List;

public abstract class Items {
    protected String name;
    protected String size;
    protected double price;

    public Items(String name, String size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public abstract double calculatePrice();
    public String getDescription(){
        return size + "  " + name;
    }

    public void add(int i, List<Items> items) {
    }
}

import java.util.Scanner;

public class OrderScreen {
    private final Scanner scanner = new Scanner(System.in);
    private final Order order;
    public OrderScreen(Order order) {
        this.order = order;
    }
}

import java.util.Scanner;

public class CoolBeansCoffee {
    private static final Scanner scanner = new Scanner(System.in);
    static void main(String[] args) {
        while (true) {
            System.out.println("~~~~~Cool beans Coffee~~~~~");
            System.out.println("1: New Order");
            System.out.println("0: Exit");
            System.out.println("What would you like to do?☕:  ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    Order order = new Order();
                    OrderScreen orderSrceen = new OrderScreen(order);
                    screen.start();
                }
                case 0 -> {
                    System.out.println("Thank You! Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option");
            }
        }
    }

}

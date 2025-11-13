import java.util.Scanner;

public class OrderScreen {
    private final Scanner scanner = new Scanner(System.in);
    private final Order order;
    public OrderScreen(Order order) {
        this.order = order;
    }
    public void start(){
        boolean ordering = true;

        while(ordering) {
            System.out.println("~~~~ Order ~~~~ ");
            System.out.println("1: Want some Coffee?");
            System.out.println("2: No coffee? how about some other drinks? ");
            System.out.println("3: Would you like some pastries as well? ");
            System.out.println("4: Ready to Check out? ");
            System.out.println("0: Cancel Order" );
            System.out.println("What would you like to do today?: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 1 -> addItem();
                case 2 -> addDrink();
                case 3 -> addSide();
                case 4 -> checkout();
                case 0 -> {
                    order.clear();
                    System.out.println("Canceling order. Let's try that again!");
                    ordering = false;
                }

                default -> throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
    }
    // ADDING COFFEE
    private void addItem() {
        System.out.println("~~~ Coffee ~~~");
        System.out.println(" What kind of coffee would you like? Latte or Cappuccino? ");
        String name = scanner.nextLine();
        System.out.println("What size would you like for your coffee? Small, Medium or Large?");
        String size = scanner.next();
        System.out.println("Any Flavor syrups? Vanilla,Hazelnut,Caramel,BananaBread,Pumpkin Spice");
        String flavors = scanner.next();
        System.out.println("What milk would you like? We have Oat, Almond, Coconut and Whole milk.");
        String milk = scanner.next();
        System.out.println("Would you like it iced (y/n): ");
        boolean iced = scanner.nextLine().equalsIgnoreCase("y");
        Coffee coffee = new Coffee(name ,size, flavors, milk ,iced);
        order.addItem(coffee);
        System.out.println("Added: " + coffee.getDescription());
        //Add on for coffees
        System.out.print("Would you like to add extra add-ons? (y/n): ");
        if (scanner.nextLine().equalsIgnoreCase("y")) {
            boolean adding = true;
            while(adding) {
                System.out.println("\nChoose an add-on:");
                System.out.println("1: Vanilla Cold Foam ($1.00)");
                System.out.println("2: Whipped cream ($1.00)");
                System.out.println("2: Extra Syrup ($0.50)");
                System.out.println("0: Done");
                System.out.print("Select option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1 -> coffee.addAddOn(new AddOn("Vanilla Cold Foam", 1.00));
                    case 2 -> coffee.addAddOn(new AddOn("Whipped Cream", 1.00));
                    case 3 -> coffee.addAddOn(new AddOn("Extra Syrup", 0.50));
                    case 0 -> adding = false;
                    default -> System.out.println("Whoopsies, That isn't possible");
                }
            }
        }

    }// ADDING DRINKS
    private void addDrink() {
        System.out.println("~~~ Drinks ~~~");
        System.out.println(" Would you like to get a Matcha or Hot chocolate?: ");
        String name = scanner.nextLine();
        System.out.println("What size would you like for your Drink? Small, Medium or Large?");
        String size = scanner.nextLine();
        System.out.println("Any Flavor syrups? Vanilla,Hazelnut,Caramel,BananaBread,Pumpkin Spice");
        String flavors = scanner.next();
        System.out.println("What milk would you like? We have Oat, Almond, Coconut and Whole milk.");
        String milk = scanner.next();
        System.out.println("Would you like it iced (y/n): ");
        boolean iced = scanner.nextLine().equalsIgnoreCase("y");
        Drink drink = new Drink(name, size, milk, flavors);
        //Add ons for drinks
        System.out.print("Would you like to add extra add-ons? (y/n): ");
        if (scanner.nextLine().equalsIgnoreCase("y")) {
            boolean adding = true;
            while(adding) {
                System.out.println("\nChoose an add-on:");
                System.out.println("1: Whipped Cream ($1.00)");
                System.out.println("2: Vanilla Cold foam (1.00)");
                System.out.println("3: Extra Syrup ($0.50)");
                System.out.println("0: Done");
                System.out.print("Select option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1 -> drink.addAddOn(new AddOn("Vanilla Cold Foam", 1.00));
                    case 2 -> drink.addAddOn(new AddOn("Whipped Cream", 1.00));
                    case 3 -> drink.addAddOn(new AddOn("Extra Syrup", 0.50));
                    case 0 -> adding = false;
                    default -> System.out.println("Whoopsies, That isn't possible");
                }
            }
        }
        order.addItem(drink);
        System.out.println("Added: " + drink.getDescription());
    }
    private void addSide() {
        System.out.println("~~~ Yummy Baked goods ~~~");
        System.out.println("We have Croissants, Blueberry Muffins, Cookies. What would you like?:");
        String name = scanner.nextLine();
        Side side = new Side(name);
        order.addItem(side);
        System.out.println("Added: " + side.getDescription());
    }
    private void checkout() {
        System.out.println("~~~ Checking Out ~~~");
        System.out.println(order.getOrderSummary());
        System.out.println("Alright will this be all for today? (Y/N): ");
        String yup = scanner.nextLine();
        if (yup.equalsIgnoreCase("Y")) {
            Receipt.save(order);
            order.clear();
            System.out.println("Alright, Cool Beans! Here is your receipt! Thank you and have a great day!!");

        }
    }
}

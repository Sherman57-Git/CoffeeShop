package main;

public class Drink extends Items {
    private final String milk;
    public Drink(String name, String size, String milk) {
        super(name, size, basePrice(size));
        this.milk = milk;

    }

    private static double basePrice(String size) {
        return switch (size.toLowerCase()) {
            case "small" -> 5.00;
            case "medium" -> 6.00;
            case "large" -> 6.50;
            default -> 5.50;
        };
    }
        @Override
        public double calculatePrice() {
            double total = basePrice;
            for (AddOn addOn : addOns) {
                total += addOn.getPrice();
            }
            return total;
        }
        @Override
        public String getDescription() {
            StringBuilder desc = new StringBuilder(super.getDescription())
                    .append(" (")
                    .append(milk)
                    .append(")");
            return desc.toString();
        }

    }

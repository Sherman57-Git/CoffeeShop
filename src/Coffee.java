public class Coffee extends Items {
    private final String milkType;
    private final boolean isIced;
    private final String flavors;
    public Coffee(String name, String size, String milkType, boolean isIced, String flavors) {
        super(name, size, basePrice(size));
        this.milkType = milkType;
        this.isIced = isIced;
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
    @Override
    public double calculatePrice() {
        double total = basePrice;
        if (isIced) total += 0.50;
        return total;
    }
    @Override
    public String getDescription() {
        StringBuilder desc = new StringBuilder(super.getDescription())
                .append(" (")
                .append(milkType);
        if (isIced) desc.append(", Iced");
        if (!flavors.equalsIgnoreCase("none")) desc.append(", ").append(flavors);
        desc.append(")");
        return desc.toString();
    }

}

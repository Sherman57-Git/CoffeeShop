import java.util.ArrayList;
import java.util.List;

public class Order {
      private final List<Items> items = new ArrayList<>();
      public void addItem(Items item) {
           items.add(item);
      }
      public double getTotal() {
          double total = 0;
          for (Items items : items) {
              total += items.calculatePrice();
          }
          return total;
      }
      public String getOrderSummary() {
          StringBuilder sb = new StringBuilder("Order Summary:\n");
          for (Items items : items ) {
              sb.append("- ")
                      .append(items.getDescription())
                      .append(" : $")
                      .append(String.format("%.2f", items.calculatePrice()))
                      .append("\n");
          }
          sb.append("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
          sb.append("Total: $").append(String.format("%.2f", getTotal())).append("\n");
          return sb.toString();
      }
      public void clear() {
          items.clear();
      }

}

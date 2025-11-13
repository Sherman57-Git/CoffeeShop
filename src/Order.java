import java.util.ArrayList;
import java.util.List;

public class Order {
      private final List<Items> item = new ArrayList<>();
      public void addItem(Items items) {
           items.add(0, item);
      }
      public double getTotal() {
          double total = 0;
          for (Items item : item) {
              total += item.calculatePrice();
          }
          return total;
      }
      public String getOrderSummary() {
          StringBuilder sb = new StringBuilder("Order Summary:\n");
          for (Items items : item ) {
              sb.append("- ").append(items.getDescription())
                      .append(" : $").append(String.format("%.2f", items.calculatePrice()))
                      .append("\n");
          }
          sb.append("----------------------------\n");
          sb.append("Total: $").append(String.format("%.2f", getTotal())).append("\n");
          return sb.toString();
      }
      public void clear() {
          item.clear();
      }

}

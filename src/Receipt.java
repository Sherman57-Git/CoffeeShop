import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Receipt {
    public static void save(Order order) {
        try{
            String time = LocalTime.now().format(DateTimeFormatter.ofPattern("\"yyyy-MM-dd HH:mm:ss\""));
            String fileName = "receipts/" + time + ".txt";
            FileWriter writer = new FileWriter(fileName);
            writer.write("Cool Beans Coffee\n");
            writer.write("~~~~~~~~~~~~~~~~~~~~~~~\n");
            writer.write(order.getOrderSummary());
            writer.write("Date: " + LocalDateTime.now());
            writer.close();
            System.out.println("Receipt saved as: " + fileName);
        } catch (IOException e) {
            System.out.println("Error saving receipt: " + e.getMessage());
        }
    }
}

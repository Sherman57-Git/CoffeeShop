import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Receipt {
    public static void save(Order order) {
        try {
            File folder = new File("receipts");
            if (!folder.exists()) {
                folder.mkdirs();
            }
            String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
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


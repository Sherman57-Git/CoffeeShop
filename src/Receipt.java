import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Receipt {
    public static void save(Order order) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH:mm:ss");
        String timestamp = LocalDateTime.now().format(formatter);
        String directoryPath = "receipts";
        String fileName = directoryPath + "/" + timestamp + ".txt";
        try {
            File directory = new File(directoryPath);
            if(!directory.exists()) {
                directory.mkdir();
            }
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Cool Beans Coffee\n");
            writer.write("~~~~~~~~~~~~~~~~~~~~~~~\n");
            writer.write(order.getOrderSummary() + "\n");
            writer.write("Date: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HH:mm:ss")) + "\n");
        }
            System.out.println("Receipt saved as: " + fileName);
        } catch (IOException e) {
            System.out.println("Error saving receipt: " + e.getMessage());
        }
    }
}

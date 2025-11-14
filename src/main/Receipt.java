package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Receipt {
        public static void save(Order order) {
            try {
                //Creating a folder if it doesn't exist
                File folder = new File("receipts");
                if (!folder.exists()) {
                    folder.mkdirs();
                }
                String time = LocalDateTime.now()
                        .format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
                // Creating filename with current date&time
                String fileName = "receipts/" + time + ".txt";
                //Writes into the file
                FileWriter writer = new FileWriter(fileName);
                //Centers my text
                writer.write(center("COOL BEANS COFFEE", 30) + "\n");
                writer.write(center("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~", 30) + "\n\n");
                //Uses order class to put on receipt
                writer.write(order.getOrderSummary() + "\n");
                writer.write("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                //Date & Time
                writer.write("Date: " + LocalDateTime.now()
                        .format(DateTimeFormatter.ofPattern("MMMM dd, yyyy")) + "\n");
                writer.write("Time: " + LocalDateTime.now()
                        .format(DateTimeFormatter.ofPattern("hh:mm a")) + "\n");
                writer.write("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                //Footer
                writer.write(center("THANK YOU FOR YOUR ORDER!", 30) + "\n");
                writer.close();
                System.out.println("main.Receipt saved as: " + fileName);
            } catch (IOException e) {
                System.out.println("Error saving receipt: " + e.getMessage());
            }
        }
        // Centers a string within a given width
        private static String center(String text, int width) {
            int padding = (width - text.length()) / 2;
            return " ".repeat(Math.max(0, padding)) + text;
        }
}

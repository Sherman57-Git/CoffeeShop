package Test;

import main.Coffee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CoffeeTest {

    @Test
    void calculatePrice() {
        Coffee coffee = new Coffee("Latte","Small","Oat",true,"Vanilla");

        double expected = 5.00 + 0.50;
        double actual = coffee.calculatePrice();

        assertEquals(expected, actual, 0.01);
    }

    @Test
    void getDescription() {
        Coffee coffee = new Coffee("Latte","Small","Oat",true,"Vanilla");
        String desc = coffee.getDescription();
        assertTrue(desc.contains("Latte"));
        assertTrue(desc.contains("Small"));
        assertTrue(desc.contains("Oat"));
        assertTrue(desc.contains("Iced"));
        assertTrue(desc.contains("Vanilla"));

    }
}
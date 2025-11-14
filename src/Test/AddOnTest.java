package Test;

import main.AddOn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddOnTest {

    @Test
    void testGetName() {
            AddOn addOn = new AddOn("Vanilla Cold Foam", 1.00);
            Assertions.assertEquals("Vanilla Cold Foam", addOn.getName());
    }

    @Test
    void testGetPrice() {
        AddOn addOn = new AddOn("Extra Syrup", 0.50);
        Assertions.assertEquals(0.50, addOn.getPrice(), 0.01);
    }

    @Test
    void testToString() {
        AddOn addOn = new AddOn("Whipped Cream", 1.00);
        Assertions.assertEquals("Whipped Cream ($1.00)", addOn.toString());
    }
}
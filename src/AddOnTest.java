import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddOnTest {

    @Test
    void testGetName() {
            AddOn addOn = new AddOn("Vanilla Cold Foam", 1.00);
            assertEquals("Vanilla Cold Foam", addOn.getName());
    }

    @Test
    void testGetPrice() {
        AddOn addOn = new AddOn("Extra Syrup", 0.50);
        assertEquals(0.50, addOn.getPrice(), 0.01);
    }

    @Test
    void testToString() {
        AddOn addOn = new AddOn("Whipped Cream", 1.00);
        assertEquals("Whipped Cream ($1.00)", addOn.toString());
    }
}
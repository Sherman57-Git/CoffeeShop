package Test;

import main.Drink;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class DrinkTest {

    @Test
    void testCalculatePrice_noAddOns() {
        Drink drink = new Drink("Matcha", "Large", "Oat");
        double expected = 6.50;
        double actual = drink.calculatePrice();
        assertEquals(expected, actual, 0.1 );
    }

    @Test
    void getDescription() {
        Drink drink = new Drink("Matcha", "Large", "Oat");
        String desc = drink.getDescription();
        assertTrue(desc.contains("Matcha"));
        assertTrue(desc.contains("Large"));
        assertTrue(desc.contains("Oat"));
    }
}
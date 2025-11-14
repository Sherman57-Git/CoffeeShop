import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SideTest {

    @Test
    void testCalculatePrice() {
        Side side = new Side("Blueberry Muffin");
        assertEquals(1.50, side.calculatePrice(), 0.01);
    }
    @Test
    void testDescription() {
        Side side = new Side("Cookies");
        String desc = side.getDescription();
        assertTrue(desc.contains("Cookies"));
        assertTrue(desc.contains("Regular"));
    }
}
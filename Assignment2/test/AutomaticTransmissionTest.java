import org.junit.Test;
import transmission.AutomaticTransmission;

import static org.junit.Assert.*;

public class AutomaticTransmissionTest {
    @Test
    public void testCurrentSpeedAndGear() {
        AutomaticTransmission at = new AutomaticTransmission(4, 8, 10, 12, 17);
        assertEquals(0, at.getSpeed());
        assertEquals(0, at.getGear());

        at.increaseSpeed();
        assertEquals(2, at.getSpeed());
        assertEquals(1, at.getGear());

        at.increaseSpeed();
        assertEquals(4, at.getSpeed());
        assertEquals(2, at.getGear());

        at.increaseSpeed().increaseSpeed();
        assertEquals(8, at.getSpeed());
        assertEquals(3, at.getGear());

        at.decreaseSpeed();
        assertEquals(6, at.getSpeed());
        assertEquals(2, at.getGear());
    }

    @Test
    public void testIllegalValuesAndCheckError() {
        assertThrows(IllegalArgumentException.class, () -> new AutomaticTransmission(-4, 8, 10, 12, 17));
        assertThrows(IllegalArgumentException.class, () -> new AutomaticTransmission(4, 8, -10, 12, 17));
        assertThrows(IllegalArgumentException.class, () -> new AutomaticTransmission(4, 4, 10, 12, 17));
        assertThrows(IllegalArgumentException.class, () -> new AutomaticTransmission(4, 2, 17, 12, 17));
        assertThrows(IllegalArgumentException.class, () -> new AutomaticTransmission(4, 4, 4, 4, 4));
    }

    @Test
    public void testPrintMessage() {
        AutomaticTransmission at = new AutomaticTransmission(4, 8, 10, 12, 17);
        assertEquals("Transmission (speed = 0, gear = 0)", at.toString());
        at.increaseSpeed().increaseSpeed().increaseSpeed().increaseSpeed().increaseSpeed();
        assertEquals("Transmission (speed = 10, gear = 4)", at.toString());
    }
}
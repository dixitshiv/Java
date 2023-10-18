package weather;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class WeatherReadingTest {

    private WeatherReading validReading;

    @Before
    public void setUp() {
        /// Create an object for testing
        validReading = new WeatherReading(23, 12, 3, 12);
    }

    @Test
    public void testGetTemperature() {
        int temperature = validReading.getTemperature();
        /// Assert: Check that the result matches the expected value
        assertEquals(23, temperature);
    }

    @Test
    public void testGetDewPoint() {
        int dewPoint = validReading.getDewPoint();
        /// Assert: Check that the result is within an acceptable range
        assertTrue("Dew point should be less than or equal to temperature", dewPoint <= validReading.getTemperature());
    }

    @Test
    public void testGetWindSpeed() {
        int windSpeed = validReading.getWindSpeed();
        /// Assert: Check that the result matches the expected value
        assertEquals(3, windSpeed);
    }

    @Test
    public void testGetTotalRain() {
        int totalRain = validReading.getTotalRain();
        /// Assert: Check that the result matches the expected value
        assertEquals(12, totalRain);
    }

    @Test
    public void testGetRelativeHumidity() {
        int relativeHumidity = validReading.getRelativeHumidity();
        /// Assert: Check that the result is within the expected range (0-100)
        assertTrue("Relative humidity should be between 0 and 100", relativeHumidity >= 0 && relativeHumidity <= 100);
    }

    @Test
    public void testGetHeatIndex() {
        double expectedMinHeatIndex = 0; // Define a minimum reasonable value
        double expectedMaxHeatIndex = 100; // Define a maximum reasonable value
        double heatIndex = validReading.getHeatIndex();
        // Assert: Check that the calculated heat index is within the expected range
        assertTrue("Heat index should be within the expected range", heatIndex >= expectedMinHeatIndex && heatIndex <= expectedMaxHeatIndex);
    }

    @Test
    public void testGetWindChill() {
        double windChill = validReading.getWindChill();
        // Assert: Check that the result is within an acceptable range
        assertTrue("Wind chill should be reasonable", windChill >= validReading.getTemperature() - 10 && windChill <= validReading.getTemperature() + 10);
    }


    @Test
    public void testToString() {
        String result = validReading.toString();
        // Assert: Check that the resulting string matches the expected format
        assertEquals("Reading: T = 23, D = 12, v = 3, rain = 12", result);
    }
}

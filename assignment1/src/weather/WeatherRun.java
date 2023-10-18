package weather;


public class WeatherRun {
    public static void main(String[] args) {

        // Create a WeatherReading object
        WeatherReading reading = new WeatherReading(23, 12, 3, 12);

        // Print the weather data
        System.out.println(reading.toString());

    }
}


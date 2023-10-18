public class WindChillCalculator {
    public static double calculateWindChill(double temperatureFahrenheit, double windSpeedMPH) {
        double WC = 35.74 + 0.6215 * temperatureFahrenheit - 35.75 * Math.pow(windSpeedMPH, 0.16)
                + 0.4275 * temperatureFahrenheit * Math.pow(windSpeedMPH, 0.16);
        return WC;
    }

    public static void main(String[] args) {
        double temperatureCelsius = 23.0; // Replace with your temperature in Celsius
        double windSpeedMPH = 3;      // Replace with your wind speed in miles per hour

        // Convert temperature from Celsius to Fahrenheit
        double temperatureFahrenheit = celsiusToFahrenheit(temperatureCelsius);

        // Calculate wind chill
        double windChill = calculateWindChill(temperatureFahrenheit, windSpeedMPH);

        System.out.println("Temperature in Fahrenheit: " + temperatureFahrenheit + " °F");
        System.out.println("Wind Speed: " + windSpeedMPH + " mph");
        System.out.println("Wind Chill: " + windChill + " °F");
    }

    public static double celsiusToFahrenheit(double temperatureCelsius) {
        double temperatureFahrenheit = (9.0 / 5.0) * temperatureCelsius + 32.0;
        return temperatureFahrenheit;
    }
}

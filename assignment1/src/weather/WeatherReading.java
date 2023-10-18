package weather;


public class WeatherReading {

    /// Private variables to store weather data
    private int temperature;
    private int dewPoint;
    private int windSpeed;
    private int totalRain;

    /// Constructor
    public WeatherReading(int airTemperature, int dewPointTemperature, int windSpeed, int totalRain) {
        this.temperature = airTemperature;
        this.dewPoint = dewPointTemperature;
        this.windSpeed = windSpeed;
        this.totalRain = totalRain;
    }



    /// Getter method for temperature
    public int getTemperature() {
        return temperature;
    }

    /// Getter method for dew point
    public int getDewPoint() {
        int relativeHumidityDecimal = getRelativeHumidity() / 100; // Convert relative humidity to decimal
        int dewPoint;
        dewPoint = temperature - ((100 - (relativeHumidityDecimal * 100)) / 5);
        return dewPoint;
    }

    /// Getter method for wind speed

    public int getWindSpeed() {
        return windSpeed;
    }

    /// Getter method for total rain
    public int getTotalRain() {
        return totalRain;
    }

    /// Calculate and return relative humidity in percentage
    public int getRelativeHumidity() {
        double vaporPressure = 6.112 * Math.exp((17.67 * dewPoint) / (dewPoint + 243.5));
        double actualVaporPressure = 6.112 * Math.exp((17.67 * temperature) / (temperature + 243.5));
        double relativeHumidity = (vaporPressure / actualVaporPressure) * 100;
        return (int) Math.round(relativeHumidity);
    }

    /// Calculate and return the heat index in Celsius
    public double getHeatIndex() {
        double temperatureFahrenheit = (temperature * 9 / 5) + 32; /// Convert temperature to Fahrenheit
        double relativeHumidityDecimal = getRelativeHumidity() / 100.0; /// Convert relative humidity to decimal

        /// Coefficients for the heat index calculation
        double C1 = -8.78469475556;
        double C2 = 1.61139411;
        double C3 = 2.33854883889;
        double C4 = -0.14611605;
        double C5 = -0.012308094;
        double C6 = -0.0164248277778;
        double C7 = 0.002211732;
        double C8 = 0.00072546;
        double C9 = -0.000003582;

        double heatIndexFahrenheit = C1 +
                C2 * temperatureFahrenheit +
                C3 * relativeHumidityDecimal +
                C4 * temperatureFahrenheit * relativeHumidityDecimal +
                C5 * Math.pow(temperatureFahrenheit, 2) +
                C6 * Math.pow(relativeHumidityDecimal, 2) +
                C7 * Math.pow(temperatureFahrenheit, 2) * relativeHumidityDecimal +
                C8 * temperatureFahrenheit * Math.pow(relativeHumidityDecimal, 2) +
                C9 * Math.pow(temperatureFahrenheit, 2) * Math.pow(relativeHumidityDecimal, 2);

        double heatIndexCelsius = (heatIndexFahrenheit - 32) * 5 / 9; /// Convert heat index back to Celsius
        return heatIndexCelsius;
    }

    /// Calculate and return the wind chill in Celsius
    public double getWindChill() {
        double temperatureFahrenheit = (temperature * 9 / 5) + 32; /// Convert temperature to Fahrenheit
        double windChillFahrenheit = 35.74 + 0.6215 * temperatureFahrenheit - 35.75 * Math.pow(windSpeed, 0.16)
                + 0.4275 * temperatureFahrenheit * Math.pow(windSpeed, 0.16);

        double windChillCelsius = (windChillFahrenheit - 32) * 5 / 9; /// Convert wind chill back to Celsius
        return windChillCelsius;
    }

    /// Override the toString method to format the output
    @Override
    public String toString() {
        return "Reading: T = " + temperature + ", D = " + dewPoint + ", v = " + windSpeed + ", rain = " + totalRain;
    }
}

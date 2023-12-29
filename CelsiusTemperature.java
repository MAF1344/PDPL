// class implementasi
public class CelsiusTemperature extends Celsius {
    private double temperature;

    // Constructor
    public CelsiusTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    public double convertToFahrenheit() {
        // Rumus konversi Celsius ke Fahrenheit: (Celsius * 9/5) + 32
        return (temperature * 9 / 5) + 32;
    }

    public double convertToKelvin() {
        // Rumus konversi Celsius ke Kelvin: Celsius + 273.15
        return temperature + 273.15;
    }
}

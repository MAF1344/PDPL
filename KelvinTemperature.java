// class implementasi
public class KelvinTemperature extends Kelvin {
    private double temperature;

    public KelvinTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    public double convertToCelsius() {
        // Rumus konversi Kelvin ke Celsius: Kelvin - 273.15
        return temperature - 273.15;
    }

    public double convertToFahrenheit() {
        // Rumus konversi Kelvin ke Fahrenheit: (Kelvin - 273.15) * 9/5 + 32
        return (temperature - 273.15) * 9/5 + 32;
    }
}

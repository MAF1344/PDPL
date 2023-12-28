// class implementasi
public class FahrenheitTemperature extends Fahrenheit {
    private double temperature;

    public FahrenheitTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    public double convertToCelsius() {
        // Rumus konversi Fahrenheit ke Celsius: (Fahrenheit - 32) * 5/9
        return (temperature - 32) * 5/9;
    }

    public double convertToKelvin() {
        // Rumus konversi Fahrenheit ke Kelvin: (Fahrenheit - 32) * 5/9 + 273.15
        return (temperature - 32) * 5/9 + 273.15;
    }
}

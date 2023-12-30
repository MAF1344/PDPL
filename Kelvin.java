// class abstrak Kelvin.
public abstract class Kelvin implements Temperature {

    // Metode abstrak untuk mendapatkan suhu dalam Kelvin.
    @Override
    public abstract double getTemperature();

    // Metode abstrak untuk mengonversi suhu dari Kelvin ke Celsius.
    public abstract double convertToCelsius();

    // Metode abstrak untuk mengonversi suhu dari Kelvin ke Fahrenheit.
    public abstract double convertToFahrenheit();
}
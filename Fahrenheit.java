// class abstrak Fahrenheit.
public abstract class Fahrenheit implements Temperature {

    // Metode abstrak untuk mendapatkan suhu dalam Fahrenheit.
    @Override
    public abstract double getTemperature();

    // Metode abstrak untuk mengonversi suhu dari Fahrenheit ke Celsius.
    public abstract double convertToCelsius();

    // Metode abstrak untuk mengonversi suhu dari Fahrenheit ke Kelvin.
    public abstract double convertToKelvin();
}

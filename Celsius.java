// class abstrak Celcius.
public abstract class Celsius implements Temperature {

    // Metode abstrak untuk mendapatkan suhu dalam satuan Celsius.
    @Override
    public abstract double getTemperature();

    // Metode abstrak untuk mengonversi suhu ke Fahrenheit.
    public abstract double convertToFahrenheit();

    // Metode abstrak untuk mengonversi suhu ke Kelvin.
    public abstract double convertToKelvin();
}
/**
 * Kelas TemperatureBuilder: menyediakan metode untuk membangun objek
 * TemperatureType
 * dengan suhu dalam skala Celsius, Fahrenheit, dan Kelvin.
 */
public class TemperatureBuilder {

    // Metode untuk membangun objek TemperatureType dengan suhu dalam skala Celsius.
    public TemperatureType buildCelsiusTemperature() {
        TemperatureType temperatures = new TemperatureType();
        temperatures.addItem(new CelsiusTemperature());
        return temperatures;
    }

    // Metode untuk membangun objek TemperatureType dengan suhu dalam skala
    // Fahrenheit.
    public TemperatureType buildFahrenheitTemperature() {
        TemperatureType temperatures = new TemperatureType();
        temperatures.addItem(new FahrenheitTemperature());
        return temperatures;
    }

    // Metode untuk membangun objek TemperatureType dengan suhu dalam skala Kelvin.
    public TemperatureType buildKelvinTemperature() {
        TemperatureType temperatures = new TemperatureType();
        temperatures.addItem(new KelvinTemperature());
        return temperatures;
    }
}

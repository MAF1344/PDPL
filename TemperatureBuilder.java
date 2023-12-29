/**
 * Kelas TemperatureBuilder: menyediakan metode untuk membangun objek
 * TemperatureType
 * dengan suhu dalam skala Celsius, Fahrenheit, dan Kelvin.
 */

public class TemperatureBuilder {
    public TemperatureType buildCelsiusTemperature() {
        TemperatureType temperatures = new TemperatureType();
        temperatures.addItem(new CelsiusTemperature());
        return temperatures;
    }

    public TemperatureType buildFahrenheitTemperature() {
        TemperatureType temperatures = new TemperatureType();
        temperatures.addItem(new FahrenheitTemperature());
        return temperatures;
    }

    public TemperatureType buildKelvinTemperature() {
        TemperatureType temperatures = new TemperatureType();
        temperatures.addItem(new KelvinTemperature());
        return temperatures;
    }
}

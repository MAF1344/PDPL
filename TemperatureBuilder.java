/**
 * Kelas TemperatureBuilder: menyediakan metode untuk membangun objek
 * TemperatureType
 * dengan suhu dalam skala Celsius, Fahrenheit, dan Kelvin.
 */

public class TemperatureBuilder {
    public TemperatureType buildCelsiusTemperature(double temperature) {
        TemperatureType temperatures = new TemperatureType();
        temperatures.addItem(new CelsiusTemperature(temperature));
        return temperatures;
    }

    public TemperatureType buildFahrenheitTemperature(double temperature) {
        TemperatureType temperatures = new TemperatureType();
        temperatures.addItem(new FahrenheitTemperature(temperature));
        return temperatures;
    }

    public TemperatureType buildKelvinTemperature(double temperature) {
        TemperatureType temperatures = new TemperatureType();
        temperatures.addItem(new KelvinTemperature(temperature));
        return temperatures;
    }
}

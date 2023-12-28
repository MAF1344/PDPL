public class TemperatureConversionDemo {
    public static void main(String args[]) {
        TemperatureBuilder temperatureBuilder = new TemperatureBuilder();

        //  Build dan menampilkan suhu dalam Celsius beserta konversinya
        TemperatureType suhuCelsius = temperatureBuilder.buildCelsiusTemperature(25.5);
        System.out.println("Suhu dalam Celsius: " + suhuCelsius.getItems().get(0).getTemperature());
        System.out.println("Suhu dalam Fahrenheit: " + ((CelsiusTemperature) suhuCelsius.getItems().get(0)).convertToFahrenheit());
        System.out.println("Suhu dalam Kelvin: " + ((CelsiusTemperature) suhuCelsius.getItems().get(0)).convertToKelvin());

        TemperatureType suhuFahrenheit = temperatureBuilder.buildFahrenheitTemperature(77.9);
        System.out.println("\nSuhu dalam Fahrenheit: " + suhuFahrenheit.getItems().get(0).getTemperature());
        System.out.println("Suhu dalam Celsius: " + ((FahrenheitTemperature) suhuFahrenheit.getItems().get(0)).convertToCelsius());
        System.out.println("Suhu dalam Kelvin: " + ((FahrenheitTemperature) suhuFahrenheit.getItems().get(0)).convertToKelvin());

        TemperatureType suhuKelvin = temperatureBuilder.buildKelvinTemperature(298.15);
        System.out.println("\nSuhu dalam Kelvin: " + suhuKelvin.getItems().get(0).getTemperature());
        System.out.println("Suhu dalam Celsius: " + ((KelvinTemperature) suhuKelvin.getItems().get(0)).convertToCelsius());
        System.out.println("Suhu dalam Fahrenheit: " + ((KelvinTemperature) suhuKelvin.getItems().get(0)).convertToFahrenheit());
    }
}

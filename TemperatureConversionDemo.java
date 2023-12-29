
// Import Java Input n Reader
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TemperatureConversionDemo {
    public static void main(String args[]) {
        TemperatureBuilder temperatureBuilder = new TemperatureBuilder();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(
                    "Pilih konversi suhu yang akan dipakai: \n\n1. Celcius to Fahrenheit & Kelvin\n2. Fahrenheit to Celcius & Kelvin\n3. Kelvin to Celcius & Fahrenheit\n\nEnter Number : ");
            Integer userInput = Integer.parseInt(br.readLine());
            if (userInput == 1) {
                // Build dan menampilkan suhu dalam Celsius beserta konversinya
                TemperatureType suhuCelsius = temperatureBuilder.buildCelsiusTemperature();
                System.out.println("\nSuhu dalam Celsius: " + suhuCelsius.getItems().get(0).getTemperature());
                System.out.println(
                        "Suhu dalam Fahrenheit: "
                                + ((CelsiusTemperature) suhuCelsius.getItems().get(0)).convertToFahrenheit());
                System.out.println(
                        "Suhu dalam Kelvin: " + ((CelsiusTemperature) suhuCelsius.getItems().get(0)).convertToKelvin());
            } else if (userInput == 2) {
                // Build dan menampilkan suhu dalam Fahrenheit beserta konversinya
                TemperatureType suhuFahrenheit = temperatureBuilder.buildFahrenheitTemperature();
                System.out.println("\nSuhu dalam Fahrenheit: " + suhuFahrenheit.getItems().get(0).getTemperature());
                System.out.println(
                        "Suhu dalam Celsius: "
                                + ((FahrenheitTemperature) suhuFahrenheit.getItems().get(0)).convertToCelsius());
                System.out.println(
                        "Suhu dalam Kelvin: "
                                + ((FahrenheitTemperature) suhuFahrenheit.getItems().get(0)).convertToKelvin());
            } else if (userInput == 3) {
                // Build dan menampilkan suhu dalam Kelvin beserta konversinya
                TemperatureType suhuKelvin = temperatureBuilder.buildKelvinTemperature();
                System.out.println("\nSuhu dalam Kelvin: " + suhuKelvin.getItems().get(0).getTemperature());
                System.out.println(
                        "Suhu dalam Celsius: " + ((KelvinTemperature) suhuKelvin.getItems().get(0)).convertToCelsius());
                System.out.println(
                        "Suhu dalam Fahrenheit: "
                                + ((KelvinTemperature) suhuKelvin.getItems().get(0)).convertToFahrenheit());
            } else {
                System.out.println("Invalid Input");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

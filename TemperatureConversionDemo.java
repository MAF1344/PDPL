
// Import untuk mengakses BufferedReader dan InputStreamReader untuk input.
import java.io.BufferedReader;
import java.io.InputStreamReader;

// Kelas utama TemperatureConversionDemo untuk menunjukkan penggunaan TemperatureBuilder.
public class TemperatureConversionDemo {
    public static void main(String args[]) {
        // Membuat objek TemperatureBuilder.
        TemperatureBuilder temperatureBuilder = new TemperatureBuilder();

        try {
            // Membuat objek BufferedReader untuk membaca input dari pengguna.
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Menampilkan pilihan konversi suhu kepada pengguna.
            System.out.println(
                    "Pilih konversi suhu yang akan dipakai: \n\n1. Celcius to Fahrenheit & Kelvin\n2. Fahrenheit to Celcius & Kelvin\n3. Kelvin to Celcius & Fahrenheit\n\nEnter Number : ");

            // Membaca input pengguna.
            Integer userInput = Integer.parseInt(br.readLine());

            // Build dan menampilkan suhu sesuai input dari pengguna.
            if (userInput == 1) {
                // Build dan menampilkan suhu dalam Celsius beserta konversinya.
                TemperatureType suhuCelsius = temperatureBuilder.buildCelsiusTemperature();
                System.out.println("\nSuhu dalam Celsius: " + suhuCelsius.getItems().get(0).getTemperature());
                System.out.println(
                        "Suhu dalam Fahrenheit: "
                                + ((CelsiusTemperature) suhuCelsius.getItems().get(0)).convertToFahrenheit());
                System.out.println(
                        "Suhu dalam Kelvin: " + ((CelsiusTemperature) suhuCelsius.getItems().get(0)).convertToKelvin());
            } else if (userInput == 2) {
                // Build dan menampilkan suhu dalam Fahrenheit beserta konversinya.
                TemperatureType suhuFahrenheit = temperatureBuilder.buildFahrenheitTemperature();
                System.out.println("\nSuhu dalam Fahrenheit: " + suhuFahrenheit.getItems().get(0).getTemperature());
                System.out.println(
                        "Suhu dalam Celsius: "
                                + ((FahrenheitTemperature) suhuFahrenheit.getItems().get(0)).convertToCelsius());
                System.out.println(
                        "Suhu dalam Kelvin: "
                                + ((FahrenheitTemperature) suhuFahrenheit.getItems().get(0)).convertToKelvin());
            } else if (userInput == 3) {
                // Build dan menampilkan suhu dalam Kelvin beserta konversinya.
                TemperatureType suhuKelvin = temperatureBuilder.buildKelvinTemperature();
                System.out.println("\nSuhu dalam Kelvin: " + suhuKelvin.getItems().get(0).getTemperature());
                System.out.println(
                        "Suhu dalam Celsius: " + ((KelvinTemperature) suhuKelvin.getItems().get(0)).convertToCelsius());
                System.out.println(
                        "Suhu dalam Fahrenheit: "
                                + ((KelvinTemperature) suhuKelvin.getItems().get(0)).convertToFahrenheit());
            } else {
                // Menangani apabila pengguna mengInputkan angka yang tidak sesuai.
                System.out.println("Invalid Input");
            }
        } catch (Exception e) {
            // Mencetak Stack Trace.
            e.printStackTrace();
        }
    }
}

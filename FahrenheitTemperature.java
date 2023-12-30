
// Import untuk mengakses BufferedReader dan InputStreamReader untuk input.
import java.io.BufferedReader;
import java.io.InputStreamReader;

// Kelas implementasi FahrenheitTemperature yang merupakan turunan dari kelas abstrak Fahrenheit.
public class FahrenheitTemperature extends Fahrenheit {

    // Variabel untuk menyimpan suhu dalam Fahrenheit.
    private double temperature;

    // Konstruktor untuk mengambil input suhu dalam Fahrenheit dari pengguna.
    public FahrenheitTemperature() {
        try {
            // Membuat objek BufferedReader untuk membaca input dari pengguna.
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Meminta pengguna memasukkan suhu dalam Fahrenheit.
            System.out.println("\nEnter Fahrenheit Temperature : ");
            Double temp = Double.parseDouble(br.readLine());

            // Menyimpan suhu yang dimasukkan oleh pengguna.
            this.temperature = temp;
        } catch (Exception e) {
            // Mencetak Stack Trace.
            e.printStackTrace();
        }
    }

    // Implementasi metode abstrak dari antarmuka Temperature untuk mendapatkan suhu
    // dalam Fahrenheit.
    @Override
    public double getTemperature() {
        return temperature;
    }

    // Metode untuk mengonversi suhu dari Fahrenheit ke Celsius.
    public double convertToCelsius() {
        // Rumus konversi Fahrenheit ke Celsius: (Fahrenheit - 32) * 5/9
        return (temperature - 32) * 5 / 9;
    }

    // Metode untuk mengonversi suhu dari Fahrenheit ke Kelvin.
    public double convertToKelvin() {
        // Rumus konversi Fahrenheit ke Kelvin: (Fahrenheit - 32) * 5/9 + 273.15
        return (temperature - 32) * 5 / 9 + 273.15;
    }
}

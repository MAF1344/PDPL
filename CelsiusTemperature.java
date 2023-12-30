
// Import untuk mengakses BufferedReader dan InputStreamReader untuk input.
import java.io.BufferedReader;
import java.io.InputStreamReader;

// Kelas implementasi CelsiusTemperature yang merupakan turunan dari kelas abstrak Celsius.
public class CelsiusTemperature extends Celsius {

    // Variabel untuk menyimpan suhu dalam Celsius.
    private double temperature;

    // Konstruktor untuk mengambil input suhu dalam Celsius dari pengguna.
    public CelsiusTemperature() {
        try {
            // Membuat objek BufferedReader untuk membaca input dari pengguna.
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Meminta pengguna memasukkan suhu dalam Celsius.
            System.out.println("\nEnter Celsius Temperature : ");
            Double temp = Double.parseDouble(br.readLine());

            // Menyimpan suhu yang dimasukkan oleh pengguna.
            this.temperature = temp;
        } catch (Exception e) {
            // Cetak Stack Trace.
            e.printStackTrace();
        }
    }

    // Implementasi metode abstrak dari antarmuka Temperature untuk mendapatkan suhu
    // dalam Celsius.
    @Override
    public double getTemperature() {
        return temperature;
    }

    // Metode untuk mengonversi suhu dari Celsius ke Fahrenheit.
    public double convertToFahrenheit() {
        // Rumus konversi Celsius ke Fahrenheit: (Celsius * 9/5) + 32
        return (temperature * 9 / 5) + 32;
    }

    // Metode untuk mengonversi suhu dari Celsius ke Kelvin.
    public double convertToKelvin() {
        // Rumus konversi Celsius ke Kelvin: Celsius + 273.15
        return temperature + 273.15;
    }
}

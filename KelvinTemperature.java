
// Import untuk mengakses BufferedReader dan InputStreamReader untuk input.
import java.io.BufferedReader;
import java.io.InputStreamReader;

// Kelas implementasi KelvinTemperature yang merupakan turunan dari kelas abstrak Kelvin.
public class KelvinTemperature extends Kelvin {

    // Variabel untuk menyimpan suhu dalam Kelvin.
    private double temperature;

    // Konstruktor untuk mengambil input suhu dalam Kelvin dari pengguna.
    public KelvinTemperature() {
        try {
            // Membuat objek BufferedReader untuk membaca input dari pengguna.
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Meminta pengguna memasukkan suhu dalam Kelvin.
            System.out.println("\nEnter Kelvin Temperature : ");
            Double temp = Double.parseDouble(br.readLine());

            // Menyimpan suhu yang dimasukkan oleh pengguna.
            this.temperature = temp;
        } catch (Exception e) {
            // Mencetak Stack Trace.
            e.printStackTrace();
        }
    }

    // Implementasi metode abstrak dari antarmuka Temperature untuk mendapatkan suhu
    // dalam Kelvin.
    @Override
    public double getTemperature() {
        return temperature;
    }

    // Metode untuk mengonversi suhu dari Kelvin ke Celsius.
    public double convertToCelsius() {
        // Rumus konversi Kelvin ke Celsius: Kelvin - 273.15
        return temperature - 273.15;
    }

    // Metode untuk mengonversi suhu dari Kelvin ke Fahrenheit.
    public double convertToFahrenheit() {
        // Rumus konversi Kelvin ke Fahrenheit: (Kelvin - 273.15) * 9/5 + 32
        return (temperature - 273.15) * 9 / 5 + 32;
    }
}

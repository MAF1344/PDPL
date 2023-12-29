
// Import Java Input n Reader
import java.io.BufferedReader;
import java.io.InputStreamReader;

// class implementasi
public class CelsiusTemperature extends Celsius {

    private double temperature;

    // Constructor
    public CelsiusTemperature() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("\nEnter Celcius Temperature : ");
            Double temp = Double.parseDouble(br.readLine());
            this.temperature = temp;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    public double convertToFahrenheit() {
        // Rumus konversi Celsius ke Fahrenheit: (Celsius * 9/5) + 32
        return (temperature * 9 / 5) + 32;
    }

    public double convertToKelvin() {
        // Rumus konversi Celsius ke Kelvin: Celsius + 273.15
        return temperature + 273.15;
    }
}

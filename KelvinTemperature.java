
// Import Java Input n Reader
import java.io.BufferedReader;
import java.io.InputStreamReader;

// class implementasi
public class KelvinTemperature extends Kelvin {
    private double temperature;

    public KelvinTemperature() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("\nEnter Kelvin Temperature : ");
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

    public double convertToCelsius() {
        // Rumus konversi Kelvin ke Celsius: Kelvin - 273.15
        return temperature - 273.15;
    }

    public double convertToFahrenheit() {
        // Rumus konversi Kelvin ke Fahrenheit: (Kelvin - 273.15) * 9/5 + 32
        return (temperature - 273.15) * 9 / 5 + 32;
    }
}

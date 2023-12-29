
// Import Java Input n Reader
import java.io.BufferedReader;
import java.io.InputStreamReader;

// class implementasi
public class FahrenheitTemperature extends Fahrenheit {
    private double temperature;

    public FahrenheitTemperature() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("\nEnter Fahrenheit Temperature : ");
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
        // Rumus konversi Fahrenheit ke Celsius: (Fahrenheit - 32) * 5/9
        return (temperature - 32) * 5 / 9;
    }

    public double convertToKelvin() {
        // Rumus konversi Fahrenheit ke Kelvin: (Fahrenheit - 32) * 5/9 + 273.15
        return (temperature - 32) * 5 / 9 + 273.15;
    }
}

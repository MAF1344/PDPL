// class abstrak
public abstract class Celsius implements Temperature {
    @Override
    public abstract double getTemperature();
    public abstract double convertToFahrenheit();
    public abstract double convertToKelvin();
    
}

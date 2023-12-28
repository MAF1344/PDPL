// class abstrak
public abstract class Fahrenheit implements Temperature {
    @Override
    public abstract double getTemperature();
    public abstract double convertToCelsius();
    public abstract double convertToKelvin();

}

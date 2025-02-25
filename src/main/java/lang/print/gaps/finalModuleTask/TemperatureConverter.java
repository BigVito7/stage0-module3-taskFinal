package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){

        double temperatureFahrenheit = (temperatureCelsius * 9.0 / 5) + 32;

        System.out.println(temperatureFahrenheit);
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        converter.toFahrenheit(0);
    }
}

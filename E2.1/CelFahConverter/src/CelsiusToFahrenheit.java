import java.util.Scanner;

public class CelsiusToFahrenheit {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static void main(String[] args) {
        try (
                Scanner scanner = new Scanner(System.in)) {
            for (int i = 1; i <= 4; i++) {
                System.out.print("Enter temperature in Celsius for conversion " + i + ": ");
                double celsius = scanner.nextDouble();
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
            }
        }
    }
}
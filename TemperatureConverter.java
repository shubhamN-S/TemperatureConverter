import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature value
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        // Prompt the user to enter the unit of measurement
        System.out.print("Enter the unit of measurement (C for Celsius, F for Fahrenheit): ");
        char unit = scanner.next().charAt(0);

        // Variable to store the converted temperature
        double convertedTemperature;

        // Perform the conversion based on the unit
        if (unit == 'C' || unit == 'c') {
            // Convert Celsius to Fahrenheit
            convertedTemperature = (temperature * 9/5) + 32;
            System.out.printf("%.2f°C is equivalent to %.2f°F%n", temperature, convertedTemperature);
        } else if (unit == 'F' || unit == 'f') {
            // Convert Fahrenheit to Celsius
            convertedTemperature = (temperature - 32) * 5/9;
            System.out.printf("%.2f°F is equivalent to %.2f°C%n", temperature, convertedTemperature);
        } else {
            System.out.println("Invalid unit of measurement. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
        }

        // Close the scanner
        scanner.close();
    }
}
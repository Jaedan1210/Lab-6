import java.util.Scanner;
public class CelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double temperatureCelsius = 0;
        boolean validInput = false;

        // Input Loop Keep asking until valid input
        while (!validInput) {
            System.out.print("Enter a temperature in Celsius: ");
            String input = in.nextLine();

            try {
                // convert the input to a double
                temperatureCelsius = Double.parseDouble(input);
                validInput = true;  // If parsing succeeds, break the loop
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please type a valid numeric value.");
            }
        }

        // Conversion from Celsius to Fahrenheit
        double temperatureFahrenheit = celsiusToFahrenheit(temperatureCelsius);
        System.out.printf("%.2fC is equivalent to %.2fF%n", temperatureCelsius, temperatureFahrenheit);

        // Run tests for known points and bad input
        System.out.println("\nRunning tests...");
        runTests();

        in.close();  // Close scanner
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to run tests for known freezing and boiling points and also bad input
    public static void runTests() {
        // Test known freezing and boiling points
        System.out.printf("0C will be 32F: %.2fF%n", celsiusToFahrenheit(0));
        System.out.printf("100C will be 212F: %.2fF%n", celsiusToFahrenheit(100));

        // Test bad input handling by catching exception
        try {
            System.out.println("Testing bad input...");
            celsiusToFahrenheit(Double.parseDouble("bad input"));  // Will cause NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Caught bad input as expected.");
        }
    }
}

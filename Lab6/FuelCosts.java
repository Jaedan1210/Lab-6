import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallonsInTank = 0;
        double fuelEfficiency = 0;
        double pricePerGallon = 0;

        // Input for gallons of gas in the tank
        do {
            System.out.print("Please enter the number of gallons of gas in the tank: ");
            String input = in.nextLine();
            try {
                gallonsInTank = Double.parseDouble(input);
                if (gallonsInTank <= 0) {
                    System.out.println("Please enter a positive value.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid numeric value.");
            }
        } while (gallonsInTank <= 0);

        // Input for fuel efficiency in miles per gallon
        do {
            System.out.print("Please enter the fuel efficiency in miles per gallon: ");
            String input = in.nextLine();
            try {
                fuelEfficiency = Double.parseDouble(input);
                if (fuelEfficiency <= 0) {
                    System.out.println("Please enter a positive value.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid numeric value.");
            }
        } while (fuelEfficiency <= 0);


        // Input for price of gas per gallon
        do {
            System.out.print("Enter the price of gas per gallon: ");
            String input = in.nextLine();
            try {
                pricePerGallon = Double.parseDouble(input);
                if (pricePerGallon <= 0) {
                    System.out.println("Please enter a positive value.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid numeric value.");
            }
        } while (pricePerGallon <= 0);

        // Calculate and print results
        double costToDrive100Miles = (100 / fuelEfficiency) * pricePerGallon;
        double distanceFullTank = gallonsInTank * fuelEfficiency;

        System.out.printf("The cost to drive 100 miles is: $%.2f%n", costToDrive100Miles);
        System.out.printf("The car can go %.2f miles with a full tank of gas.%n", distanceFullTank);

        in.close();
        // Close scanner
    }
}


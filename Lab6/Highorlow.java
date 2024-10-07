import java.util.Scanner;
import java.util.Random;
public class Highorlow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;  // Generates a number between 1 and 10
        int userGuess = 0;

        // Input loop for the guess (validating input)
        do {
            System.out.print("Guess a number between 1 and 10: ");
            String input = in.nextLine();
            try {
                userGuess = Integer.parseInt(input);

                if (userGuess < 1 || userGuess > 10) {
                    System.out.println("Please enter a number between 1 and 10.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        } while (userGuess < 1 || userGuess > 10);  // Please repeat until the input is valid

        // Display the random number and check the guess
        System.out.println("The random number was: " + randomNumber);

        if (userGuess == randomNumber) {
            System.out.println("You guessed it right.");
        } else if (userGuess < randomNumber) {
            System.out.println("Too low, Try again please.");
        } else {
            System.out.println("Too high, Try again please.");
        }

        in.close();
        // Close scanner
    }
}

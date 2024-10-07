import java.util.Scanner;
public class Rectangleinfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;

        // Input for the width
        do {
            System.out.print("Please enter the width of the rectangle: ");
            String input = in.nextLine();
            try {
                width = Double.parseDouble(input);
                if (width <= 0) {
                    System.out.println("Please enter a positive number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        } while (width <= 0);



        // Input for the height of the rectangle
        do {
            System.out.print("Please enter the height of the rectangle: ");
            String input = in.nextLine();
            try {
                height = Double.parseDouble(input);
                if (height <= 0) {
                    System.out.println("Please enter a positive number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        } while (height <= 0);

        // Calculate the area, perimeter, and the diagonal
        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt((width * width) + (height * height));

        // Print the results
        System.out.printf("The area of the rectangle is: %.2f%n", area);
        System.out.printf("The perimeter of the rectangle is: %.2f%n", perimeter);
        System.out.printf("The length of the diagonal is: %.2f%n", diagonal);

        in.close();
        // Close scanner
    }
}

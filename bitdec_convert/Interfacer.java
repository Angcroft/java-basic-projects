import java.util.Scanner;

/**
 * The Interfacer class provides methods for interacting with the user through the console.
 * It handles input and output operations to facilitate the conversion process.
 */
public class Interfacer {

    private final Scanner scanner = new Scanner(System.in);

    /**
     * Prompts the user to enter a binary string and returns it.
     * 
     * @return the binary string entered by the user.
     */
    public String getBinaryInput() {
        System.out.print("Enter a binary number: ");
        return scanner.next();
    }

    /**
     * Prompts the user to enter a decimal number and returns it.
     * The method ensures that the input is a valid integer.
     * 
     * @return the decimal number entered by the user.
     */
    public int getDecimalInput() {
        System.out.print("Enter a decimal number: ");
        while (!scanner.hasNextInt()) { // Validate that the input is an integer
            System.out.print("Invalid input. Please enter a valid decimal number: ");
            scanner.next(); // Discard invalid input
        }
        return scanner.nextInt(); // Return the valid decimal input
    }

    /**
     * Displays the decimal equivalent of a binary number to the user.
     * 
     * @param decimal the decimal number to be displayed.
     */
    public void showDecimalOutput(int decimal) {
        System.out.println("Decimal equivalent: " + decimal);
    }

    /**
     * Displays the binary equivalent of a decimal number to the user.
     * 
     * @param binary the binary string to be displayed.
     */
    public void showBinaryOutput(String binary) {
        System.out.println("Binary equivalent: " + binary);
    }
}

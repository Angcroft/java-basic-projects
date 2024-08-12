import java.util.Scanner;

/**
 * The Interfacer class is responsible for handling user input and output.
 * It interacts with the user by displaying menus and capturing their choices.
 */
public class Interfacer {

    private final Scanner scanner = new Scanner(System.in);

    /**
     * Displays the main menu and returns the user's choice.
     * 
     * @return the selected option as an integer.
     */
    public int displayMainMenu() {
        System.out.println("Main Menu:");
        System.out.println("1. Generate Password");
        System.out.println("2. Customize Settings");
        System.out.println("3. Exit Program");
        System.out.print("Enter choice: ");
        return getUserChoice();
    }

    /**
     * Displays the customize settings menu and returns the user's choice.
     * 
     * @return the selected option as an integer.
     */
    public int displayCustomizeMenu() {
        System.out.println("Customize Menu:");
        System.out.println("1. Remove Characters");
        System.out.println("2. Add Characters");
        System.out.println("3. Return to Main Menu");
        System.out.print("Enter choice: ");
        return getUserChoice();
    }

    /**
     * Gets a choice from the user and ensures it is a valid integer.
     * 
     * @return the user's choice as an integer.
     */
    private int getUserChoice() {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number: ");
            scanner.next(); // Discard invalid input
        }
        return scanner.nextInt();
    }

    /**
     * Prompts the user to enter characters to remove or add.
     * 
     * @param prompt The message to display to the user.
     * @return the characters entered by the user as a String.
     */
    public String getCharacters(String prompt) {
        System.out.print(prompt);
        return scanner.next();
    }

    /**
     * Displays a message to the user.
     * 
     * @param message The message to display.
     */
    public void displayMessage(String message) {
        System.out.println(message);
    }
}

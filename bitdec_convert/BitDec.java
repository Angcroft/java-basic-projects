/**
 * The Bitdec class serves as the main entry point for the application.
 * It coordinates the user interaction and conversion processes.
 */
public class Bitdec {

    private final Interfacer interfacer = new Interfacer();
    private final Converter converter = new Converter();

    public static void main(String[] args) {
        // Create an instance of Bitdec and start the application
        Bitdec app = new Bitdec();
        app.run();
    }

    /**
     * Runs the main loop of the application, handling the user's choices and conversions.
     */
    private void run() {
        boolean running = true; // Control variable for the loop
        while (running) {
            showMenu(); // Display the menu options
            int choice = interfacer.getDecimalInput(); // Get the user's choice

            switch (choice) {
                case 1:
                    handleBinaryToDecimal(); // Convert binary to decimal
                    break;
                case 2:
                    handleDecimalToBinary(); // Convert decimal to binary
                    break;
                case 3:
                    running = false; // Exit the loop, thus ending the program
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Displays the menu options to the user.
     */
    private void showMenu() {
        System.out.println("\nBinary-Decimal Converter");
        System.out.println("1. Convert Binary to Decimal");
        System.out.println("2. Convert Decimal to Binary");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    /**
     * Handles the conversion from binary to decimal.
     * It interacts with the Interfacer and Converter classes to perform the conversion.
     */
    private void handleBinaryToDecimal() {
        try {
            String binary = interfacer.getBinaryInput(); // Get binary input from the user
            int decimal = converter.binaryToDecimal(binary); // Convert binary to decimal
            interfacer.showDecimalOutput(decimal); // Show the result to the user
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number. Please try again.");
        }
    }

    /**
     * Handles the conversion from decimal to binary.
     * It interacts with the Interfacer and Converter classes to perform the conversion.
     */
    private void handleDecimalToBinary() {
        int decimal = interfacer.getDecimalInput(); // Get decimal input from the user
        String binary = converter.decimalToBinary(decimal); // Convert decimal to binary
        interfacer.showBinaryOutput(binary); // Show the result to the user
    }
}


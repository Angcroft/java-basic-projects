import java.util.InputMismatchException;
import java.util.Scanner;

public class BitDec {
    // Main Menu Options
    private static final int BIN_TO_DEC = 1;
    private static final int DEC_TO_BIN = 2;
    private static final int BIN_TO_HEX = 3;
    private static final int EXIT_PROGRAM = 4;

    // Submenu Options
    private static final int TRANSFORM_OPTION = 1;
    private static final int RETURN_OPTION = 2;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            Interfacer.mainMenu();
            int choice = getValidIntInput(in);

            switch (choice) {
                case BIN_TO_DEC:
                    handleBinToDec(in);
                    break;

                case DEC_TO_BIN:
                    handleDecToBin(in);
                    break;

                case BIN_TO_HEX:
                    handleBinToHex(in);
                    break;

                case EXIT_PROGRAM:
                    System.out.println("Exiting program...");
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please enter a correct number.");
                    break;
            }
        }
    }

    private static void handleBinToDec(Scanner in) {
        Interfacer.binToDec();
        int binChoice = getValidIntInput(in);

        switch (binChoice) {
            case TRANSFORM_OPTION:
                System.out.println("Input a binary number: ");
                String binInput = in.next();
                try {
                    int decResult = Converter.binToDec(binInput);
                    System.out.println("Decimal value: " + decResult);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid binary number. Please try again.");
                }
                break;

            case RETURN_OPTION:
                break;

            default:
                System.out.println("Invalid option. Please enter a correct number.");
                break;
        }
    }

    private static void handleDecToBin(Scanner in) {
        Interfacer.decToBin();
        int decChoice = getValidIntInput(in);

        switch (decChoice) {
            case TRANSFORM_OPTION:
                System.out.println("Input a decimal number: ");
                int decInput = getValidIntInput(in);
                String binResult = Converter.decToBin(decInput);
                System.out.println("Binary value: " + binResult);
                break;

            case RETURN_OPTION:
                break;

            default:
                System.out.println("Invalid option. Please enter a correct number.");
                break;
        }
    }

    private static void handleBinToHex(Scanner in) {
        Interfacer.binToHex();
        int binHexChoice = getValidIntInput(in);

        switch (binHexChoice) {
            case TRANSFORM_OPTION:
                System.out.println("Input a binary number: ");
                String binHexInput = in.next();
                try {
                    String hexResult = Converter.binToHex(binHexInput);
                    System.out.println("Hexadecimal value: " + hexResult);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid binary number. Please try again.");
                }
                break;

            case RETURN_OPTION:
                break;

            default:
                System.out.println("Invalid option. Please enter a correct number.");
                break;
        }
    }

    private static int getValidIntInput(Scanner in) {
        while (true) {
            try {
                return in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number:");
                in.next(); // Clear the invalid input
            }
        }
    }
}

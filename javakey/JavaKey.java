import java.util.Scanner;

public class JavaKey {
    
    //  Welcomer
    public static final int GENERATE_PASSWORD = 1;
    public static final int CUSTOMIZE_SETTINGS = 2;
    public static final int EXIT_PROGRAM = 3;

    //  Customizer
    public static final int REMOVE_CHARACTERS = 1;
    public static final int ADD_CHARACTERS = 2;
    public static final int RETURN_TO_MAIN_MENU = 3;

    //  Substracter
    public static final int REMOVE_UPPERCASE = 1;
    public static final int REMOVE_LOWERCASE = 2;
    public static final int REMOVE_DIGITS = 3;
    public static final int REMOVE_SPECIAL = 4;
    public static final int REMOVE_RETURN_TO_MAIN_MENU = 5;

    //  Adder
    public static final int ADD_UPPERCASE = 1;
    public static final int ADD_LOWERCASE = 2;
    public static final int ADD_DIGITS = 3;
    public static final int ADD_SPECIAL = 4;
    public static final int ADD_RETURN_TO_MAIN_MENU = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            Interfacer.welcomer();
            int indexnumber = getUserChoice(scanner);

            switch(indexnumber) {
                case GENERATE_PASSWORD:
                    generatePassword(scanner);
                    break;
                case CUSTOMIZE_SETTINGS:
                    customizeSettings(scanner);
                    break;
                case EXIT_PROGRAM:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please enter a correct number.");
            }
        }
    }

    private static int getUserChoice(Scanner scanner) {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;  //  Invalid input
        }
    }

    private static void generatePassword(Scanner scanner) {
        int passwordLength = 16;

        String password = PasswordGenerator.generatePassword(passwordLength);
        System.out.println("Generated password: " + password);

        Interfacer.passGenerated();
        int indexnewnumb = getUserChoice(scanner);

        switch (indexnewnumb) {
            case 1: //  Handle case 1 if needed
                break;
            case 2: //  Handle case 2 if needed
                break;
            case 3:
                scanner.close();
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Please enter a correct number");
        }
    }

    private static void customizeSettings(Scanner scanner) {
        Interfacer.customizer();
        int indexNumberTwo = getUserChoice(scanner);

        switch (indexNumberTwo) {
            case REMOVE_CHARACTERS:
                handleRemoveCharacters(scanner);
                break;
            case ADD_CHARACTERS:
                handleAddCharacters(scanner);
                break;
            case RETURN_TO_MAIN_MENU:
                break;
            default:
                System.out.println("Invalid option. Please enter a correct number");
        }
    }

    private static void handleRemoveCharacters(Scanner scanner) {
        Interfacer.substracter();
        int indexNumberSub = getUserChoice(scanner);

        switch (indexNumberSub) {
            case REMOVE_UPPERCASE:
                System.out.println("Now enter the uppercases you want to remove: ");
                String upperCasers = scanner.nextLine().toUpperCase();
                PasswordGenerator.UPPER.replace(upperCasers, "");
                System.out.println("The following uppercases have been deleted: " + upperCasers);
                break;
            case REMOVE_LOWERCASE:
                System.out.println("Now enter the lowercases you want to remove: ");
                String lowerCasers = scanner.nextLine().toLowerCase();
                PasswordGenerator.LOWER.replace(lowerCasers.toLowerCase(), "");
                System.out.println("The following lowercases have been deleted: " + lowerCasers.toLowerCase());
                break;
            case REMOVE_DIGITS:
                System.out.println("Now enter the digits you want to remove: ");
                String digiters = scanner.nextLine();
                PasswordGenerator.DIGITS.replace(digiters, "");
                System.out.println("The following digits have been deleted: " + digiters);
                break;
            case REMOVE_SPECIAL:
                System.out.println("Now enter the special characters you want to remove: ");
                String spCharacters = scanner.nextLine();
                PasswordGenerator.SPECIAL.replace(spCharacters, "");
                System.out.println("The following special characters have been deleted: " + spCharacters);
                break;
            case REMOVE_RETURN_TO_MAIN_MENU:
                break;
            default:
                System.out.println("Invalid option. Please enter a correct number.");
        }
    }

    private static void handleAddCharacters(Scanner scanner) {
        Interfacer.adder();
        int indexNumberAdd = getUserChoice(scanner);

        switch (indexNumberAdd) {
            case ADD_UPPERCASE:
                System.out.println("Now enter the uppercases you want to add: ");
                String upperCasers = scanner.nextLine().toUpperCase();
                
                while (!isValid(upperCasers, PasswordGenerator.UPPER)) {
                    System.out.println("Invalid input. Only uppercases are allowed.");
                    System.out.println("Now enter the uppercases you want to add: ");
                    upperCasers = scanner.nextLine().toUpperCase();
                }
                PasswordGenerator.LOWER += upperCasers;
                System.out.println("The following uppercases have been added: " + upperCasers);
                break;
            case ADD_LOWERCASE:
                System.out.println("Now enter the lowercases you want to add: ");
                String lowerCasers = scanner.nextLine().toLowerCase();
                
                while (!isValid(lowerCasers, PasswordGenerator.LOWER)) {
                    System.out.println("Invalid input. Only lowercases are allowed.");
                    System.out.println("Now enter the lowercases you want to add: ");
                    lowerCasers = scanner.nextLine().toLowerCase();
                }
                PasswordGenerator.LOWER += lowerCasers;
                System.out.println("The following lowercases have been added: " + lowerCasers);
                break;
            case ADD_DIGITS:
                System.out.println("Now enter the digits you want to add: ");
                String digiters = scanner.nextLine();
                
                while (!isValid(digiters, PasswordGenerator.DIGITS)) {
                    System.out.println("Invalid input. Only digits are allowed.");
                    System.out.println("Now enter the digits you want to add: ");
                    digiters = scanner.nextLine();
                }
                PasswordGenerator.DIGITS += digiters;
                System.out.println("The following digits have been added: " + digiters);
                break;
            case ADD_SPECIAL:
                System.out.println("Now enter the special characters you want to add: ");
                String spCharacters = scanner.nextLine();

                while (!isValid(spCharacters, PasswordGenerator.SPECIAL)) {
                    System.out.println("Invalid input. Only special characters are allowed.");
                    System.out.println("Now enter the special characters you want to add: ");
                    spCharacters = scanner.nextLine();
                }
                PasswordGenerator.SPECIAL += spCharacters;
                System.out.println("The following special characters have been added: " + spCharacters);
                break;
            case ADD_RETURN_TO_MAIN_MENU:
                break;
            default:
                System.out.println("Invalid option. Please enter a correct number.");
        }
    }

    private static boolean isValid(String input, String validCharacters) {
        for (char c : input.toCharArray()) {
            if (validCharacters.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}

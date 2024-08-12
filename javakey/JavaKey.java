/**
 * The JavaKey class is the entry point of the application. It manages the application flow.
 */
public class JavaKey {

    private final Interfacer interfacer = new Interfacer();
    private final PasswordGenerator passwordGenerator = new PasswordGenerator();

    public static void main(String[] args) {
        JavaKey app = new JavaKey();
        app.run();
    }

    /**
     * Runs the main loop of the application, handling user choices and invoking the necessary methods.
     */
    private void run() {
        boolean running = true;
        while (running) {
            int choice = interfacer.displayMainMenu();
            switch (choice) {
                case 1:
                    generatePassword();
                    break;
                case 2:
                    customizeSettings();
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    interfacer.displayMessage("Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Handles password generation by asking the user for the desired length and displaying the result.
     */
    private void generatePassword() {
        String password = passwordGenerator.generatePassword(16);
        interfacer.displayMessage("Generated Password: " + password);
    }

    /**
     * Handles the customization of settings, such as adding or removing characters from the character set.
     */
    private void customizeSettings() {
        int choice = interfacer.displayCustomizeMenu();
        switch (choice) {
            case 1:
                String charsToRemove = interfacer.getCharacters("Enter characters to remove: ");
                passwordGenerator.removeCharacters(charsToRemove);
                interfacer.displayMessage("Characters removed: " + charsToRemove);
                break;
            case 2:
                String charsToAdd = interfacer.getCharacters("Enter characters to add: ");
                passwordGenerator.addCharacters(charsToAdd);
                interfacer.displayMessage("Characters added: " + charsToAdd);
                break;
            case 3:
                interfacer.displayMessage("Returning to main menu.");
                break;
            default:
                interfacer.displayMessage("Invalid choice. Please try again.");
        }
    }
}

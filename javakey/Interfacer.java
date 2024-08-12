import java.util.scanner

/**
    The Interfacer class is responsible for handling user input and output.
    It interacts with the user by displaying menus annd capturing their choices.
**/

public class Interfacer {
    public static void welcomer() {
        System.out.println("Select one of the following options: ");
        System.out.println("1. Generate Password");
        System.out.println("2. Personalize Password");
        System.out.println("3. Exit");
    }

    public static void customizer() {
        System.out.println("Please select the following customizer option: ");
        System.out.println("1. Substract characters");
        System.out.println("2. Add Characters");
        System.out.println("3. Return to main menu");
    }

    public static void substracter() {
        System.out.println("Please select what kind of character you want to substract: ");
        System.out.println("1. Upper");
        System.out.println("2. Lower");
        System.out.println("3. Digit");
        System.out.println("4. Special");
        System.out.println("5. Cancel");
    }

    public static void adder() {
        System.out.println("Please select what kind of character you want to add: ");
        System.out.println("1. Upper");
        System.out.println("2. Lower");
        System.out.println("3. Digit");
        System.out.println("4. Special");
        System.out.println("5. Cancel");
    }

    public static void passGenerated() {
        System.out.println("Password generated. What you want to do next?: ");
        System.out.println("1. Generate another password");
        System.out.println("2. Personalize password");
        System.out.println("3. Exit");
    }
}

import java.security.SecureRandom;

public class PasswordGenerator {
    public static String UPPER = "ABCDEFGHIJKLMOPQRSTUVWXYZ";
    public static String LOWER = "abcdefghijklmnopqrstuvwxyz";
    public static String DIGITS = "0123456789";
    public static String SPECIAL = "!@#$%^&*()-_=+[]{}|;:,.<>?";

    private static final String ALL_CHARACTERS = UPPER + LOWER + DIGITS + SPECIAL;
    private static final SecureRandom RANDOM = new SecureRandom();

    public static String generatePassword(int length) {
        if (length < 12) {
            throw new IllegalArgumentException("Password length should be at least 12 characters");
        }

        StringBuilder password = new StringBuilder(length);
        password.append(UPPER.charAt(RANDOM.nextInt(UPPER.length())));
        password.append(LOWER.charAt(RANDOM.nextInt(LOWER.length())));
        password.append(DIGITS.charAt(RANDOM.nextInt(DIGITS.length())));
        password.append(SPECIAL.charAt(RANDOM.nextInt(SPECIAL.length())));

        for (int i = 4; i < length; i++) {
            password.append(ALL_CHARACTERS.charAt(RANDOM.nextInt(ALL_CHARACTERS.length())));
        }

        return shuffleString(password.toString());
    }

    private static String shuffleString(String input) {
        char[] characters = input.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            int randomIndex = RANDOM.nextInt(characters.length);
            char temp = characters[i];
            characters[i] = characters[randomIndex];
            characters[randomIndex] = temp;
        }

        return new String(characters);
    }

    public static void removeUpperCases(String upperCasers) {
        for (char c : upperCasers.toCharArray()) {
            UPPER = UPPER.replace(String.valueOf(c), "");
        }
    }

    public static void removeLowerCases(String lowerCasers) {
        for (char c : lowerCasers.toCharArray()) {
            LOWER = LOWER.replace(String.valueOf(c), "");
        }
    }

    public static void removeDigits(String digiters) {
        for (char c : digiters.toCharArray()) {
            DIGITS = DIGITS.replace(String.valueOf(c), "");
        }
    }

    public static void removeSpecialChars(String spCharacters) {
        for (char c : spCharacters.toCharArray()) {
            SPECIAL = SPECIAL.replace(String.valueOf(c), "");
        }
    }

    public static void addUpperCases(String upperCasers) {
        UPPER += upperCasers;
    }

    public static void addLowerCases(String lowerCasers) {
        LOWER += lowerCasers;
    }

    public static void addDigits(String digiters) {
        DIGITS += digiters;
    }

    public static void addSpecialChars(String spCharacters) {
        SPECIAL += spCharacters;
    }
}

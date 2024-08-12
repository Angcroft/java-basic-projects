import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/**
 * The PasswordGenerator class generates passwords based on customizable character sets.
 * It uses SecureRandom for cryptographically strong random number generation.
 */
public class PasswordGenerator {

    private final SecureRandom random = new SecureRandom();
    private final List<Character> characterSet = new ArrayList<>();

    /**
     * Adds characters to the character set.
     * 
     * @param chars The characters to add.
     */
    public void addCharacters(String chars) {
        for (char c : chars.toCharArray()) {
            if (!characterSet.contains(c)) {
                characterSet.add(c);
            }
        }
    }

    /**
     * Removes characters from the character set.
     * 
     * @param chars The characters to remove.
     */
    public void removeCharacters(String chars) {
        for (char c : chars.toCharArray()) {
            characterSet.remove(Character.valueOf(c));
        }
    }

    /**
     * Generates a password with a specified length using the current character set.
     * 
     * @param length The length of the password to generate.
     * @return The generated password as a String.
     */
    public String generatePassword(int length) {
        if (characterSet.isEmpty()) {
            throw new IllegalStateException("Character set is empty. Add characters before generating a password.");
        }

        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterSet.size());
            password.append(characterSet.get(index));
        }
        return password.toString();
    }
}

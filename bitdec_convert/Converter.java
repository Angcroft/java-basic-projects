/**
 * The Converter class contains methods for converting between binary and decimal numbers.
 * It handles the core logic of the conversion processes.
 */
public class Converter {

    /**
     * Converts a binary string to its decimal equivalent.
     * 
     * @param binaryStr the binary string to be converted.
     * @return the decimal equivalent of the binary string.
     * @throws NumberFormatException if the binary string is not valid.
     */
    public int binaryToDecimal(String binaryStr) throws NumberFormatException {
        // Convert the binary string to a decimal integer using base 2
        return Integer.parseInt(binaryStr, 2);
    }

    /**
     * Converts a decimal integer to its binary string equivalent.
     * 
     * @param decimal the decimal number to be converted.
     * @return the binary string equivalent of the decimal number.
     */
    public String decimalToBinary(int decimal) {
        // Convert the decimal number to a binary string
        return Integer.toBinaryString(decimal);
    }
}

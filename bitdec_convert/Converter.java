public class Converter {

    // Binary to Decimal
    public static int binToDec(String binary) {
        if (!binary.matches("[01]+")) {
            throw new NumberFormatException("Invalid binary number");
        }
        int decimal = 0;
        int length = binary.length();
        for (int i = 0; i < length; i++) {
            if (binary.charAt(length - 1 - i) == '1') {
                decimal += 1 << i; // Use bitwise shift for power of 2
            }
        }
        return decimal;
    }

    // Decimal to Binary
    public static String decToBin(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    // Binary to Hexadecimal
    public static String binToHex(String binary) {
        int decimal = binToDec(binary);
        return Integer.toHexString(decimal).toUpperCase();
    }
}

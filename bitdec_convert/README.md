# BitDec-Convert

## Overview
**BitDecConvert** is a console-based Java application designed to help users understand the process of converting numbers between binary and decimal formats. It is structured to be straightforward and easy to understand, making it an ideal learning resource for beginners.

## Features
* **Binary to Decimal Conversion:** Convert binary numbers (base 2) to their decimal equivalents (base 10).
* **Decimal to Binary Conversion:** Convert decimal numbers (base 10) to their binary equivalents (base 2).
* **User-Friendly Interface:** Simple text-based interface for easy interaction.

## Getting Started

### Prerequisites
Ensure you have the following installed
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) version 8 or above.

### Installation
1. **Clone the repository**:
   ```bash
   git clone https://github.com/Angcroft/java-basic-projects.git
   ```
2. **Navigate to the Javakey directory**:
   ```bash
   cd java-basic-projects/bitdec-convert
   ```
3. **Compile the Java files**:
   ```bash
   javac *.java
   ```
4. **Run the application**:
   ```bash
   java Bitdec
   ```

## Usage
Once the program is running, you will be presented with the main menu:

```
Binary-Decimal Converter
1. Convert Binary to Decimal
2. Convert Decimal to Binary
3. Exit
Enter your choice:
```

### Convert Binary to Decimal
- Select "1" to input binary and converting it to decimal number.
- The generated decimal number will be displayed on the screen.

### Convert Decimal to Binary
- Select "2" on the contrary, where you can input decimal numbers to convert them to binary.
- The generated binary number will be displayed on the screen.

### Exit Program
- Select "3" to exit the application.

### Code Structure
The project is divided into three Java Classes:
1. **Bitdec.java**:
   - The main class that coordinates user input and conversion logic.

2. **Converter.java**:
   - Contains methods for converting between binary and decimal numbers.

3. **Interfacer.java**:
   - Manages user interaction, including input and output operations.

## Educational Notes
- **Integer.parseInt and Integer.toBinaryString**: These are the core methods used for converting between binary and decimal numbers. `Integer.parseInt` with a radix of 2 is used to interpret a binary string as a decimal integer, while `Integer.toBinaryString` is used to convert a decimal integer to a binary string.
- **Exception Handling**: The `Converter.java` class includes exception handling (specifically `NumberFormatException`) to manage cases where the user inputs an invalid binary string, ensuring the program doesn't crash and can handle errors carefully.
- **Modular Design**: The application is designed using a modular approach, with separate classes handling different responsibilities. This separation of concerns makes the code easier to maintain and understand.
- **Input and Output Handling**: The `Interfacer.java` class abstracts the user input and output operations, allowing the main logic in `Bitdec.java` to remain focused on processing and control flow rather than on user interaction details.

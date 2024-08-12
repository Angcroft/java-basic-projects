# Javakey

## Overview
**Javakey** is a command-line interface (CLI) password generator written in Java. It allows users to generate secure passwords with customizable character sets, making it a useful tool for educational purposes. This project is ideal for beginners learning Java, as it covers key concepts such as user input handling, random number generation, and object-oriented programming.

## Features
- **Random Password Generation**: Generate passwords with a default length of 16 characters.
- **Customizable Character Set**: Users can customize the character sets by adding or removing characters, including uppercase, lowercase, digits, and special characters.
- **User-Friendly Interface**: Simple CLI-based menu system to navigate through the application.

## Getting Started

### Prerequisites
Ensure you have the following installed:
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) version 8 or above.

### Installation
1. **Clone the repository**:
   ```bash
   git clone https://github.com/Angcroft/java-basic-projects.git
   ```
2. **Navigate to the Javakey directory**:
   ```bash
   cd java-basic-projects/javakey
   ```
3. **Compile the Java files**:
   ```bash
   javac *.java
   ```
4. **Run the application**:
   ```bash
   java JavaKey
   ```

## Usage
Once the program is running, you will be presented with the main menu:

```
Main Menu:
1. Generate Password
2. Customize Settings
3. Exit Program
```

### Generate Password
- Select "1" to generate a password with the current settings. (Note: this will not work out as there isn't any character yet, so you should customize adding characters before).
- The generated password will be displayed on the screen.

### Customize Settings
- Select "2" to customize the character set used in password generation.
- You can:
  - **Remove Characters**: Specify characters to remove from the set.
  - **Add Characters**: Add specific characters to the set.

### Exit Program
- Select "3" to exit the application.

## Code Structure
The project is divided into three Java classes:

1. **JavaKey.java**: 
   - This is the entry point of the application, managing the main loop and user interactions.

2. **PasswordGenerator.java**: 
   - Handles the core logic for password generation, including adding/removing characters and generating random passwords.

3. **Interfacer.java**: 
   - Manages user interactions, including displaying menus and capturing user input.

## Educational Notes
- **SecureRandom**: Used in `PasswordGenerator.java` for generating cryptographically secure random numbers.
- **List<Character>**: Dynamic character set storage, allowing easy addition and removal of characters.
- **Switch Statements**: Utilized in `JavaKey.java` for managing user choices efficiently.
- **Exception Handling**: The program includes error handling to manage invalid inputs and edge cases.

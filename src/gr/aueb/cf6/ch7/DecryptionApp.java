package gr.aueb.cf.ch0;

import java.util.Scanner;

public class DecryptionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string to decrypt:");
        String input = scanner.nextLine();
        String decryptedString = "";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i); // retrieves the character at the current index i from the input string and assigns it to the variable currentChar.
            char decryptedChar = (char) (currentChar - 1); // Shift each character by one position backward in ASCII.
            decryptedString += decryptedChar;
        }

        System.out.println("Decrypted string: " + decryptedString);
    }
}

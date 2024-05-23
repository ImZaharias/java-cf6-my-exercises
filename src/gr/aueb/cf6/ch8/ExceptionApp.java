package gr.aueb.cf.ch0;

import java.util.Scanner;

public class ExceptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Main loop for displaying menu and getting user input
        while (true) {
            menuChoice();
            int choice = getChoice(in);
            try {
                printChoice(choice);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            // Exit the loop if user chooses option 5
            if (choice == 5) {
                System.out.println("bye bye thank you for playing");
                break;
            }
        }
    }

    /**
     * Displays a menu with options 1 to 4 and 5 for Exit.
     *
     */
    public static void menuChoice() {
        System.out.println("1. 'Football'");
        System.out.println("2. 'Basketball'");
        System.out.println("3. 'Tennis'");
        System.out.println("4. 'Swimming'");
        System.out.println("5. No thanks");
    }

    /**
     * Reads the choice using Scanner. If the user provides a non-integer
     * input, it handles it appropriately with state-testing.
     *
     * @return
     */
    public static int getChoice(Scanner in) {

        while (true) {
            // Check if input is an integer
            if (in.hasNextInt()) {
                int choice = in.nextInt();
                return choice;
            } else {
                // If input is not an integer, prompt the user to enter a valid number
                System.out.println("Error input. Please insert a number between 1 and 5.");
                in.next(); // Consume invalid input
            }
        }
    }

    /**
     * Displays the user's choice. If the choice is not between 1-5, it throws
     * an IllegalArgumentException, which is caught in the main method.
     *
     * @param choice
     */
    public static void printChoice(int choice) {
        if (choice < 1 || choice > 5) {
            // Throw IllegalArgumentException if choice is not between 1 and 5
            throw new IllegalArgumentException("error input. Please insert a number between 1 and 5.");
        }
        // Display the chosen option based on the input
        switch (choice) {
            case 1:
                System.out.println("1. Football with C. Ronaldo!");
                break;
            case 2:
                System.out.println("2. Basketball with Steph Curry!");
                break;
            case 3:
                System.out.println("3. Tennis with Novak Djokovic!");
                break;
            case 4:
                System.out.println("4. Swimming with Michael Phelps!");
                break;
            case 5:
                System.out.println("5. No thanks!");
                break;
        }
    }
}

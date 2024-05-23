package gr.aueb.cf.ch0;

import java.util.Scanner;

public class Menu2App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;

        while (true) {
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            System.out.println("Παρακαλώ επιλέξτε μια επιλογή ");

            i = in.nextInt();

            if (i == 1) {
                System.out.println("1. Εισαγωγή");
                System.out.println();

            } else if (i == 2) {
                System.out.println("2. Διαγραφή");
                System.out.println();

            } else if (i == 3) {
                System.out.println("3. Ενημέρωση");
                System.out.println();

            } else if (i == 4) {
                System.out.println("4. Αναζήτηση");
                System.out.println();

            } else if (i == 5) {
                System.out.println("5. Έξοδος");
                System.out.println();
                break;
            } else {
                System.out.println("Μη έγκυρη επιλογή. Παρακαλώ προσπαθήστε ξανά");
                System.out.println();

            }
        }
    }
}

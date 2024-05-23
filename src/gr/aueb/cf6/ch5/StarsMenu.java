package gr.aueb.cf.ch0;

import java.util.Scanner;

public class StarsMenu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
            System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
            System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
            System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1-n");
            System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n-1");
            System.out.println("6. Εξοδος από το πρόγραμμα");
            System.out.print("Δώστε επιλογή: ");

            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Δώστε αριθμό για αστεράκια ");
                    int StarsH = in.nextInt();
                    StarsH(StarsH);
                    break;
                case 2:
                    System.out.print("Δώστε αριθμό για αστεράκια ");
                    int StarsV = in.nextInt();
                    StarsV(StarsV);
                    break;
                case 3:
                    System.out.print("Δώστε αριθμό για αστεράκια ");
                    int StarsHV = in.nextInt();
                    StarsHV(StarsHV);
                    break;
                case 4:
                    System.out.print("Δώστε αριθμό για αστεράκια ");
                    int StarsAsc = in.nextInt();
                    StarsAsc(StarsAsc);
                    break;
                case 5:
                    System.out.print("Δώστε αριθμό για αστεράκια ");
                    int StarsDesc = in.nextInt();
                    StarsDesc(StarsDesc);
                    break;
                case 6:
                    System.out.println("Έξοδος απο το πρόγραμμα ");
                    break;
                default:
                    System.out.println("Μη έγκυρη επιλογή.Παρακαλώ προσπαθήστε ξανά ");
                    break;
            }
        } while (choice != 6);

        System.out.println("Thanks for playing!");

    }

    public static void StarsH(int n) {

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void StarsV(int n) {

        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    public static void StarsHV(int n) {

        for (int i = 0; i <= n; i++) {
            StarsH(n);
        }
    }

    public static void StarsAsc(int n) {

        for (int i = 1; i <= n; i++) {
            StarsH(i);
        }
    }

    public static void StarsDesc(int n) {

        for (int i = n; i >= 1; i--) {
            StarsH(i);
        }
    }
}

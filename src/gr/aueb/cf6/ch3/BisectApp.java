package gr.aueb.cf.ch0;

import java.util.Scanner;

public class BisectApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;
        final int NUMBER1 = 100;
        final int NUMBER2 = 400;

        System.out.println("Please insert a year!");
        year = in.nextInt();

        if ((year % NUMBER1 == 0) && (year % NUMBER2 != 0)) {
            System.out.println("Bisect!");
        } else {
            System.out.println("Non Bisect");
        }
    }
}

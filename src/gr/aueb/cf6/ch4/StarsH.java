package gr.aueb.cf.ch0;

import java.util.Scanner;

public class StarsH {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 0;

        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }
}

package gr.aueb.cf.ch0;

import java.util.Scanner;

public class DayMonthYearApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;
        int formattedYear = 0;

        System.out.println("Please insert Day Month Year" );
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();

        formattedYear = year % 100;

        System.out.printf("%02d/%02d/%02d", day, month, formattedYear);
    }
}
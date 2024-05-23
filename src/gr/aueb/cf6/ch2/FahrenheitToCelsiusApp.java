package gr.aueb.cf.ch0;

import java.util.Scanner;

public class FahrenheitToCelsiusApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int fahrenheit = 0;
        int celsius = 0;

        System.out.println("Please insert temperature in Fahrenheit! ");
        fahrenheit = in.nextInt();

        celsius = 5 * (fahrenheit - 32) / 9;

        System.out.printf("Temperature in Celsius is: %d °C", celsius);
    }
}

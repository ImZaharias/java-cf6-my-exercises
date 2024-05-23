package gr.aueb.cf.ch0;

/**
 *  Finds the second minimum value in an array.
 *
 */

public class SecondMinApp {

    public static void main(String[] args) {
        int[] arr = {6, 2, 8, 5, 9, 4, 10, 7};

        int minValue = Integer.MAX_VALUE;
        int secMinValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                secMinValue = minValue;
                minValue = arr[i];
            } else if (arr[i] < secMinValue) {
                secMinValue = arr[i];
            }
        }

        System.out.printf("Second Min Value: %d\n", secMinValue);
    }
}

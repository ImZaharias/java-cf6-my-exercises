package gr.aueb.cf.ch0;

import java.util.Scanner;

public class PredicatesApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert 6 numbers from 1 - 49!");

        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            int num;
            do {
                num = in.nextInt();
                if (num < 1 || num > 49) {
                    System.out.println("Number must be between 1 and 49.");
                }else {
                    arr[i] = num;
                }
            } while (num < 1 || num > 49);
        }

        System.out.println("Not over Three Evens: " + notMoreThanThreeEvens(arr));
        System.out.println("Not over Three Odds: " + notMoreThanThreeOdds(arr));
        System.out.println("Not over Three Consecutive: " + notMoreThanThreeConsecutive(arr));
        System.out.println("Not over Three last digit: " + notMoreThreeSameEndings(arr));
        System.out.println("Not over Three in the same decade: " + notMoreThanThreeSameNumbersInDecade(arr));
    }

    /**
     *  Traverses an array and see if the array got no more
     *  than 3 even numbers.
     *
     * @param arr       array
     * @return          true if contains no more than 3 evens, false otherwise.
     */
    public static boolean notMoreThanThreeEvens(int[] arr) {
        if (arr == null) return false;
        int evens = 0;
        for (int item : arr) {
            if (item % 2 == 0) {
                evens++;
            }
        }
        return evens <= 3;
    }

    /**
     *  Traverses an array and see if the array got no more
     *  than 3 odd numbers.
     *
     * @param arr       array
     * @return          true if contains no more than 3 odds, false otherwise.
     */
    public static boolean notMoreThanThreeOdds(int[] arr) {
        if (arr == null) return false;
        int odds = 0;
        for (int item : arr) {
            if (item % 2 != 0) {
                odds++;
            }
        }
        return odds <= 3;
    }

    /**
     *  Traverses an array and see if the array got no more
     *  than 3 consecutive numbers.
     *
     * @param arr       array
     * @return          true if contains no more than 3 consecutive, false otherwise.
     */
    public static boolean notMoreThanThreeConsecutive(int[] arr) {
        if (arr == null || arr.length < 3) return true;

        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] == arr[i + 1] + 1 && arr[i + 1] == arr[i + 2] + 1) ||
                    (arr[i] == arr[i + 1] - 1 && arr[i + 1] == arr[i + 2] - 1)) {
                return false;
            }
        }
        return true;
    }


    /**
     *  Traverses an array and see if the array got no three or more
     *  of the same last digit.
     *
     * @param arr       array
     * @return          true if contains no more than three of the same last digit
     *                  false otherwise.
     */
    public static boolean  notMoreThreeSameEndings(int[] arr) {
        if (arr == null) return false;
        int[] endings = new int[10];
        boolean hasSameEnding = false;

        for (int item : arr) {
            endings[item % 10]++;
        }
        for (int item : endings) {
            if (item >= 3) {
                return true ;
            }
        }
        return false;
    }

    /**
     *  Traverses an array and see if the array got no 3 numbers
     *  in the same decade.
     *
     * @param arr       array
     * @return          true if contains no more than 3 numbers in the same decade, false otherwise.
     */
    public static boolean notMoreThanThreeSameNumbersInDecade(int[] arr) {
        if (arr == null) return false;

        int [] decades = new int[5];
        for (int num : arr) {
               int decade = (num - 1) / 10;
               decades[decade]++;
        }
        for (int count : decades) {
            if (count >= 3) {
                return true;
            }
        }
        return false;
    }
}

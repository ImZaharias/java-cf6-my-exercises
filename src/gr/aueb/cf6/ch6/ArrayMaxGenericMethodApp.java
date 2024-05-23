package gr.aueb.cf.ch0;

/**
 * Finds the max value and position of an int-array
 * based on a generic method.
 */

public class ArrayMaxGenericMethodApp {

    public static void main(String[] args) {
        int[] grades = {3, 6, 7, 3, 5, 9, 4, 10, 1, 7, 4 };
        int maxPosition;

        maxPosition = getMaxPosition(grades, 0, grades.length - 1);


        System.out.printf("Max value: %d, Max position: %d", grades[maxPosition], maxPosition + 1);
    }

    /**
     * Returns the position of the max value in a source array.
     *
     * @param arr
     * @param low
     * @param high
     * @return
     */
    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition = high;
        int maxValue;

        if (low < 0 || (high > arr.length - 1)) {
            System.out.println("Error in array dimensions");
            return -1;
        }

        maxValue = arr[high];
        for (int i = low; i <= high; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }

        return maxPosition;
    }
}

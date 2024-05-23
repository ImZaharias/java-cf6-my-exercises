package gr.aueb.cf.ch0;

public class ArrayMethodsApp {

    public static void main(String[] args) {
        int[] numbers = {5, 3, 7, 9, 2, 10 ,8 ,4 ,6};

        System.out.println("Position of 7: " + position(numbers));
        filterEven(numbers);
        int[] mappedArray = mapping(numbers);
        System.out.println("Mapped array:");
        for (int num : mappedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Any positive number? " + anyPositive(numbers));
        System.out.println("Are all numbers positive? " + allPositive(numbers));
    }

    /**
     * Search and returns the position(index) of an element.
     *
     * @param array
     * @return
     */
    public static int position (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 7) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Filter and returns Even numbers.
     *
     * @param array
     */
    public static void filterEven (int[] array) {
        System.out.println("Ζυγοί αριθμοί: ");
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    /**
     *  Double the value of each item of the
     *  array.
     *
     * @param array
     * @return
     */
    public static int[] mapping (int[] array) {
        int[] arrayToReturn = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayToReturn[i] = array[i] * 2;
        }
        return arrayToReturn;
    }

    /**
     *  if any of the numbers are positive it is true
     *  else false
     *
     * @param array true - false
     * @return
     */
    public static boolean anyPositive (int[] array) {
        for (int num : array) {
            if (num > 0 ) {
                return true;
            }
        }
        return false;
    }

    /**
     *  if all numbers are positive it is true
     *  else false
     *
     * @param array true - false
     * @return
     */
    public static boolean  allPositive (int[] array) {
        for (int num : array) {
            if (num <= 0) {
                return false;
            }
        }
        return true;
    }
}

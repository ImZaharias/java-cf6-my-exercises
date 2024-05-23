package gr.aueb.cf.ch0;

public class IndexLowHighArray {

    public static void main(String[] args) {

        int[] arr = {0, 1, 4, 5, 6, 6, 7, 8, 8, 8, 8, 8,};
        int key = 8;

        int[] result = getLowAndHighIndexOf(arr, key);
        System.out.println("Low Index: " + result[0]);
        System.out.println("High Index: " + result[1]);
    }

    /**
     *  Find and returns low and high index of an array,
     *  for a number key as a parameter.
     * @param arr
     * @param key
     * @return
     */
    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int low = -1; //αρχικοποίηση στο -1
        int high = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                low = i;
                break;
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == key) {
                high = i;
                break;
            }
        }
        return new int[]{low, high};
    }
}

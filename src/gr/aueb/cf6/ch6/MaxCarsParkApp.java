package gr.aueb.cf.ch0;

/**
 *  Διαβάζει και εκτυπώνει τον μέγιστο αριθμό αυτοκινήτων
 *  που είναι σταθμευμένα το ίδιο χρονικό διάστημα.
 */

public class MaxCarsParkApp {

    public static void main(String[] args) {
        // First element time car entered (1)
        // Second element time car left (0)
        int arr[][] = {{1012, 1}, {1136, 0},
                       {1317, 1}, {1417, 0},
                       {1015, 1}, {1020, 0}};

        // Bubble sort. Sorts the array 'arr' based of entry, exit
        // of cars in ascending order ot time.
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j][0] > arr[j + 1][0]) {
                    int[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int maxCarsParked = 0;
        int currentCarsParked = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i][1] == 1) {                          // Checks if there is a car parked at the current spot,
                currentCarsParked++;                       // If there is, increment the count of parked cars by 1.
                if (currentCarsParked > maxCarsParked) {   // Checks if the current number of parked cars is
                    maxCarsParked = currentCarsParked;     // greater than the maximum number of cars parked simultaneously.
                }
            } else {
                currentCarsParked--;                       // If there is no car parked at the current spot, decrement by 1.
            }
        }

        System.out.println("Maximum number of cars parked at the same time: " + maxCarsParked);
    }
}

// ShellSort

import java.util.ArrayList;

public class ShellSort {


    public static int exchanges;

    public static int comparisons;

    public static void Sort(ArrayList<Integer> arrayList, int numOfItems) {

        int half = 1;
        exchanges = 0;
        comparisons = 0;
        while (half < numOfItems * 4) {
           SegmentedInsert.SegInsertionSort(arrayList, numOfItems, half);
           half = 3 * half + 1;
        }
        System.out.println("ShellSort Sort: Number of Exchanges: " + exchanges);
        System.out.println("ShellSort Sort: Number of Comparisons: " + comparisons);


    }

}

// Class for the QuickSort Algorithm

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class QuickTest {

    public static int exchanges;
    public static int comparisons;

    public static void QuickSort(ArrayList<Integer> array) {

        exchanges = 0;
        comparisons = 0;

        QuickSortHelper(array, 0, array.size() - 1);
        System.out.println(" Number of Comparisons " + QuickTest.comparisons);
        System.out.println(" Number of Exchanges " + QuickTest.exchanges);

    }

    public static void QuickSortHelper(ArrayList<Integer> array, int low, int high) {

        //int count = 0;
        // if statement to check if you are attempting to sort a subarray of only one element
        // element that is <> pivot and is already sorted
        if (low >= high) {
            return;
        }

        int temp;
        // Select the last point (high) in the algorithm to be the pivot
        // low -> beginning point of the array
        int pivot = array.get(high);

        int leftP = Partition(array, low, high, pivot);

        // recursively call quicksort for the left-hand side (leftP is going to be the element before the current position of
        // pivot after the partitioning has taken place
        QuickSortHelper(array, low, leftP - 1);

        // recursively call quicksort for the right-hand side (now pass in the element to the right of pivots
        // current position (leftP + 1)
        QuickSortHelper(array, leftP+ 1, high);


    }

    // partition method:
    private static int Partition(ArrayList<Integer> array, int low, int high, int pivot) {
        // leftP is a pointer that starts at the beginning of the array
        int leftP = low;
        // rightP is a pointer that is initialized to be at the end of the array
        int rightP = high;

        while (leftP < rightP) {

            // continue looping until leftP is > pivot OR leftP hits rightP with
            // the following loop
            while (array.get(leftP) <= pivot && leftP < rightP) {
                // increment the left pointer
                leftP++;
                QuickTest.comparisons++;
            }

            /*
            Do the same for rightP until it's less than pivot OR rightP decrements
            and it eventually hits the left pointer
             */
            while(array.get(rightP) >= pivot && rightP > leftP) {
                // decrement the right pointer
                rightP--;
                QuickTest.comparisons++;
            }
            QuickTest.Swap(array, leftP, rightP);
            QuickTest.exchanges++;
        }
        Swap(array, leftP, high);
        return leftP;
    }

    // swap method (swaps two indexes in the arrayList

    public static void Swap(ArrayList<Integer> array, int index1, int index2) {
        Collections.swap(array, index1, index2);
    }


}

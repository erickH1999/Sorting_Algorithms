// Erick Huerta

/*
    Example of the recursive form
    of MergeSort

    This version is done with arrays
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] numList = new int[10];

        for (int i = 0; i < numList.length; i++) {
            numList[i] = rand.nextInt(100000);
        }

        // test ordered list
        System.out.println(" ========================= ");
        System.out.println(" Testing MergeSort with small data");

        MergeSort obj = new MergeSort();
        
        System.out.println("before sorting: ");
        MergeSort.Print(numList);
        MergeSort.Sort(numList);
        System.out.println("After Sorting: ");
        MergeSort.Print(numList);
    }
}
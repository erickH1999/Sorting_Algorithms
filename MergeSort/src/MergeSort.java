public class MergeSort {

    public static void Sort(int[] array) {

        int size = array.length;

        // check if you have a subArray less than two elements big
        // if true, stop recurring
        if (size < 2) {
            return;
        }

        // "mid" represents the halfway point of the array
        int mid = size / 2;

        // make two subarrays that each respect teh left/right side of the original array
        int[] leftSide = new int[mid];
        // size - mid for the length of the right is for the arrays that have an odd amount of elements
        int[] rightSide = new int[size - mid];

        // fill the left side of the array:
        for (int L = 0; L < mid; L++) {
            leftSide[L] = array[L];
        }

        // fill the right side:
        for (int R = mid; R < size; R++) {
            rightSide[R - mid] = array[R];
        }

        // recursively call MergeSort with two SubArrays
        Sort(leftSide);
        Sort(rightSide);

        // merge the elements
        Merge(array, leftSide, rightSide);

    }

    // method to merge
    public static void Merge(int[] array, int[] leftSide, int[] rightSide) {

        // two variables that hold the sizes of each subarray
        int leftSize = leftSide.length;
        int rightSize = rightSide.length;

        /*
        loop through the elements in the left and half sub-arrays
        compare the first element of each to the merged array
        until you have ran out elements in the two sub-arrays
         */

        // three iterator variables for the merged arrat and the two sub-arrays
        int L = 0;
        int R = 0;
        int M = 0;

        // loop until you run out of elements in the two subarrays
        while (L < leftSize && R < rightSize) {

            if (leftSide[L] <= rightSide[R]) {
                array[M] = leftSide[L];
                L++;
            } else {
                array[M] = rightSide[R];
                R++;
            }
            M++;

        }

        /*
        add all remaining sorted elements to the merged array
        this is the result of either one subarray running out of elements
         */

        while (L < leftSize) {
            array[M] = leftSide[L];
            L++;
            M++;
        }

        while (R < rightSize) {
            array[M] = rightSide[R];
            R++;
            M++;
        }

    }

    public static void Print(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

}

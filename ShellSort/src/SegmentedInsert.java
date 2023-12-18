// segmented insertion sort for shell sort

import java.util.ArrayList;

public class SegmentedInsert {

    public static void SegInsertionSort(
            ArrayList<Integer> arrayList, int numOfItems, int half) {


        numOfItems = arrayList.size();

        for (int outer = half; outer < numOfItems; outer++) {
            int current = arrayList.get(outer);
            int inner = outer;
            ShellSort.comparisons++;

            while (inner > half - 1 && (arrayList.get(inner - half) > current)) {
                ShellSort.comparisons++;
                arrayList.set(inner, arrayList.get(inner - half));
                inner = inner - half;
                ShellSort.exchanges++;
            }
            arrayList.set(inner, current);

        }

    }


}

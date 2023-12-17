import java.util.ArrayList;

public class SelectionSort {


    public static void Sort(ArrayList<Integer> array) {

        int temp, min, exchanges = 0, comparisons = 0;
        int numOfItems = array.size();

        for (int passes = 0; passes < numOfItems -1; passes++) {
            min = passes;
            for (int index = passes + 1; index < numOfItems; index++) {
                // record the number of comparisons
                comparisons++;
                if (array.get(index) < array.get(min)) {
                    min = index;
                }
            }

            if (min != passes) {
                temp = array.get(min);
                array.set(min, array.get(passes));
                array.set(passes, temp);
                exchanges++;
            }

        }
        System.out.println("Selection Sort: Number of Exchanges: " + exchanges);
        System.out.println("Selection Sort: Number of Comparisons: " + comparisons);

        System.out.println("Sorted File");
        for (int i = 0; i < 16; i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println();

    }

}

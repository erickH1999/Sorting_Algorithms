import java.util.ArrayList;

public class InsertionSort {


    public static void Sort(ArrayList<Integer> array) {

        int exchanges = 0, comparisons = 0;
        int numOfItems = array.size();

        for (int passes = 1; passes < numOfItems; passes++) {
            int element = array.get(passes);
            int inner = passes - 1;
            comparisons++;


            while (inner >= 0 && array.get(inner) > element) {
                exchanges++;
                array.set(inner + 1, array.get(inner));
                inner = inner - 1;
                comparisons++;
            }
            array.set(inner + 1, element);
        }

        System.out.println("Insertion Sort: Number of Exchanges: " + exchanges);
        System.out.println("Insertion Sort: Number of Comparisons: " + comparisons);

        System.out.println("Sorted File");
        for (int i = 0; i < 16; i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println();

    }

}

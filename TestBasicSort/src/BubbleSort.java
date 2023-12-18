import java.util.ArrayList;

public class BubbleSort {


    public static void Sort(ArrayList<Integer> array) {
        int temp, exchanges = 0, comparisons = 0;
        int numItems = array.size();

        boolean progress = true;

        for (int passes = 1; passes < numItems; passes++) {

            if (progress) {
                progress = false;
                for (int inner = 0; inner < numItems - passes; inner++) {
                    comparisons++;
                    if (array.get(inner) > array.get(inner + 1)) {
                        exchanges++;
                        temp = array.get(inner);
                        array.set(inner, array.get(inner + 1));
                        array.set(inner + 1, temp);
                        progress = true;
                    }
                }
            } else {
                break;
            }


        }
        System.out.println("Bubble Sort: Number of Exchanges: " + exchanges);
        System.out.println("Bubble Sort: Number of Comparisons: " + comparisons);

        System.out.println("Sorted File");
        for (int i = 0; i < 16; i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println();
    }


}

// Erick Huerta

/*
    Main class for testing three elementary sorts:
    Insertion Sort, Bubble Sort, and Selection Sort
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;


public class Main {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> orderedArray = new ArrayList<>();
        ArrayList<Integer> randomArray = new ArrayList<>();
        ArrayList<Integer> reverseArray = new ArrayList<>();

        // Scan for new list info
        Scanner ordered_Scanner;
        ordered_Scanner = new Scanner(new File("C:\\Users\\erick\\OneDrive\\Desktop\\Java Projects\\TestBasicSort\\src\\OrderedProtoCase.txt"));

        Scanner random_Scanner;
        random_Scanner = new Scanner(new File("C:\\Users\\erick\\OneDrive\\Desktop\\Java Projects\\TestBasicSort\\src\\RandomProtoCase.txt"));

        Scanner reverse_Scanner;
        reverse_Scanner = new Scanner(new File("C:\\Users\\erick\\OneDrive\\Desktop\\Java Projects\\TestBasicSort\\src\\ReversedProtoCase.txt"));


        // add info to each respective array list
        while (ordered_Scanner.hasNextInt() && random_Scanner.hasNextInt() && reverse_Scanner.hasNextInt()) {

            orderedArray.add(ordered_Scanner.nextInt());

            randomArray.add(random_Scanner.nextInt());

            reverseArray.add(reverse_Scanner.nextInt());

        }

        // Testing for each Sort

        // bubble sort:
        System.out.println(" ========================= ");
        System.out.println(" Testing BubbleSort: ");

        BubbleSort test1 = new BubbleSort();

        System.out.println(" ---The Ordered Case--- ");
        BubbleSort.Sort(new ArrayList<>(orderedArray));

        System.out.println(" ---The Random Case---");
        BubbleSort.Sort(new ArrayList<>(randomArray));

        System.out.println(" ---The Reverse Case---");
        BubbleSort.Sort(new ArrayList<>(reverseArray));

        System.out.println(" ========================= ");

        System.out.println();

        // Insertion sort:
        System.out.println(" ========================= ");
        System.out.println(" Testing InsertionSort: ");

        InsertionSort test2 = new InsertionSort();

        System.out.println(" ---The Ordered Case--- ");
        InsertionSort.Sort(new ArrayList<>(orderedArray));

        System.out.println(" ---The Random Case---");
        InsertionSort.Sort(new ArrayList<>(randomArray));

        System.out.println(" ---The Reverse Case---");
        InsertionSort.Sort(new ArrayList<>(reverseArray));

        System.out.println(" ========================= ");

        System.out.println();

        // Selection sort:
        System.out.println(" ========================= ");
        System.out.println(" Testing InsertionSort: ");

        SelectionSort test3 = new SelectionSort();

        System.out.println(" ---The Ordered Case--- ");
        SelectionSort.Sort(new ArrayList<>(orderedArray));

        System.out.println(" ---The Random Case---");
        SelectionSort.Sort(new ArrayList<>(randomArray));

        System.out.println(" ---The Reverse Case---");
        SelectionSort.Sort(new ArrayList<>(reverseArray));

        System.out.println(" ========================= ");

        System.out.println();
    }
}
// Erick Huerta

/*
    Project where the ShellSort algorithm
    has its efficiency measured with three different
    small sets of data
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;



public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Integer> arrayOrdered = new ArrayList<>();
        ArrayList<Integer> arrayReverse = new ArrayList<>();

        Scanner ordered_SmallInput;
        ordered_SmallInput = new Scanner(new File("C:\\Users\\erick\\OneDrive\\Desktop\\Java Projects\\ShellSort\\src\\OrderedProtoCase.txt"));

        while (ordered_SmallInput.hasNextInt()) {
            arrayOrdered.add(ordered_SmallInput.nextInt());
        }

        Scanner reverse_SmallInput;
        reverse_SmallInput = new Scanner(new File("C:\\Users\\erick\\OneDrive\\Desktop\\Java Projects\\ShellSort\\src\\ReversedProtoCase.txt"));

        while (reverse_SmallInput.hasNextInt()) {
            arrayReverse.add(reverse_SmallInput.nextInt());
        }
        // both arrays will have the same size
        int numOfItems = arrayOrdered.size();

        // Test Shell Sort
        System.out.println(" ========================= ");
        System.out.println(" Testing ShellSort ");

        ShellSort obj = new ShellSort();

        System.out.println(" ---The Ordered Case--- ");
        ShellSort.Sort(arrayOrdered, numOfItems);

        System.out.println(" ========================= ");

        System.out.println(" ---The Reverse Case--- ");
        ShellSort.Sort(arrayReverse, numOfItems);


        System.out.println(" ========================= ");

    }
}
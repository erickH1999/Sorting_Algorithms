// Erick Huerta

/*
    The goal for this project is to test
    the efficiency of QuickSort with
    different types of large data sets
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> arrayOrdered = new ArrayList<>();
        ArrayList<Integer> arrayReverse = new ArrayList<>();

        // obtain data through files
        Scanner ordered_LargeInput;
        ordered_LargeInput = new Scanner(new File("C:\\Users\\erick\\OneDrive\\Desktop\\Java Projects\\QuickSort\\src\\LargeOrderedSet.txt"));

        while (ordered_LargeInput.hasNextInt()) {
            arrayOrdered.add(ordered_LargeInput.nextInt());
        }

        Scanner reverse_LargeInput;
        reverse_LargeInput = new Scanner(new File("C:\\Users\\erick\\OneDrive\\Desktop\\Java Projects\\QuickSort\\src\\LargeReverseSet (2).txt"));

        while (reverse_LargeInput.hasNextInt()) {
            arrayReverse.add(reverse_LargeInput.nextInt());
        }

        System.out.println(" ========================= ");

        System.out.println(" Testing QuickSort with Large Date");
        System.out.println();

        QuickTest largeTest = new QuickTest();

        System.out.println(" ---The Ordered Case--- ");
        QuickTest.QuickSort(new ArrayList<>(arrayOrdered));

        System.out.println(" ========================= ");
        System.out.println();

        System.out.println(" ---The Reversed Case--- ");
        QuickTest.QuickSort(new ArrayList<>(arrayReverse));



    }
}
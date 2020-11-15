package com.kopytko;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        System.out.println("First Task");
        Integer[] array = {2, 3, 1, 7, 11};
        showArray(array);
        reverseOrder(array);

        System.out.println("Second Task");
        array = new Integer[]{-4, 2, 0, 6, -7};
        showArray(array);
        System.out.println("Sum of positives: " + getSumOfPositives(array)  + "\n");

        System.out.println("Third Task");
        array = new Integer[]{1, 2, 4, 1};
        showArray(array);
        System.out.println("Average: " + getAverage(array) + "\n");

        System.out.println("Fourth Task");
        array = new Integer[]{3, 2, 3, 1, 4, 2, 8, 3};
        showArray(array);
        replaceDuplicate(array);

    }

    private static void reverseOrder(Integer[] array) {
        Arrays.sort(array, Comparator.reverseOrder());
        System.out.println("Reverse order: ");
        showArray(array);
        System.out.println();
    }

    private static int getSumOfPositives(Integer[] array) {
        int sum = 0;
        for (int i : array) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    private static int getAverage(Integer[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum/array.length;
    }

    private static void replaceDuplicate(Integer[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = 0;
                }
            }
        }
        System.out.println("After replacing duplicates: ");
        showArray(array);
    }

    private static void showArray(Integer[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

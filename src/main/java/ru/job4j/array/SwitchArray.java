package ru.job4j.array;

import java.util.Arrays;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int destination) {
        int temp = array[source];
        array[source] = array[destination];
        array[destination] = temp;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6};
        int[] result = swapBorder(numbers);
        for (int j : result) {
            System.out.println(j);
        }

        System.out.println("ge");

        int[] numbers1 = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(numbers1));
        int[] result1 = swap(numbers1, 3, 4);
        for (int i : result1) {
            System.out.println(i);
        }
    }
}

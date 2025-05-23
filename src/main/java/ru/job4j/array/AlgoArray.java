package ru.job4j.array;

import java.util.Arrays;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;

        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] > array[index + 1]) {
                temp = array[index];
                array[index] = array[index + 1];
                array[index + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
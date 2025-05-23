package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int element) {
        int result = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == element) {
                result = index;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(indexOf(data, 2));

        int[] data1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(indexOf(data1, -2));
    }
}
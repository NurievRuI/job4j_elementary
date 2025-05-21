package ru.job4j.array;

public class Square {
    public static void calculate(int bound) {
        int[] result = new int[bound];
        for (int i = 0; i < result.length; i++) {
            result[i] = i * i;
            System.out.println("Array " + i + " = " + result[i]);
        }
    }

    public static void main(String[] args) {
        calculate(4);
        }
}

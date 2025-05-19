package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        // Используем теорему Пифагора для расчета расстояния
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        System.out.println("result1 (0, 0) to (2, 0) " + result);

        double result1 = distance(-1, -1, 1, 1);
        System.out.println("result1 (0, 0) to (2, 0) " + result1);

        double result2 = distance(-2, -2, 2, 2);
        System.out.println("result1 (0, 0) to (2, 0) " + result2);
    }
}

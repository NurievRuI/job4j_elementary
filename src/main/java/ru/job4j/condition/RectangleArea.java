package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {

        return (((p / (2 * (k + 1))) * k) * (p / (2 * (k + 1))));
    }

    public static void main(String[] args) {
        double result = RectangleArea.square(6, 2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result);
    }
}

package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int result = 1;
        if (number == 0) {
            return 1;
        } else {
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(calculate(5));
        System.out.println(calculate(0));
        System.out.println(calculate(10));
    }
}

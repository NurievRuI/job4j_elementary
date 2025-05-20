package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;

        if (start > finish) {
            System.out.print("start is greater than finish, so sum is ");
            return 0;

        } else {
            for (int i = start; i <= finish; i++) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(30, -8));
        System.out.println(sum(0, -10));
    }
}
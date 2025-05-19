package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum;

        if (start > finish) {
            System.out.print("start is greater than finish, so sum is ");
            return 0;

        } else {
            for (sum = start; sum < finish; sum++) {
                sum += sum;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(30, -8));
        System.out.println(sum(0, 10));
    }
}
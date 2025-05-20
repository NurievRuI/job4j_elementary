package ru.job4j.loop;
import static ru.job4j.loop.CheckPrimeNumber.check;

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            if (check(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(calc(5));
        System.out.println(calc(11));
        System.out.println(calc(2));
        System.out.println(calc(25));
        System.out.println(calc(49));
    }
}

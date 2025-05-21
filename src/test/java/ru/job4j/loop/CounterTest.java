package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenSumNumbersFromOneToTenThenThirty() {
        int start = 0;
        int finish = 10;
        int expected = 55;

        int output = Counter.sum(start, finish);

        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumNumbersFromThreeToEightThenEighteen() {
        int start = 3;
        int finish = 8;
        int expected = 33;

        int output = Counter.sum(start, finish);

        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumNumbersFromOneToOneThenOne() {
        int start = 1;
        int finish = 1;
        int expected = 1;

        int output = Counter.sum(start, finish);

        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumNumbersFromThirtyToMinusEightThenZero() {
        int start = 30;
        int finish = -8;
        int expected = 0;

        int output = Counter.sum(start, finish);

        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumNumbersFromMinusFiveToTenThenForty() {
        int start = -5;
        int finish = 10;
        int expected = 40;

        int output = Counter.sum(start, finish);

        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromThreeToEightThenEighteen() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToOneThenZero() {
        int start = 1;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromThirtyToMinusEightThenZero() {
        int start = 30;
        int finish = -8;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusFiveToTenThenTwentyFore() {
        int start = -5;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 24;
        assertThat(result).isEqualTo(expected);
    }
}
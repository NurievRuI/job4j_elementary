package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void start0finish10then55() {
        int start = 0;
        int finish = 10;
        int expected = 55;

        int output = Counter.sum(start, finish);

        assertThat(output).isEqualTo(expected);
    }

    @Test
    void start3finish8then33() {
        int start = 3;
        int finish = 8;
        int expected = 33;

        int output = Counter.sum(start, finish);

        assertThat(output).isEqualTo(expected);
    }

    @Test
    void start1finish1then1() {
        int start = 1;
        int finish = 1;
        int expected = 1;

        int output = Counter.sum(start, finish);

        assertThat(output).isEqualTo(expected);
    }

    @Test
    void start30finishMinus8then0() {
        int start = 30;
        int finish = -8;
        int expected = 0;

        int output = Counter.sum(start, finish);

        assertThat(output).isEqualTo(expected);
    }

    @Test
    void start0finishMinus10then0() {
        int start = 0;
        int finish = -10;
        int expected = 0;

        int output = Counter.sum(start, finish);

        assertThat(output).isEqualTo(expected);
    }
}
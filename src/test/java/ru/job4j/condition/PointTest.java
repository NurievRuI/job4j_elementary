package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPoints00And20Then2() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 0);
        double expected = 2.0;
        double output = p1.distance(p2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus1Minus1And1And1Then2Dot83() {
        Point p1 = new Point(-1, -1);
        Point p2 = new Point(1, 1);
        double expected = 2.83;
        double output = p1.distance(p2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus2And2And2Then5Dot66() {
        Point p1 = new Point(-2, -2);
        Point p2 = new Point(2, 2);
        double expected = 5.66;
        double output = p1.distance(p2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints000And200Then2() {
        Point p1 = new Point(0, 0, 0);
        Point p2 = new Point(2, 0, 0);
        double expected = 2.0;
        double output = p1.distance3d(p2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus1Minus1Minus1And1And1And1Then3Dot46() {
        Point p1 = new Point(-1, -1, -1);
        Point p2 = new Point(1, 1, 1);
        double expected = 3.46;
        double output = p1.distance3d(p2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus2Minus2And2And2And2Then6Dot92() {
        Point p1 = new Point(-2, -2, -2);
        Point p2 = new Point(2, 2, 2);
        double expected = 6.92;
        double output = p1.distance3d(p2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}

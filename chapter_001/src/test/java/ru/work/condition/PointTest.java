package ru.work.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        Point p = new Point();

        double result = p.distance(0, 0, 0, 10);

        assertThat(result, is(10D));
    }
}
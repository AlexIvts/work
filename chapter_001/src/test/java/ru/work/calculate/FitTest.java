package ru.work.calculate;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manWeight() {
        Fit fit = new Fit();

        double result = fit.manWeight(170);

        assertThat(result, closeTo(80.5, 0.1));
    }

    @Test
    public void womanWeight() {
        Fit fit = new Fit();

        double result = fit.womanWeight(170);

        assertThat(result, closeTo(69D, 0.1));
    }
}
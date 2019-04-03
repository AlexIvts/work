package ru.work.converter;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {

    @Test
    public void when140RurThen2Eur()  {
        Converter calc = new Converter();
        int result = calc.rurToEur(140);
        int expected = 2;
        assertThat(result, is(expected));
    }

    @Test
    public void when120RurThen2Usd()  {
        Converter calc = new Converter();
        int result = calc.rurToUsd(120);
        int expected = 2;
        assertThat(result, is(expected));
    }

    @Test
    public void when2EurThen140Rur()  {
        Converter calc = new Converter();
        int result = calc.eurToRur(2);
        int expected = 140;
        assertThat(result, is(expected));
    }

    @Test
    public void when2UsdThen120Rur()  {
        Converter calc = new Converter();
        int result = calc.usdToRur(2);
        int expected = 120;
        assertThat(result, is(expected));
    }
}

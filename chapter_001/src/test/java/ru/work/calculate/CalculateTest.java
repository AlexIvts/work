package ru.work.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Test.
 *
 * @author Alex Ivts
 * @version $Id$
 * @since 0.1
 */
public class CalculateTest {
 /**
 * Test echo.
 */

	@Test
	 public void whenTakeNameThenThreeEchoPlusName() {
		String input = "Petr Arsentev";
		String expect = "Echo, echo, echo : Petr Arsentev"; 
		Calculate calc = new Calculate();
		String result = calc.echo(input);
		assertThat(result, is(expect));
	 }

	@Test
	public void whenAddOnePlusOneThenTwo()  {
		Calculate calc = new Calculate();
		double result = calc.add(1D, 1D);
		double expected = 2D;
		assertThat(result, is(expected));
	}

	@Test
	public void whenDiv2On2Then1()  {
		Calculate calc = new Calculate();
		double result = calc.div(2D, 2D);
		double expected = 1D;
		assertThat(result, is(expected));
	}

	@Test
	public void whenDiv1On0ThenPositiveInfinity()  {
		Calculate calc = new Calculate();
		double result = calc.div(1D, 0D);
		double expected = Double.POSITIVE_INFINITY;
		assertThat(result, is(expected));
	}

	@Test
	public void whenDiv0On0ThenNaN()  {
		Calculate calc = new Calculate();
		double result = calc.div(0D, 0D);
		double expected = Double.NaN;
		assertThat(result, is(expected));
	}

	@Test
	public void whenSub2Minus1Then1()  {
		Calculate calc = new Calculate();
		double result = calc.sub(2D, 1D);
		double expected = 1D;
		assertThat(result, is(expected));
	}

	@Test
	public void whenMult2On2Then4()  {
		Calculate calc = new Calculate();
		double result = calc.mult(2D, 2D);
		double expected = 4D;
		assertThat(result, is(expected));
	}
}
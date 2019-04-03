package ru.work.calculate;

/**
* Class Класс для вычисления арифметических операций 
* @author Alex Ivts
* @since 28.03.2019
* @version 1

*/
public class Calculate {
	
	/**
	* Конструктор, вывод строки в консоль.
	* @param args - args.
	*/
	public static void main(String[] args) {
		System.out.println("Hello");
	}
	
	/**
	 * Method echo.
	 * @param name - name.
	 * @return Echo plus name.
	 */
	 public String echo(String name) {
		return "Echo, echo, echo : " + name;
	 }

	 /**
	  * Method add
	  * @param first - first
	  * @param second - second
	  * @return first plus second
	  */
	 public double add(double first, double second) {
	 	return first + second;
	 }

	/**
	 * Method sub
	 * @param first - first
	 * @param second - second
	 * @return first sub second
	 */
	public double sub(double first, double second) {
		return first - second;
	}

	/**
	 * Method mult
	 * @param first - first
	 * @param second - second
	 * @return first mult second
	 */
	public double mult(double first, double second) {
		return first * second;
	}

	/**
	 * Method div
	 * @param first - first
	 * @param second - second
	 * @return first div second
	 */
	public double div(double first, double second) {
		return first / second;
	}
}
/**
 * 
 */
package jm.test.calculator;

/**
 * @author usr1
 *
 */
public class ResultOutOfBoundsException extends Exception 
{
	public ResultOutOfBoundsException(double result) {// TODO Auto-generated constructor stub
		this.result = result;
	}
	
	
	@Override
	public String toString() {
		return "\nResultOutOfBoundsException \nк сожалению результат выражения [result = " + result + "]\n"
				+ "вышел за пределы диапазона чисел, допустимых для работы данного калькулятора\n"
				+ "запустите программу ещё раз и попробуйте ввести другое выражение\n";
	}


	private double result;

}

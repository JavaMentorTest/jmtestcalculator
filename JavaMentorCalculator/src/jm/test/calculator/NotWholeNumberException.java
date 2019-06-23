/**
 * 
 */
package jm.test.calculator;

/**
 * @author usr1
 *
 */
public class NotWholeNumberException extends Exception 
{
	public NotWholeNumberException(double result) {// TODO Auto-generated constructor stub
		this.result = result;
	}
	
	
	@Override
	public String toString() {
		return "\nNotWholeNumberEXception \nрезультат выражения [result = " + result + "]\n"
				+ "не является целым числом, допустимым для работы данного калькулятора\n"
				+ "запустите программу ещё раз и попробуйте ввести другое выражение\n";
	}

	private double result;
}

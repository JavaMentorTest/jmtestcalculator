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
		return "\nResultOutOfBoundsException \n� ��������� ��������� ��������� [result = " + result + "]\n"
				+ "����� �� ������� ��������� �����, ���������� ��� ������ ������� ������������\n"
				+ "��������� ��������� ��� ��� � ���������� ������ ������ ���������\n";
	}


	private double result;

}

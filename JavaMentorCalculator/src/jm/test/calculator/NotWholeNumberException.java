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
		return "\nNotWholeNumberEXception \n��������� ��������� [result = " + result + "]\n"
				+ "�� �������� ����� ������, ���������� ��� ������ ������� ������������\n"
				+ "��������� ��������� ��� ��� � ���������� ������ ������ ���������\n";
	}

	private double result;
}

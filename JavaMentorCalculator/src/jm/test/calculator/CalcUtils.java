/**
 * 
 */
package jm.test.calculator;

import java.util.Scanner;

/**
 * @author usr1
 *
 */
public class CalcUtils 
{
	public static void runUserInputCicle () throws Exception
	{
		try (Scanner conin = new Scanner(System.in))
		{
			int i = 0;
			while (conin.hasNext()) 
			{
				if (conin.hasNextInt()) 
				{
					int n = conin.nextInt();
					if (n < 1 || n > 10) 
					{
						throw new Exception("\n���� �� ������ ����� �����������\n"
								+ "����������� �������� ����� �� 1 �� 10 ������������");
					}
					operands[i] = n;

					if (operandsAreRomanNumbers) {
						throw new Exception("\n������������ � ��������� ����������� ������������ ������ ���� ��� ������\n"
								+ "������ �������� ����� ��� ������ ������� �����");
					}
					operandsAreArabicNumbers = true ;
					i++;
					//System.out.print(n + " ");
				}
				else 
				{
					String token = conin.next();
					
					if (token.equals("=")) 
					{
						if (i < 2) {
							throw new Exception("\n���� =(�����) ������ ��������� ��������� ���������\n"
									+ "� ����������� ������ � ����� ���������\n"
									+ "��������� ������ �������� � ��������� ����� �������");
						}
						//System.out.print(token + " ");
						break; // exit from while (conin.hasNext())
					}
					
					if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) 
					{
						if (i >= 2) {
							throw new Exception("\n����� �������� +(��������), -(���������), *(���������), /(�������)\n"
									+ "�� ����������� � ����� ���������\n"
									+ "���� =(�����) ������ ��������� ��������� ���������\n"
									+ "��������� ������ �������� � ��������� ����� �������");
						}
						op = token;
						//System.out.print(token + " ");
					}
					else if (token.equals("I") 
							|| token.equals("II") 
							|| token.equals("III") 
							|| token.equals("IV")
							|| token.equals("V") 
							|| token.equals("VI") 
							|| token.equals("VI")
							|| token.equals("VIII") 
							|| token.equals("IX") 
							|| token.equals("X")) 
					{
						operands[i] = RomanNumber.valueOf(token).getNumber();
						if (operandsAreArabicNumbers) {
							throw new Exception("\n������������ � ��������� ����������� ������������ ������ ���� ��� ������\n"
									+ "������ �������� ����� ��� ������ ������� �����");
						}
						operandsAreRomanNumbers = true;
						i++;
						//System.out.print(token + " ");
					}
					else
					{
						throw new Exception("\n���� �� ������ ����� �����������\n"
								+ "����������� ������� ����� �� I �� X ������������\n"
								+ " � �������� ������� �������� ����������� ������\n"
								+ "+(��������), -(���������), *(���������), /(�������)\n"
								+ "���� =(�����) ������ ��������� ��������� ���������\n"
								+ "��������� ������ �������� � ��������� ����� �������");
					}
				}
			}
		}
	}
	
	public static String getRomanNumberRepresentation(int n) 
	{
			String result = "";
			switch (n)
			{
			case 1:
				result = "I";
				break;
			case 2:
				result = "II";
				break;
			case 3:
				result = "III";
				break;
			case 4:
				result = "IV";
				break;
			case 5:
				result = "V";
				break;
			case 6:
				result = "VI";
				break;
			case 7:
				result = "VII";
				break;
			case 8:
				result = "VIII";
				break;
			case 9:
				result = "IX";
				break;
			case 10:
				result = "X";
				break;
			}
			
			return result;
	}
	
	/**
	 * @return the operands
	 */
	public static double[] getOperands() {
		return operands;
	}

	/**
	 * @return the op
	 */
	public static String getOp() {
		return op;
	}

	/**
	 * @return the operandsAreRomanNumbers
	 */
	public static boolean isOperandsAreRomanNumbers() {
		return operandsAreRomanNumbers;
	}

	private static boolean operandsAreArabicNumbers = false;
	private static boolean operandsAreRomanNumbers  = false;
	private static double[] operands = new double[2];
	private static String op;
}

/**
 * 
 */
package jm.test.calculator;

import java.util.Scanner;

/**
 * @author usr1
 *
 */
public class CalculatorApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{// TODO Auto-generated method stub
				
		System.out.println("��� ������������ ��������� �����������!");
		
		Calc calc = new Calc();
		try {
			calc.processCalcTask();
			System.out.println(calc.getResultToPrint());
			System.out.println("��������� ����������� ���������.\n"
					+ "��� ������ ���������� ��������� ��������� ������\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

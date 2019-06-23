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
				
		System.out.println("Вас приветствует программа калькулятор!");
		
		Calc calc = new Calc();
		try {
			calc.processCalcTask();
			System.out.println(calc.getResultToPrint());
			System.out.println("Программа калькулятор завершена.\n"
					+ "Для нового вычисления запустите программу заново\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

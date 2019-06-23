/**
 * 
 */
package jm.test.calculator;

import java.util.Scanner;

/**
 * @author usr1
 *
 */
public class Calc 
{
	public void processCalcTask() throws Exception
	{
		//System.out.println("before runUserInputCicle ();");
		System.out.println("¬ведите выражение, например 1 + 2 = или IV / II = (с пробелами между знаками).\n" 
				+ "допускаютс€ только арабские цифры от 1 до 10 включительно и римские цифры от I до X включительно\n" 
				+ "в качестве знаков операций допускаютс€ только +(сложение), -(вычитание), *(умножение), /(деление)\n"
				+ "знак =(равно) служит признаком окончани€ выражени€");
		CalcUtils.runUserInputCicle ();
		//System.out.println("after runUserInputCicle ();");
		operands = CalcUtils.getOperands();
		operation = CalcUtils.getOp();
		switch (operation)
		{
		case "+":
			result = CalcOperation.ADD.operation(operands[0], operands[1]);
			if (result > 10) {
				throw new ResultOutOfBoundsException(result);
			}
			break;
		case "-":
			result = CalcOperation.SUBTRACT.operation(operands[0], operands[1]);
			if (result < 0) {
				throw new ResultOutOfBoundsException(result);
			}
			break;
		case "*":
			result = CalcOperation.MULTIPLY.operation(operands[0], operands[1]);
			if (result > 10) {
				throw new ResultOutOfBoundsException(result);
			}
			break;
		case "/":
			result = CalcOperation.DIVIDE.operation(operands[0], operands[1]);
			if (result < 0) {
				throw new ResultOutOfBoundsException(result);
			}
			if ((result - Math.floor(result)) != 0) {
				throw new NotWholeNumberException(result);
			}
			break;
		}
		
		if (CalcUtils.isOperandsAreRomanNumbers()) {
			resultToPrint = CalcUtils.getRomanNumberRepresentation((int)result);
		} else {
			resultToPrint = String.valueOf((int)result);
		}
	}
	
	/**
	 * @return the operands
	 */
	public double[] getOperands() {
		return operands;
	}
	
	/**
	 * @return the operation
	 */
	public String getOperation() {
		return operation;
	}
	

	/**
	 * @return the resultToPrint
	 */
	public String getResultToPrint() {
		return resultToPrint;
	}


	private double[] operands = new double[2];
	private String operation;
	private double result;
	private String resultToPrint;
}

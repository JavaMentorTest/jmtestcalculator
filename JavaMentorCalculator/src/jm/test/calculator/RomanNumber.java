/**
 * 
 */
package jm.test.calculator;

/**
 * @author usr1
 *
 */
public enum RomanNumber 
{
	I(1),
	II(2),
	III(3),
	IV(4),
	V(5),
	VI(6),
	VII(7),
	VIII(8),
	IX(9),
	X(10);
	
	private RomanNumber(int n) {// TODO Auto-generated constructor stub
		number = n;
	}	
	
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	
	private int number;
}

/**
 * 
 */
package jm.test.calculator;

/**
 * @author usr1
 *
 */
public enum CalcOperation 
{
	ADD{
		public double operation (double a, double b) {
			return (double) a + b;
		}
	},
	SUBTRACT{
		public double operation (double a, double b) {
			return (double) a - b;
		}
	},
	DIVIDE {
		public double operation (double a, double b) {
			return (double) a / b;
		}
	},
	MULTIPLY {
		public double operation (double a, double b) {
			return (double) a * b;
		}
	};
	
	public abstract double operation(double a, double b);
}

/**
 * Saadiq Webster
 * This class emulates adding, subtracting, multiplying,
 * and dividing from a real life calculator
 */
package cse360assign2;

public class Calculator {

	private int total;
	private String history;
	
	/**
	 * Class Constructor
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0"; //set to 0 as a string not an int
	}
	
	/**
	 * returns the current total
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * adds the value to the total
	 * @param value
	 */
	public void add (int value) {
		total = total + value;
		history += " + "+value;
	}
	
	/**
	 * subtracts the value to the total
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
		history += " - "+value;
	}
	
	/**
	 * multiplies the value to the total
	 * @param value
	 */
	public void multiply (int value) {
		total = total * value;
		history += " * "+value;
	}
	
	/**
	 * divides the value to the total
	 * @param value
	 */
	public void divide (int value) {
		total = total / value;
		history += " / "+value;
	}
	
	/**
	 * summarizes all the method calls
	 * @return history
	 */
	public String getHistory () {
		return history;
	}
}
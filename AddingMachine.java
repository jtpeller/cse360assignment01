/**
 *  AddingMaching.java
 *  	Programmer: jtpeller
 *  	Date: October 03, 2020
 *  	Description: Simple Adding/Subtracting calculator, with a history.
 *  	Github: https://github.com/jtpeller/cse360assignment01
 */
package cse360assignment02;

import java.util.ArrayList;

public class AddingMachine {
	private int total;															// stores total
	private static ArrayList<Integer> history = new ArrayList<Integer>();		// stores value history
	private static ArrayList<String> operation = new ArrayList<String>();		// stores operation history

	/**
	 * AddingMachine(): constructor.
	 */
	public AddingMachine() {
		total = 0;
		history.add(total);
	}

	/**
	 * getTotal(): getter method to retrieve the total.
	 * 
	 * @return
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * add(): adds the value to the total
	 * 
	 * @param value
	 */
	public void add(int value) {
		total += value;
		history.add(value);
		operation.add(" + ");
	}

	/**
	 * subtract(): subtracts the value from the total
	 * 
	 * @param value
	 */
	public void subtract(int value) {
		total -= value;
		history.add(value);
		operation.add(" - ");
	}

	/**
	 * toString(): printing method
	 */
	@Override
	public String toString() {
		String foo = "";
		if (history.size() > 0)			// NULL check
			foo += history.get(0).toString();
		for (int i = 1; i < history.size(); i++) {
			foo += operation.get(i - 1).toString();
			foo += history.get(i).toString();
		}
		return foo;
	}

	/**
	 * clear(): reset method
	 */
	public void clear() {
		history.clear();
		total = 0;
	}
}

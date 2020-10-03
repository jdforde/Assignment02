package cse360assignment02;


/*This class acts as a machine that adds and subtracts numbers. It gets the total and stores the history, 
 *like a calculator, in a string. */
public class AddingMachine {
	
	//Private int that calculates the total and String that shows history
	private int total;
	private String history;
	
	
	//Constructor method
	public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    history = "0";
	  }
	  
	//Method that returns the total
	public int getTotal () {
	    return total;
	  }
	 
	//Method that adds
	public void add (int value) {
		total+=value;
		history+=" + " + value;
	  }
	
	//Method that subtracts
	public void subtract (int value) {
		total-=value;
		history+=" - " + value;
	  }
	
	//Returns the operation as a string
	public String toString () {
	    return history;
	  }
	
	//Clears the calculator to default position
	public void clear() {
		total = 0;
		history = "0";
	  }

}

package cse360assignment02;

public class Main {

	public static void main(String[] args) {
		AddingMachine myCalc = new AddingMachine();
		myCalc.add(4);
		myCalc.subtract(2);
		myCalc.add(5);
		System.out.println(myCalc.getTotal());
		System.out.println(myCalc.toString());
		myCalc.clear();
		myCalc.add(21);
		System.out.println(myCalc.toString());
		
	}

}

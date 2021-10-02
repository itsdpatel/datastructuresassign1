package sumNumbers;

public class Main {
	
	//Invoking a method
	public int sumOfNumbers(int x, int y) {
		int sum = x + y;
		return sum;
	}

	public static void main(String[] args) {
		// assigning values
		int number1 = 160;
		int number2 = 40;
		
		//Object Instantiation
		Main ob = new Main();
		
		//Method call
		int result = ob.sumOfNumbers(number1, number2);
		System.out.println("The Result of the Addition is: " + result);

	}

}

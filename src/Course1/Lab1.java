package Course1;

import java.util.Arrays;

public class Lab1 {

	static int sumNumbers(int n) {
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
		
			sum += i;
		
	}
		return sum;
	
	}
	
	
	static int factorialVal(int x) {
		
		int baseValue = 1;
		
		if (x == 0) {
			return 1; 
		}
	
		else if (x < 1) {
			return 1;
		}
		
		for (int b = 1; b <= x; b++) {
			
			baseValue *= b;
		
		System.out.println(b);
		}
	
	
		return baseValue;
		// Need to include this since the static int factorialValue statement asks for this.
		
		
	}
	
	static int recursiveMethod(int x) {
		
		if (x == 0) {
			return 1;
		}
		
		else {
			System.out.println("Function was executed");
			return x * recursiveMethod(x-1);
	
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int n = 5;
			int result = sumNumbers(n);
			System.out.println("Sum of numbers from 1 to " + n + " is: " + result);
			
			
			System.out.println(factorialVal(4));
			
			String[] arrayofNames = {"Johnny","Tesla","Bobby"};
			
			System.out.println(Arrays.toString(arrayofNames));
			System.out.println(recursiveMethod(5));
	}

}

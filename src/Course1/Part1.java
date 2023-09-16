package Course1;

public class Part1 {

	public static void main(String[] args) {
		
		// Fibonacci Number is defined by the sum of hte 2 previous fibonacci number
		// Fib 2 = fib(1) + fib(0) 
		System.out.println(fib(5));

	}

	public static int fib(int n){
		if (n == 0) {
			return 0;
		}
	
		else if (n < 1) {
			return 1;
		}
		
		return (fib(n-1) * fib(n-2));
		
	}
}






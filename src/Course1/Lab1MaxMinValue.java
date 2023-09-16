package Course1;

public class Lab1MaxMinValue {
	
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {5,3,10,32,0,-4,269};
		System.out.println(numbers[0]);
		System.out.println("The Minumum of the numbers array is :" +findMin(numbers));
		System.out.println("The Max of the numbers array is :" +findMax(numbers));
		System.out.println("The Average of the numbers array is :" +findAvg(numbers));
		
	}

	
	//This for for loop essentially keeps the lowest value in the min var
	// it uses the for loop to move through the array position and replace the min value, if the value iterated through is lower.
	public static int findMin(int[] arr) {
		int min = arr[0];
		for (int i = 0 ; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

	}
		return min;
	
}
	
	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 0 ; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

	}
		return max;
	
	}	

	public static int findAvg(int [] arr) {
		
		int sum = 0;
		for (int n = 0 ; n < arr.length; n++) {
			sum = sum + arr[n];
			
		}
		
		System.out.println("The Sum that will be used for the average function is :" + sum);
		return sum/arr.length;
		
		
	}
	
}


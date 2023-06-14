// JAVA Code for Maximum Weight Difference
import java.util.*;

class GFG {
	
	public static int solve(int array[], int n,
										int k)
	{
		// sort the given array
		Arrays.sort(array);
	
		// Initializing the value to 0
		int sum = 0, sum1 = 0, sum2 = 0;
	
		// Getting the sum of the array
		for (int i = 0; i < n; i++) {
			sum += array[i];
		}
	
		// Getting the sum of first k elements
		for (int i = 0; i < k; i++) {
			sum1 += array[i];
		}
	
		// Getting the sum of (n-k) elements
		for (int i = k; i < n; i++) {
			sum2 += array[i];
		}
	
		// Returning the maximum possible difference.
		return Math.max(Math.abs(sum1 - (sum - sum1)),
					Math.abs(sum2 - (sum - sum2)));
	}
	
	/* Driver program to test above function */
	public static void main(String[] args)
	{
		int k = 2;
		int array[] = { 8, 4, 5, 2, 10 };
	
		// calculate the numbers of elements
		// in the array
		int n = array.length;
	
		// call the solve function
		System.out.print(solve(array, n, k));
			
	}
}
// This code is contributed by Arnav Kr. Mandal.

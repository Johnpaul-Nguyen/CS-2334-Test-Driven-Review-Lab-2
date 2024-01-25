/**
 * Implement each of the 10 methods tested in JUnitTests.java. Study the tests
 * to determine how the methods should work.
 */
public class Java1Review {

	public static void main(String[] args) {
		// If you want to write your own tests, do so here. (Do not modify
		// JUnitTests.java.) To run this method in Eclipse, right-click
		// Java1Review.java in the Package Explorer and select "Run As" >
		// "Java Application" from the context menu.
	}
	
	// divide Method (double)
	public static double divide(double a, double b) {
		return a / b;
	}
	
	// divide Method (int)
	public static int divide(int a, int b) {
		return a / b;
	}
	
	// testIsDivisibleBy7 Method
	public static boolean isDivisibleBy7(int a) {
		if ((a % 7) == 0) {
			return true;
		}
		return false;
	}
	
	// testMain Method
	public static String main(String a) {
		return "Overloaded main method was passed \"" + a + "\".";
	}
	
	// testFindMin Method
	public static int findMin(int a, int b, int c) {
		int result = Math.min(a, Math.min(b, c));
		return result;
	}
	
	// testFindMinElement Method
	public static int findMin(int[] arr) {
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
	// testAverage Method
	public static double average(int[] arr) {
		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			count++;
		}
		return sum / (double) count;
	}
	
	// testToLowerCase Method
	public static void toLowerCase(String[] arr) {
		String temp = "";
		
		for (int i = 0; i < arr.length; i++) {
			temp = arr[i];
			temp = temp.toLowerCase();
			arr[i] = temp;
		}
	}
	
	// testToLowerCaseCopy Method
	public static String[] toLowerCaseCopy(String[] arr) {
		String[] result = new String[arr.length];
		String temp = "";
		
		for (int i = 0; i < arr.length; i++) {
			temp = arr[i];
			temp = temp.toLowerCase();
			result[i] = temp;
		}
		
		return result;
	}
	
	// testRemoveDuplicates Method
	public static int[] removeDuplicates(int[] arr) {
		int[] result = new int[arr.length];
		int numToFind;
		boolean found = false;
		
		for (int i = 0; i < arr.length; i++) {
			numToFind = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (numToFind == arr[j]) {
					found = true;
				}
				
				if (found) {
					for (int k= 0; k < arr.length; k++) {
						if (arr[k] == numToFind) {
							arr[k] = 0;
						}
					}
				}
			}
			found = false;
		}
		
		return result;
	}

}

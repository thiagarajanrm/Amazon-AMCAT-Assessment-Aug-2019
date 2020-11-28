package test.demo;

import java.util.Arrays;

// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHING A PACKAGE MAY BE RESTRICTED
// DEFIND ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
class GCD {
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	public int generalizedGCD(int num, int[] arr) {
		// WRITE YOUR CODE HERE
		Arrays.sort(arr);
		int result = -1;
		for (int i = arr[0]; i > 0; i--) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] % i != 0) {
					break;
				} else {
					count = count + 1;
				}
			}
			if (num == count) {
				result = i;
				break;
			}
		}
		return result;
	}
	// METHOD SIGNATURE ENDS

	public static void main(String[] args) {
		GCD gcd = new GCD();
		int[] arr1 = { 2, 4, 6, 8, 10 };
		System.out.println("Result:" + gcd.generalizedGCD(5, arr1));

		int[] arr2 = { 2, 3, 4, 5, 6 };
		System.out.println("Result:" + gcd.generalizedGCD(5, arr2));

		int[] arr3 = { 25, 5, 20 };
		System.out.println("Result:" + gcd.generalizedGCD(3, arr3));

		int[] arr4 = { 1 };
		System.out.println("Result:" + gcd.generalizedGCD(1, arr4));

	}
}

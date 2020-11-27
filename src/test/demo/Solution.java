package test.demo;

import java.util.ArrayList;
import java.util.Arrays;
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
import java.util.List;

// SOME CLASSES WITHING A PACKAGE MAY BE RESTRICTED
// DEFIND ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution {
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	public List<Integer> cellCompete(int[] states, int days) {
		// WRITE YOUR CODE HERE
		List<Integer> result = new ArrayList<>();
		int pre = -1;
		int next = -1;
		int[] statesTemp = new int[states.length];

		for (int j = 0; j < days; j++) {
			for (int i = 0; i < states.length; i++) {

				if (i > 0) {
					pre = i - 1;
				}
				if (i < states.length - 1) {
					next = i + 1;
				}

				int preValue = 0;
				int nextValue = 0;

				if (pre != -1) {
					preValue = states[pre];
				}

				if (next != -1) {
					nextValue = states[next];
				}

				if (preValue == nextValue) {
					statesTemp[i] = 0;
					if (j == days - 1) {
						result.add(0);
					}
				} else {
					statesTemp[i] = 1;
					if (j == days - 1) {
						result.add(1);
					}
				}

				pre = -1;
				next = -1;
			}
			System.out.println("Day:" + (j + 1) + "->:" + Arrays.toString(statesTemp));
			System.arraycopy(statesTemp, 0, states, 0, statesTemp.length);
		}
		return result;
	}
	// METHOD SIGNATURE ENDS

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] states1 = { 1, 0, 0, 0, 0, 1, 0, 0 };
		System.out.println("input1 :" + Arrays.toString(states1));
		List<Integer> result1 = solution.cellCompete(states1, 1);
		System.out.println("result1:" + result1);

		System.out.println("======================================");
		int[] states2 = { 1, 1, 1, 0, 1, 1, 1, 1 };
		System.out.println("input2 :" + Arrays.toString(states2));
		List<Integer> result2 = solution.cellCompete(states2, 2);
		System.out.println("result2:" + result2);
	}
}

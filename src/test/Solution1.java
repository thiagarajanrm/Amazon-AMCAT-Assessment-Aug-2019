package test;

import java.util.ArrayList;
import java.util.Collections;
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
//SOME CLASSES WITHING A PACKAGE MAY BE RESTRICTED
//DEFIND ANY CLASS AND METHOD NEEDED
import java.util.List;

// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution1 {
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	int minimumTime(int numOfParts, List<Integer> parts) {
		// WRITE YOUR CODE HERE
		int count = 0;
		System.out.println(parts);
		for (int i = 0; i <= parts.size(); i++) {
			Collections.sort(parts);
			System.out.println("------i value:" + i + " ---------");
			System.out.println("After Sorting:" + parts);
			count = count + (parts.get(0) + parts.get(1));
			parts.set(0, parts.get(0) + parts.get(1));
			parts.remove(1);
			System.out.println("New parts:" + parts);
			System.out.println("------i value:" + i + " ---------");
		}
		return count;
	}
	// METHOD SIGNATURE ENDS

	public int minimumTime1(int numOfParts, List<Integer> parts) {
		int count = 0;
		if (parts.size() <= 1) {
			return 0;
		}
		Collections.sort(parts);
		count = count + (parts.get(0) + parts.get(1));
		parts.set(0, parts.get(0) + parts.get(1));
		parts.remove(1);
		return count + minimumTime1(numOfParts, parts);
	}

	public static void main(String args[]) {
		Solution1 solution1 = new Solution1();
		int numOfParts = 4;
		List<Integer> parts = new ArrayList<>();
		parts.add(8);
		parts.add(4);
		parts.add(6);
		parts.add(12);
		// System.out.println("Final Result:" + solution1.minimumTime(numOfParts,
		// parts));
		System.out.println("Final Result:" + solution1.minimumTime1(numOfParts, parts));
	}

}

/**
 * 
 */
package test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Akira
 *
 */
public class Solution2Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution1 solution1 = new Solution1();
		List<Integer> parts1 = new ArrayList<>();
		parts1.add(8);
		parts1.add(4);
		parts1.add(6);
		parts1.add(12);
		System.out.println(solution1.minimumTime1(4, parts1));
		
		List<Integer> parts2 = new ArrayList<>();
		parts2.add(8);
		parts2.add(21);
		parts2.add(80);
		parts2.add(5);
		System.out.println(solution1.minimumTime1(4, parts2));

	}

}

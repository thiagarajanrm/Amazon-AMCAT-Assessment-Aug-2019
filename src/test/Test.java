package test;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> parts = new ArrayList<>();
		parts.add(1);
		parts.add(2);
		parts.add(2);
		parts.add(8);
		parts.add(7);
		parts.add(8);
		Test ob = new Test();
		System.out.println("Indexs with max value:" + ob.getIndex(parts));
	}

	public List<Integer> getIndex(List<Integer> parts) {
		int big = parts.get(0);
		List<Integer> indexes = new ArrayList<>();
		for (int i = 1; i < parts.size(); i++) {
			if (big <= parts.get(i)) {
				if (big < parts.get(i)) {
					indexes.clear();
				}
				big = parts.get(i);
				indexes.add(i);
			}
		}

		System.out.println("Biggest Number:" + big);
		return indexes;
	}
}

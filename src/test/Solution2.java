package test;

import java.util.ArrayList;
import java.util.List;

// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHING A PACKAGE MAY BE RESTRICTED
// DEFIND ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
class Solution2 {
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	List<List<Integer>> optimalUtilization(int maxTravelDist, List<List<Integer>> forwardRouteList,
			List<List<Integer>> returnRouteList) {
		// WRITE YOUR CODE HERE
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> resultRoute = null;
		int forwardRouteIdentifier = 0;
		int returnRouteIdentifier = 0;
		int optimalTotalTravelDistance = 0;
		for (int i = 0; i < forwardRouteList.size(); i++) {
			int totalTravelDistance = 0;
			resultRoute = new ArrayList<>();
			for (int j = 0; j < returnRouteList.size(); j++) {
				List<Integer> forwardRoute = forwardRouteList.get(i);
				List<Integer> returnRoute = returnRouteList.get(j);

				int total = forwardRoute.get(1) + returnRoute.get(1);
				// System.out.println("Total:" + total);
				if (total <= maxTravelDist) {
					if (totalTravelDistance < total) {
						totalTravelDistance = total;
						forwardRouteIdentifier = forwardRoute.get(0);
						returnRouteIdentifier = returnRoute.get(0);
					}
				}
			}
			resultRoute.add(forwardRouteIdentifier);
			resultRoute.add(returnRouteIdentifier);

			if (optimalTotalTravelDistance <= totalTravelDistance) {
				if (optimalTotalTravelDistance < totalTravelDistance) {
					result.clear();
				}
				optimalTotalTravelDistance = totalTravelDistance;
				result.add(resultRoute);
			}

		}
		System.out.println("optimalTotalTravelDistance:" + optimalTotalTravelDistance);
		return result;
	}
	// METHOD SIGNATURE ENDS

	public static void main(String[] args) {
		Solution2 ob = new Solution2();

		// Test case 1
		int maxTravelDist1 = 7000;
		List<List<Integer>> forwardRouteList1 = new ArrayList<>();
		List<List<Integer>> returnRouteList1 = new ArrayList<>();
		List<Integer> forwardRoute11 = new ArrayList<>();
		forwardRoute11.add(1);
		forwardRoute11.add(2000);
		List<Integer> forwardRoute12 = new ArrayList<>();
		forwardRoute12.add(2);
		forwardRoute12.add(4000);
		List<Integer> forwardRoute13 = new ArrayList<>();
		forwardRoute13.add(3);
		forwardRoute13.add(6000);
		forwardRouteList1.add(forwardRoute11);
		forwardRouteList1.add(forwardRoute12);
		forwardRouteList1.add(forwardRoute13);

		List<Integer> returnRoute11 = new ArrayList<>();
		returnRoute11.add(1);
		returnRoute11.add(2000);

		returnRouteList1.add(returnRoute11);

		List<List<Integer>> result1 = ob.optimalUtilization(maxTravelDist1, forwardRouteList1, returnRouteList1);
		System.out.println("Test case1:" + result1);

		// Test case 2
		int maxTravelDist2 = 10000;
		List<List<Integer>> forwardRouteList2 = new ArrayList<>();
		List<List<Integer>> returnRouteList2 = new ArrayList<>();
		List<Integer> forwardRoute21 = new ArrayList<>();
		forwardRoute21.add(1);
		forwardRoute21.add(3000);
		List<Integer> forwardRoute22 = new ArrayList<>();
		forwardRoute22.add(2);
		forwardRoute22.add(5000);
		List<Integer> forwardRoute23 = new ArrayList<>();
		forwardRoute23.add(3);
		forwardRoute23.add(7000);
		List<Integer> forwardRoute24 = new ArrayList<>();
		forwardRoute24.add(4);
		forwardRoute24.add(10000);
		forwardRouteList2.add(forwardRoute21);
		forwardRouteList2.add(forwardRoute22);
		forwardRouteList2.add(forwardRoute23);
		forwardRouteList2.add(forwardRoute24);

		List<Integer> returnRoute21 = new ArrayList<>();
		returnRoute21.add(1);
		returnRoute21.add(2000);
		List<Integer> returnRoute22 = new ArrayList<>();
		returnRoute22.add(2);
		returnRoute22.add(3000);
		List<Integer> returnRoute23 = new ArrayList<>();
		returnRoute23.add(3);
		returnRoute23.add(4000);
		List<Integer> returnRoute24 = new ArrayList<>();
		returnRoute24.add(4);
		returnRoute24.add(5000);
		returnRouteList2.add(returnRoute21);
		returnRouteList2.add(returnRoute22);
		returnRouteList2.add(returnRoute23);
		returnRouteList2.add(returnRoute24);
		List<List<Integer>> result = ob.optimalUtilization(maxTravelDist2, forwardRouteList2, returnRouteList2);
		System.out.println("Test case2:" + result);
	}
}

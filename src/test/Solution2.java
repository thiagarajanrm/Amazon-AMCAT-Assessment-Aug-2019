package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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

			// System.out.println("forwardRouteIdentifier,returnRouteIdentifier:" +
			// forwardRouteIdentifier + ","
			// + returnRouteIdentifier);
			System.out.println("totalTravelDistance:" + totalTravelDistance);
			if (optimalTotalTravelDistance < totalTravelDistance) {
				optimalTotalTravelDistance = totalTravelDistance;
				System.out.println("iValue:"+i);
				if(i==forwardRouteList.size()-1) {
				result.add(resultRoute);
				}
			}
			/*else if (optimalTotalTravelDistance == totalTravelDistance){
				result.add(resultRoute);
			}*/
			
		}
		System.out.println("optimalTotalTravelDistance:" + optimalTotalTravelDistance);
		return result;
	}
	// METHOD SIGNATURE ENDS

	public static void main(String[] args) {
		Solution2 ob = new Solution2();
		int maxTravelDist = 10000;
		List<List<Integer>> forwardRouteList = new ArrayList<>();
		List<List<Integer>> returnRouteList = new ArrayList<>();
		List<Integer> forwardRoute1 = new ArrayList<>();
		forwardRoute1.add(1);
		forwardRoute1.add(3000);
		List<Integer> forwardRoute2 = new ArrayList<>();
		forwardRoute2.add(2);
		forwardRoute2.add(5000);
		List<Integer> forwardRoute3 = new ArrayList<>();
		forwardRoute3.add(3);
		forwardRoute3.add(7000);
		List<Integer> forwardRoute4 = new ArrayList<>();
		forwardRoute4.add(4);
		forwardRoute4.add(10000);
		forwardRouteList.add(forwardRoute1);
		forwardRouteList.add(forwardRoute2);
		forwardRouteList.add(forwardRoute3);
		forwardRouteList.add(forwardRoute4);

		List<Integer> returnRoute1 = new ArrayList<>();
		returnRoute1.add(1);
		returnRoute1.add(2000);
		List<Integer> returnRoute2 = new ArrayList<>();
		returnRoute2.add(2);
		returnRoute2.add(3000);
		List<Integer> returnRoute3 = new ArrayList<>();
		returnRoute3.add(3);
		returnRoute3.add(4000);
		List<Integer> returnRoute4 = new ArrayList<>();
		returnRoute4.add(4);
		returnRoute4.add(5000);
		returnRouteList.add(returnRoute1);
		returnRouteList.add(returnRoute2);
		returnRouteList.add(returnRoute3);
		returnRouteList.add(returnRoute4);
		List<List<Integer>> result = ob.optimalUtilization(maxTravelDist, forwardRouteList, returnRouteList);
		for (List<Integer> s : result) {
			System.out.println(s);
		}
	}
}

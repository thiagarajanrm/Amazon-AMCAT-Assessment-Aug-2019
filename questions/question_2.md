**Problem**  

<font color="#6bb1f6">The current selected programming language is <strong>Java</strong>. We emphasize the submission of a fully working code over</br>
partially correct but efficient code. Once <strong>submitted</strong>, you cannot review this program again. You can</br>
use System.out.println() to debug your code. The System.out.println() may not work in case of syntax/runtime error.</br> 
The version of <strong>JDK</strong> being used is <strong>1.8</strong></font>

Amazon Prime Air is developing a system that divides shipping routes using flight optimization routing systems to a cluster  
of aircraft that can fulfill these routes. Each shipping route is identified by a unique integer identifier, requires a fixed non-  
zero amount of travel distance between airports, and is defined to be either a forward shipping route or a return shipping  
route. Identifiers are guaranteed to be unique within their own route type, but not across route types.

Each aircraft should be assigned two shipping routes at once: one forward route and one return route. Due to the complex  
scheduling of flight plans, all aircraft have a fixed maximum operating travel distance, and cannot be scheduled to a fly a  
shipping route that requires more travel distance than the prescribed maximum operating travel distance. The goal of the  
system is to optimize the total operating travel distance of a given aircraft. A forward/return shipping route pair is considered  
to be "optimal" if there does not exist another pair that has a higher operating travel distance than this pair, and also has a  
total less than or equal to the maximum operating travel distance of the aircraft.  

For example, if the aircraft has a maximum operating travel distance of 3000 miles, a forward/return shipping route pair  
using a total of 2900 miles would be optimal if there does not exist a pair that uses a total operating distance of 3000  
miles, but would not be considered optimal if such a pair did exist.

Your task is to write an algorithm to optimize the sets of forward/return shipping route pairs that allow the aircraft to be  
optimally utilized, given a list of forward shipping routes and a list of return shipping route.  
**Input**  
The input to the function/method consists of three arguments:  
*maxTravelDist*, an integer representing the maximum operating travel distance of the given aircraft;  
*forwardRouteList*, a list of pairs of integers where the first integer represents the unique identifier of a forward shipping  
route and the second integer represents the amount of travel distance of required by this shipping route.  
*returnRouteList*, a list of pairs of integers where the first integer represents the unique identifier of a return shipping route  
and the second integer represents the amount of travel distance required by this shipping route.  

**Output**  
Return a list of integers representing the pairs of IDs of forward and return shipping routes that optimally utilize the  
given aircraft. If no route is possible, return a list with empty pair. 

**Examples**  
Example 1:  
Input:  
mazTravelDist = 7000  
forwardRouteList = [[1,2000],[2,4000],[3,6000]]  
returnRouteList = [[1,2000]]  
Output: [[2,1]]  

Example 2:  
Input:  
maxTravelDist = 10000  
forwardRouteList = [[1,3000],[2,5000],[3,7000],[4,10000]]  
returnRouteList = [[1,2000],[2,3000],[3,4000],[4,5000]]  
Output: [[2,4],[3,2]]  
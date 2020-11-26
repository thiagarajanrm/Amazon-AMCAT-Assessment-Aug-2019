**Problem**  

<font color="#6bb1f6">The current selected programming language is <strong>Java</strong>. We emphasize the submission of a fully working code over</br>
partially correct but efficient code. Once <strong>submitted</strong>, you cannot review this program again. You can</br>
use System.out.println() to debug your code. The System.out.println() may not work in case of syntax/runtime error.</br> 
The version of <strong>Java</strong> being used is <strong>1.8</strong></font>

Amazon fulfillment Builder is a new feature that enables Amazon warehouses to create new items to ship to customers out   
of smaller parts. As part of this project, Amazon wants to estimate the time it will take for a worker to create the item to be  
ready for a customer shipment.  

The Amazon Fulfillment Builder will provide an estimate about the time it will take for the item to be created based on the  
size of each of the parts. The worker can only combine two parts at a time. The time required to put two parts together is  
equal to the sum of the parts sizes. The size of the newly constructed part is also equal to the sum of the part's sizes. This  
process is repeated until all of the parts have been merged together to form the final product.  

Write an algorithm to output the minimum possible time to put the N parts together and build the final product.  
**Input**  
The input to the function/method consists of two arguments:  
*numOfParts*, an integer representing the number of the parts  
*parts*, a list of integers representing the size of the parts.  

**Output**  
Return an integer representing the minimum time required to assemble all the parts  

**Constraints**  
2 <= *numOfParts* <= 10<sup>6</sup>  
1 <= *parts*[i] <= 10<sup>6</sup>  
0 <= i < *numOfParts*  

**Example**

Input:  
*numOfParts* = 4  
*parts* = [8, 4, 6, 12]

Output:  
58

Explanation:  
The optimal way to merge the subfiles is as follows  
Step 1: Assemble the parts of size 4 and 6 (time required is 10). Size of remaining parts after merging: [8,10,12]  
Step 2: Assemble the parts of size 8 and 10 (time required is 18). Size of remaining parts after merging: [18,12]  
Step 3: Assemble the parts of size 18 and 12 (time required is 30). 
Total time required to assemble the parts is 10+18+30 =58

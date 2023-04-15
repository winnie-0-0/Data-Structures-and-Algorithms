// LINEAR SEARCH 
/* https://leetcode.com/problems/find-numbers-with-even-number-of-digits/ 
 

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.

 */
import java.util.Arrays;

 class Solution {

    public static void main(String[] args){

        int[] nums = {23,67,88889,3,000,9,8};
        int count = findNumbers(nums);
        System.out.println("\nThe number of integers with Even digits in given array : " + Arrays.toString(nums) + " is = " + count);

    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int ele : nums){
            int n = ele;
            int digits = 0;
            while (n > 0){
                n = (n - n%10)/10; 
                // can also be simply written as n/10
                // Also this could be added separately as method
                // also simply  digits(n) function could be used
                digits ++;
            }

            if(digits%2 == 0){
                count++;
            }
        }

        return count;
        
    }
}
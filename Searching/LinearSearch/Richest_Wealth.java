/*

Question : https://leetcode.com/problems/richest-customer-wealth/
 You are given an m x n integer grid accounts where accounts[i][j] is 
 the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. 
 Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their 
bank accounts. The richest customer is the customer that has the 
maximum wealth.

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, 
so return 6.
  
 */
package LinearSearch;

import java.util.Arrays;

public class Richest_Wealth {
    public static void main(String[] args) {

        int[][] accounts = {{1,2,3},{3,2,1}};
        
        System.out.println("The Richest wealth amongst given Customers :\n" );
        for(int[] arr : accounts){
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("\nis :  " +  maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int[] wealth = new int[accounts.length];
        for(int i = 0; i < accounts.length ; i++){           
            wealth[i] = sumOfWealth(accounts[i]);
        }

        return highest(wealth);
            
    }

    public static int sumOfWealth(int[] custom){
        int sum = 0;
        for(int val : custom){
            sum = sum + val;
        }
        return sum;
    }

    public static int highest(int[] wealth){
        int max = wealth[0];
        for(int ele : wealth){
            if(max <= ele){
                max = ele;
            }
        }

        return max;
    }
    
}

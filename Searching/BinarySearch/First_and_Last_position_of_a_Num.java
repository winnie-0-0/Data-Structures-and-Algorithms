package BinarySearch;
/*
LEETCODE 34.
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity. 

link : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
*/
import java.util.*;

public class First_and_Last_position_of_a_Num{
    public static void main(String[] args) {
        int[] arr1 = {5,5,7,7,7,7,8,8,9};
        
        System.out.println(Arrays.toString(searchRange(arr1, 7)));
        
    }

    static int[] searchRange(int[] arr, int target){
        int[] ans = {-1,-1};
        int start = search(arr, target, true);
        int end = search(arr, target, false);

        ans[0] = start;
        ans[1] = end;
        
        return ans;
    }

    static int search(int[] nums, int target, boolean startIndSearch){

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while(start <= end){
            //calculating mid 
            int mid = start + (end - start)/2 ;
            //checking if target > , = , < mid
            if(target == nums[mid]){
                
                ans = mid ;

                if(startIndSearch){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }

                
            }

            if(target > nums[mid]){
                start = mid +1;
            }

            if(target < nums[mid]){
                end = mid - 1;
            }
        }

        return ans; 
    }
}
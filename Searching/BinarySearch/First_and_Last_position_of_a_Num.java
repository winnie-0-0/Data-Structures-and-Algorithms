package BinarySearch;

/*
LEETCODE 34.
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity. 

link : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
*/
import java.util.*;

public class First_and_Last_position_of_a_Num {
    public static void main(String[] args) {
        int[] arr1 = { 5, 5, 7, 7, 7, 7, 8, 8, 9 };

        System.out.println(Arrays.toString(searchRange(arr1, 7)));

    }

    static int[] searchRange(int[] arr, int target) {
        int[] ans = { -1, -1 };
        ans[0] = search(arr, target, true); // here two cases :
        // (1) num returned ~
        // for number returned means it would already find its "start index" as bool is
        // set to true !! so then we need to find the "end intex" by setting bool to
        // false and
        // calling function again !!
        // (2) -1 returned ~
        // In this case as the array is already traversed and number is ony not found
        // then
        // why to traverse again try to find "end point"
        if (ans[0] != -1) {
            ans[1] = search(arr, target, false);
        }

        return ans;
    }

    static int search(int[] nums, int target, boolean startIndSearch) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            // calculating mid
            int mid = start + (end - start) / 2;
            // checking if target > , = , < mid
            if (target == nums[mid]) {

                ans = mid;

                // When the number is found only then we will go right side and left side..for
                // case (1) in above function
                if (startIndSearch) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }

            if (target > nums[mid]) {
                start = mid + 1;
            }

            if (target < nums[mid]) {
                end = mid - 1;
            }
        }

        return ans;
    }
}
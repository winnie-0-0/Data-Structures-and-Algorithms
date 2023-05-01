
/*
 * GFG link :  https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
 * Suppose you have a sorted array of infinite numbers, how would you search an element in the array?
Source: Amazon Interview Experience.

assume that length is not given !!
Complexity of following code : log(n)

the idea is simple which is applying reverse of binary search to calculate start and end : 
increasing array size to be searched by 2*n.
 */
package BinarySearch;

public class search_in_infinite_array{
    public static void main(String[] args) {

        int[] arr = {-2, 3, 45, 67, 88 ,450, 670, 899, 901, 925, 999, 8000, 45678, 50000, 54637};

        int ans = search(arr, 450);

        System.out.println("\nBinary Searched in Infinite Array (length not determined)!!\n found target at index : " + Integer.toString(ans));
        
    }

    static int search(int[] arr, int target){
        int start = 0;
        int end = 1;
        

        while(target > arr[end]){
            int newstart = end + 1;
            end = end + (end - start + 1)*2;
            start = newstart;
            
            
        }

        return binarySearch(arr, target, start, end );

    
    }

    static int binarySearch(int[] arr, int target, int start, int end){


        while(start <= end){
            //calculating mid 
            int mid = start + (end - start)/2 ;
            //checking if target > , = , < mid
            if(target == arr[mid]){
                return mid ;
            }

            if(target > arr[mid]){
                start = mid +1;
            }

            if(target < arr[mid]){
                end = mid - 1;
            }
        }

        return -1;

    }
}
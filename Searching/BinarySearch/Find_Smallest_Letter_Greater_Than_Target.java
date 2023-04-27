/* 744. Find Smallest Letter Greater Than Target 
    You are given an array of characters letters that is sorted in non-decreasing order, and a character target. 
    There are at least two different characters in letters.
    Return the smallest character in letters that is lexicographically greater than target. 
    If such a character does not exist, return the first character in letters.

    Leetcode : https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
*/
package BinarySearch;

public class Find_Smallest_Letter_Greater_Than_Target{
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        System.out.println(nextGreatestLetter(letters, 'z'));
    }

    
    static char nextGreatestLetter(char[] letters, char target) {
    
        int start = 0;
        int end = letters.length - 1;
              
        while(start <= end){
            int mid = start + (end - start)/2;
            if(letters[mid] > target){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
                
                // if(letters[mid] <  target){
                //     start = mid + 1;
                // } in this case if we use 2 ifs instead of if-else whenever == condition occurs none of the if statement works and hence no increment decrement occurs which in turn leads to infinite while loop
        }
        
        //the below modulus resolution also works for round alphabetical ordering i.e. 
        //when "z" is paased as target and it is not present in array then "0"th index is returned
        return letters[start % letters.length];
            
    }
}

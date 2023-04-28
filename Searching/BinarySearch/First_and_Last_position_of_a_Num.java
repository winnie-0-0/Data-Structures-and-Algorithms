package BinarySearch;

public class First_and_Last_position_of_a_Num{
    public static void main(String[] args) {

        System.out.println(searchRange(null, 0));
        
    }

    static int[] searchRange(int[] arr, int target){
        int[] ans = {-1,-1};
        int start = search(ans, target, true);
        int end = search(ans, target, false);

        ans[0] = start;
        ans[1] = end;
        
        return ans;
    }

    static int search(int[] nums, int target, boolean startIndSearch){

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while(start <= end){
            //calculating mid 
            int mid = start + (end - start)/2 ;
            //checking if target > , = , < mid
            if(target == arr[mid]){
                ans = mid ;
                if(startIndSerach){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }

            if(target > arr[mid]){
                start = mid +1;
            }

            if(target < arr[mid]){
                end = mid - 1;
            }
        }

        return ans;
    }
}
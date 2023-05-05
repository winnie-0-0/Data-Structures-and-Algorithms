package BinarySearch;

public class SplitArrayLargestSum{
    public static void main(String[] args) {
        int ans = splitArray(new int[] { 7,2,5,8,10},2);
        System.out.println("Largest sum : " + ans);
        
    }
    
        static int splitArray(int[] nums, int k) {
            int start = 0;
            int end = 0;
    
            for(int i =0 ; i < nums.length; i++){
                start = Math.max(start, nums[i]);
                /* by the end of this loop start will have max element */
    
                end = end + nums[i];
    
            }
    
            // binary search
    
            while(start < end){
    
                //try for the middle as potential answer
                int mid = start + (end - start)/2 ;
                // calculate how many pieces you can divide this in with this max sum
                int sum = 0;
                int pieces = 1;
                for(int num : nums){
    
                    if(sum + num > mid){
                        // cannot add this in this sub- array make new one
                        //say add this num in new-sub array then num == sum 
                        sum = num;
                        pieces++;
                    }else{
                        sum = sum + num;
                    }
    
                }
    
                if (pieces > k){
                    start = mid + 1;
                }else{
                    end = mid;
                }
    
            }
    
            return end; // here start == end
        }
    }
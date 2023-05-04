package BinarySearch;

public class rotated_binary_search {
    public static void main(String[] args) {
        int[] arr = {2,9,1,2,2,2};
        System.out.println((Search(arr, 1)));
        
    }

    static int findPivot(int[] arr){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid =  start + (end - start)/2;
            //if(arr[mid] > arr[mid + 1]) gives index out of bound exception for mid == end hence this should be checked only when mid < end
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            if(arr[start] > arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }

        return -1 ;

    }

    static int Search(int[] arr , int target){

        int pivot = findPivot(arr);
        // System.out.println(pivot);
        if (pivot == -1 ){

            return BinarySearch(arr , target, 0 , arr.length - 1);

        }else if (arr[pivot] == target){

            return pivot;
             
        }else if(arr[0] <= target){

            return BinarySearch(arr, target, 0 , pivot-1);           
            
        }else{
                return BinarySearch(arr, target, pivot+1 , arr.length -1);
            }
        }

        

    

    static int BinarySearch(int[] arr, int target, int start, int end){

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

    static int findDupPivot(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid =  start + (end - start)/2;
            //basic 4 cases
            //if(arr[mid] > arr[mid + 1]) gives index out of bound exception for mid == end hence this should be checked only when mid < end
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            if(arr[start] > arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }

            // when mid = start = end 
            if(arr[mid] == arr[start] && arr[mid] == arr[end] ){
                //skip dupes
                if(arr[start] > arr[start +1] ){
                    return start;
                }
                start++;

                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
                // what if these were pivots ? solved above
            } else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid + 1;
            } else {
                end = mid -1;
            }


        }   

        return -1;
    }
}
package BinarySearch;

public class rotated_binary_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6};
        System.out.println((Search(arr, 4)));
        
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

        if (pivot == -1 ){

            return BinarySearch(arr , target, 0 , arr.length - 1);

        }else if (arr[pivot] == target){

            return pivot;
             
        }else if(arr[0] < target){

            return BinarySearch(arr, target, 0 , pivot - 1);           
            
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
}
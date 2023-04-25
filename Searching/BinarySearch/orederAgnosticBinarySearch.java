package BinarySearch;

public class orederAgnosticBinarySearch {

   public static void main(String[] args){
        int[] arr = {-2, 3, 45, 67, 88 ,999, 8000, 54637};

        int ans = agnosticSearch(arr, 8000);
        System.out.println("\nBinary agnostic Searched and found target at index : " + Integer.toString(ans));

    

   }

   static int agnosticSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        if (arr[start] == arr[end]){
            //Constant 
            if(target == arr[start]){
                return start;
            }else {
                return -1;
            }
        }
        else if(arr[start] < arr[end]){
            //Ascending order
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
        }else{
            //Descending order
            while(start <= end){
                //calculating mid 
                int mid = start + (end - start)/2 ;
                //checking if target > , = , < mid
                if(target == arr[mid]){
                    return mid ;
                }
    
                if(target > arr[mid]){
                    end = mid - 1;
                }
    
                if(target < arr[mid]){
                    start = mid +1;
                }
            }
        }

        return -1;
   }
    
}

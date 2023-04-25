package BinarySearch;

public class basicBinarySearchAlgo {
    public static void main(String[] args){

        int[] arr = {-2, 3, 45, 67, 88 ,999, 8000, 54637};

        int ans = binarySearch(arr, 450);

        System.out.println("\nBinary Searched and found target at index : " + Integer.toString(ans));

    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

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

/*
 For descending order : 

 package BinarySearch;

public class basicBinarySearchAlgo {
    public static void main(String[] args){

        int[] arr = {-2, 3, 45, 67, 88 ,999, 8000, 54637};

        int ans = binarySearch(arr, 450);

        System.out.println("\nBinary Searched and found target at index : " + Integer.toString(ans));

    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

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

        return -1;

    }
}


 */
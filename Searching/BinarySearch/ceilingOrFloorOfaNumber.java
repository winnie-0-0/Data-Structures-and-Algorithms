package BinarySearch;
/*Find ceiling or floor of a number from the input array ! */
public class ceilingOrFloorOfaNumber {
    public static void main(String[] args){

        int[] arr = {-2, 3, 45, 67, 88 ,999, 8000, 54637};

        int ans = ceilOrFloor(arr, 450, 1);
        int ans1 = ceilOrFloor(arr, 450, 0);
        System.out.println("\nCeiling of input number : " + Integer.toString(arr[ans]));
        System.out.println("\nFloor of input number : " + Integer.toString(arr[ans1]));

    }

    static int ceilOrFloor(int[] arr, int target, int cF){
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

        if(cF == 1){
            return start;
        }else{
            return end;
        }
        

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
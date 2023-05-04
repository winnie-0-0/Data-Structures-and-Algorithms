package BinarySearch;

public class rotationCountinBs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int ans = findPivot(arr);
        System.out.println("Rotations : "+ (ans + 1));
        
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
}

package BinarySearch;

public class peak_index_in_a_mountainArray {
    public static void main(String[] args) {

        int[] arr = {0,10,5,2};
        int ans = peakIndexInMountainArray(arr);
        System.out.println("\nThe peak index of given Mountain Array is :" + Integer.toString(ans) );



    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid; // element lies in right side of mid, and it can be mid as well !
            }

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
                // element lies in left of mid , mid excluded coz already there exists a num
                // greater than mid !
            }

            // in the end start == end , which will be the last iteration for the loop.

        }

        return start;

    }

}

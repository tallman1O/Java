package Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,5,10,14,17,24,25,30,36,40};
        int target = 36;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    //return the index
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            //int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else return mid; //ans found
        }

        return -1;
    }
}

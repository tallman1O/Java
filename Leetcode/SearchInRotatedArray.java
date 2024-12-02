package Leetcode;

//https://leetcode.com/problems/search-in-rotated-sorted-array/
//33. Search in Rotated Sorted Array
public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr, target));

    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int pivot = pivot(nums);

        if (pivot == -1){
            return binarySearch(nums,target, 0, nums.length - 1);
        }

        if (nums[pivot] == target){
            return pivot;
        } else if (nums[start] <= target){
            end = pivot - 1;
            return binarySearch(nums,target,start,end);
        } else {
            start = pivot + 1;
            return binarySearch(nums,target,start,end);
        }

    }

    static int pivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (end > mid && nums[mid] > nums[mid + 1]){
                return mid;
            } else if (start < mid && nums[mid]<nums[mid - 1]) {
                return mid - 1;
            } else if (nums[start] >= nums[mid]) {
                end = mid - 1;
            } else start = mid + 1;
        }
        return -1;
    }

    static int binarySearch(int[] nums, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;

            if (target > nums[mid]){
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else return mid;
        }

        return -1;
    }
}
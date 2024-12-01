package Leetcode;

//https://leetcode.com/problems/find-in-mountain-array/description/
//1095. Find in Mountain Array

public class FindInMountainArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(findInMountainArray(3, arr));

    }

    public static int findInMountainArray(int target, int[] mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        int firstHalf = agnosticBS(mountainArr, target, 0, peak);
        if (firstHalf != -1){
            return firstHalf;
        }
        int secondHalf = agnosticBS(mountainArr, target, peak, mountainArr.length-1);
        return secondHalf;

    }

    public static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    static int agnosticBS(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) return mid;

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else start = mid + 1;
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else start = mid + 1;
            }
        }
        return -1;
    }
}

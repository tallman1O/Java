package Leetcode;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
//852. Peak Index in a Mountain Array

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {24,69,100,99,79,78,67,36,26,19};
        System.out.println(peakIndexInMountainArray(arr));

    }

    public static int peakIndexInMountainArray(int[] arr) {
        int count = Integer.MIN_VALUE;
        int peakIndex = -1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > count) {
                count = arr[i];
                peakIndex = i;
            }
        }
        return peakIndex;

    }
}

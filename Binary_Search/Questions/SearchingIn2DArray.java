package Binary_Search.Questions;

import java.util.Arrays;

//Question - Matrix is sorted in row wise and col wise manner.
public class SearchingIn2DArray{
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45}, {28, 29, 37, 49}, {33, 34, 38, 50}};
        int target = 37;
        System.out.println(Arrays.toString(matrix(arr, target)));

    }

    static int[] matrix(int[][] arr, int target) {
        int r = 0;
        int c = arr.length - 1;

        while (r < arr.length && c >= 0) {
            if (arr[r][c] == target) {
                return new int[]{r, c};
            }

            if (arr[r][c] < target) {
                r++;
            } else c--;
        }

        return new int[]{-1, -1};
    }

}

package Linear_search;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {18,12,2,3},
                {42,15},
        };
        int target = 122;
        System.out.println(search(arr, target));
    }

    static boolean search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length ; col++){
                if(arr[row][col] == target) return true;
            }
        }
        return false;

    }
}

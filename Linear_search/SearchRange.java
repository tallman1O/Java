package Linear_search;

//Search for 3 in the Range of index [1,4]
public class SearchRange {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,5,12,3};
        int target = 3;
        System.out.println(Range(arr,target));
    }

    static boolean Range(int[] arr, int target){
        for (int i = 1; i <= 4; i++){
            if (arr[i] == target) return true;
        }
      return false;
    }

}

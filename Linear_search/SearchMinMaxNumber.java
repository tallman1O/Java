package Linear_search;

public class SearchMinMaxNumber {
    public static void main(String[] args) {
        int[] arr = {12,33,2,45,33,21,11};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    static int min(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    static int max(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (min<arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}

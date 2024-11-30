package Binary_Search.Questions;

//Question - Find the smallest element in array greater than or equal to the target.
public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println(Ceiling(arr, target));
    }

    static int Ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target > arr[end]) return -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target > arr[mid]){
                start = mid + 1;
            } else end = mid - 1;
        }

        return arr[start];
    }
}

//first approach
//static int Ceiling(int[] arr, int target){
//    int start = 0;
//    int end = arr.length - 1;
//
//    while (start <= end) {
//        int mid = start + (end - start) / 2;
//
//        if (target > arr[mid]) {
//            start = mid + 1;
//        } else if (target < arr[mid]) {
//            end = mid - 1;
//        } else return arr[mid];
//    }
//    for (int i = 0; i < arr.length; i++){
//        if (arr[i] > target) return arr[i];
//    }
//
//    return -1;
//}

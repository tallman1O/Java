package Binary_Search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {2, 5, 10, 14, 17, 24, 25, 30, 36, 40};
        int[] arr2 = {40, 36, 24, 20, 13, 12, 11, 4, 1};
        int target = 36;
        int ans = agnosticBS(arr, target);
        int ans2 = agnosticBS(arr2, target);
        System.out.println(ans);
        System.out.println(ans2);
    }

    static int agnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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

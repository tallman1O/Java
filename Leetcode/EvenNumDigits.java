package Leetcode;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
//1295
public class EvenNumDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if(even(nums[i])) count++;
        }
        return count;
    }

    static boolean even(int num){
        int numOfDigits = digits(num);
        return numOfDigits % 2 == 0;
    }

    static int digits(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;

    }
}

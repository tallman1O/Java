package Leetcode;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
//744. Find Smallest Letter Greater Than Target
public class SmallestLetter {
    public static void main(String[] args) {
       char[] letters = {'c','f','j'};
       char target = 'z';
        System.out.println(nextGreatestLetter(letters, target));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        if (target > letters[end]) return letters[start];

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target < letters[mid]){
                end = mid - 1;
            } else start = mid + 1;
        }

        return letters[start];

    }


}

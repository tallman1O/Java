package Linear_search;

//Question 1 - Search for a character in a string.
public class SearchString {

    public static void main(String[] args) {
        String name = "Mehul";
        char target = 't';
        System.out.println(search(name, target));


    }

    static boolean search(String str, char target){
        if (str.isEmpty()) return false;

        for (int i = 0; i < str.length(); i++){
            char value = str.charAt(i);
            if (value == target) return true;
        }
        return false;
    }
}

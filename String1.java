import java.util.*;

class String1 {
    public static void main(String args[]) {
        String str = "geeksforgeeks";
        HashMap<Character, Integer> hash = new HashMap<>();
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char currentChar = arr[i];
            if (hash.containsKey(currentChar)) {
                hash.put(currentChar, hash.get(currentChar) + 1);
            } else {
                hash.put(currentChar, 1);
            }
        }

        for (Map.Entry<Character, Integer> e : hash.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}

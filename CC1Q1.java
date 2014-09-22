/**
 * Tian Zheng Sep 21, 14
 * Check if a string has all unique chars.
 * Uses additional space, need to be revised in v2
 */

public class CC1Q1 {
    
    // Boolean and boolean are different!
    public static boolean allUnique(String word) {
        // if the word is longer than 128, at least one
        // ASCII char used more than once
        if (word.length() > 128) {
            return false;
        }
        
        // Assign one ASCII char to one index
        boolean[] check = new boolean[128];
        
        for (int i = 0; i < word.length(); i++) {
            int ascii = word.charAt(i);
            // if check[] is Boolean object, initial is null
            // unboxing null will cause null pointer exception
            if (check[ascii]) {
                return false;
            }
            check[ascii] = true;
        }
        return true; 
    }
    
    public static void main(String[] args) {
        String[] strings = {"aabbccdd", "apple", "china"};
        for (String string : strings) {
            System.out.println(string + ": " + allUnique(string));
        }
    }
}
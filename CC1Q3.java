/**
 * Tian Zheng Sep.23, 2014
 * Check wher one string is a permutation of another
 * Learned: add email to GitHub when config local git!
 */

class CC1Q3 {
    public static boolean isPermutation(String lhd, String rhd) {
        final int asciiTotal = 128;
        int lhdLength = lhd.length();
        int rhdLength = rhd.length();
        
        // If they have different lenth, not permutation
        if (lhdLength != rhdLength) {
            return false;
        }
        
        // Count how many times each char appears
        int[] lhdArray = new int[asciiTotal];
        int[] rhdArray = new int[asciiTotal];
        
        for (int i = 0;i < lhdLength; i++) {
            int leftIndex = lhd.charAt(i);
            lhdArray[leftIndex]++;
            int rightIndex = rhd.charAt(i);
            rhdArray[rightIndex]++;
        }
        
        // If number of characters does not match, false
        for (int i = 0; i < asciiTotal; i++) {
            if (lhdArray[i] != rhdArray[i]) {
                return false;
            }
        }
          
        return true;
    }
    
    public static void main(String[] args) {
        String firstLeft = "china";
        String firstRight = "anhci";
        String secondLeft = "fsdf5";
        String secondRight = "5fds5";
        
        System.out.println("First: " + isPermutation(firstLeft, firstRight) 
                         + " Second: " + isPermutation(secondLeft, secondRight));
    }
}
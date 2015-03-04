// Count trailing 0s of n!

class Untitled {
    public static void main(String[] args) {
        System.out.println(trailingZero(30));
    }
    
    static int trailingZero(int n) {
        int count = 0;
        if (n <= 0) return count;
        
        for (int i = 5; n / i > 0; i *= 5) {
            count += n / i;
        }
        
        return count;
    }
}
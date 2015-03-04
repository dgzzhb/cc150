class Untitled {
    public static void main(String[] args) {
        System.out.println(reverse("China"));
        System.out.println(reverse("SHerry"));
    }
    
    static String reverse(String s) {
        char[] c = s.toCharArray();
        
        for (int i = 0; i <= s.length() / 2; i++) {
            char temp = c[i];
            c[i] = c[s.length() - 1 - i];
            c[s.length() - 1 - i] = temp;
        }
        return new String(c);
    }
}
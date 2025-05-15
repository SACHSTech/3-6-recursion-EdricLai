package recursion.tier2;

public class ReverseAString {
    /**
     * A recursive function that returns
     * the reversed string
     * @param s string
     * @return the reversed string
    */
    public static String reverse(String s) {
        // base case: if string is empty
        if (s.length() == 0) {
            return s;
        }
        
        // recursive case: each itt takes last char and append
        return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
    }

    // testing
    public static void main(String[] args) {
        System.out.println(reverse("hello")); // Output: olleh
    }
}
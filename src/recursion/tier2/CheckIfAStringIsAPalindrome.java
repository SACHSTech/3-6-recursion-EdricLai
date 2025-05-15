package recursion.tier2;

public class CheckIfAStringIsAPalindrome {
    /**
     * A recursive function that returns
     * true if the string is a palindrome
     * @param s string
     * @return true/false if s is a palindrome
    */
    public static boolean isPalindrome(String s) {
        // base case
        if (s.length() <= 1) {
            return true;
        }

        // check first and last char if equal
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        // recursive case: each itt loses first and last char
        return isPalindrome(s.substring(1, s.length() - 1));
    }
    
    // testing
    public static void main(String[] args) {
        System.out.println(isPalindrome("wow")); // Output: true
        System.out.println(isPalindrome("hello")); // Output: false
    }
}
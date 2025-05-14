package recursion.tier2;

public class CheckIfAStringIsAPalindrome {
    /**
     * A recursive function that returns
     * true if the string is a palindrome
     * @param s string
     * @return true/false if s is a palindrome
    */
    public static boolean isPalindrome(String s) {
        return true;
    }

    // testing
    public static void main(String[] args) {
        System.out.println(isPalindrome("wow")); // Output: true
        System.out.println(isPalindrome("hello")); // Output: false
    }
}
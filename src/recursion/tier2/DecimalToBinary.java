package recursion.tier2;

public class DecimalToBinary {
    /**
     * A recursive function that returns
     * the binary representation of n
     * as a string
     * @param n number
     * @return binary representation of n
    */
    public static String toBinary(int n) {
        // base case
        if (n < 0) {
            return "";
        }
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }

        /*
        recursive case:
            divide n by 2 to shift to the next power of 2
            n % 2 to get the last binary digit
            each call builds the binary string
        */ 
        return toBinary(n / 2) + Integer.toString(n % 2);
    }
    
    // testing
    public static void main(String[] args) {
        System.out.println(toBinary(10)); // Output: 1010
        System.out.println(toBinary(0)); // Output: 0
        System.out.println(toBinary(254)); // Output: 11111110
        System.out.println(toBinary(1284)); // Output: 10100000100
    }
}
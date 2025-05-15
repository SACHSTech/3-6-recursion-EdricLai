package recursion.tier2;

public class SumOfDigits {
    /**
     * A recursive function that returns
     * the sum of all digits in n
     * @param n number
     * @return sum of all digits
    */
    public static int sumOfDigits(int n) {
        // base case
        if (n <= 0) {
            return 0;
        }

        // recursive case
        return (n % 10) + sumOfDigits(n / 10);
    }
       
    // testing
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234)); // Output: 10
    }
}
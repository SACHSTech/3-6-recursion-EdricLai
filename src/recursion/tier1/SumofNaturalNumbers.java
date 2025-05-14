package recursion.tier1;

public class SumofNaturalNumbers {
    /**
     * A recursive function that returns
     * the sum of numbers from 1 to n
     * @param n number
     * @return the sum of numbers from 1-n
    */
    public static int sum(int n) {
        // base case
        if (n == 0) {
            return 0;
        }

        // recursive case
        return n + sum(n - 1);
    }
    
    // testing
    public static void main(String[] args) {
        System.out.println(sum(5)); // Output: 15
    }
}
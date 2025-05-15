package recursion.tier2;

public class PowerFunction {
    /**
     * A recursive function that computes
     * the base to the power of exponent
     * @param base base integer
     * @param exponent exponent integer
     * @return calculated result
    */
    public static int power(int base, int exponent) {
        // base case
        if (exponent == 1) {
            return base;
        }
        
        // recursive case
        return base * power(base, exponent - 1);
    }
    
    // testing
    public static void main(String[] args) {
        System.out.println(power(2, 3)); // Output: 8
    }
}
package recursion.tier1;

public class CountDownTimer {
    /**
     * A recursive function that prints
     * numers from n down to 1
     * @param n number
    */
    public static void countDown(int n) {
        if (n >= 1) {
            System.out.println(n);
            countDown(n - 1);
        }
    }
    
    // testing
    public static void main(String[] args) {
        countDown(5); // Output: 5 4 3 2 1
    }
}
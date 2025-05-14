package recursion.tier1;

public class EvenNumbersInARange {
    /**
     * A recursive function that prints
     * all even numbers between start
     * and end (inclusive)
     * @param start start of num range
     * @param end end of num range
    */
    public static void printEvens(int start, int end) {
        if (start % 2 == 0) {
            System.out.println(start);
        }
        if (start < end) {
            printEvens(start + 1, end);
        }
    }

    // testing
    public static void main(String[] args) {
        printEvens(1,10); // Output: 2,4,6,8,10
    }
}
public class Factorial {
    /**
     * Returns the factorial of the argument given
     *
     * @param n the number for which to calculate the factorial
     * @return the factorial
     */
    public static long factorial(long n) throws IllegalArgumentException {
        long fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

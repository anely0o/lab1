public class Poblem3 {
    /**
     *
     * @param n to check primatiry
     * @return "prime" if the number is prime, and "composite" if its composite
     */
    public static String checkPrime(int n) {
        if (n <= 1) {
            return "composite";
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return "composite";
            }
        }
        return "prime";
    }
}

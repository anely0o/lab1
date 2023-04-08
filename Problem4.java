public class Problem4 {
    public class Factorial {
        /**
         * calculates the factorial of n with factorial method
         * @param args
         */
        public static void main(String[] args) {
            int n = 5;
            int result = factorial(n);
            System.out.println(n + "! = " + result);
        }

        /**
         *
         * @param n is the number that we need to find factorial of
         * @return the factorial of n number
         */
        public static int factorial(int n) {
            if (n == 0) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }
    }
}

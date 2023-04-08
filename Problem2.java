/**the calculateAvr method calculates the average value of an array of integers;
 * n The number of elements in the array.
 * arr is The array of integers.
 * @return The average value of the array.
 */

public class Problem2 {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {3,2,4,1};
        double average = calculateAvr(n, arr);
        System.out.println(average);
    }

    public static double calculateAvr(int n, int[] arr){
        return calculateSum(n, arr, 0) / (double) n;
    }

    /**
     *
     *
     * @param n the number of elements in the array
     * @param arr of integers
     * @param index of the current elements that has been added to array
     * @return the sum of the array
     */
    public static int calculateSum(int n, int[] arr, int index){
        if (index == n) {
            return 0;
        }
        else {
            return arr[index] + calculateSum(n, arr, index+1);
        }
    }
}
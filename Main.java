/** n The number of elements in the array.
 *  findMininum method finds the minimum value in an array of integers.
 *  @return The minimum value in the array.
 *  arr is used for the array of integers to search for the minimum value.
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {10,5,32,3,45};
        int min = findMininum(arr, arr.length);
        System.out.println("Minimum in the array is: " + min);
    }
    public static int findMininum(int[] arr, int n){
        int min = 1000;
        for(int i = 0; i < n; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
# Task 1
Description: Return the minimum of the array.
Explanation: method uses a for loop to iterate through the array and compares each element to a variable called min. At first, the min variable is initialized to a large number, such as 1000, to ensure that it is larger than any value in the array. If an element in the array is smaller than the min variable, then the min variable is updated with the smaller value.
Solution:
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

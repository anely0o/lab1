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
import java.util.Scanner;


public class Problem6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int n= sc.nextInt();
        System.out.println(square(a,n));

    }

    /**
     *
     * @param a a number
     * @param n is for a raised with the power of n
     * @return the value a with the power of n
     */
    static int square(int a,int n){
        if(n==0){
            return 1;
        }
        return a*(int)Math.pow(a,n-1);
    }
}


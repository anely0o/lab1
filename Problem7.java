
import java.util.Scanner;
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        rec(n);
    }

    /**
     * rec() method to enter n and stores to a
     * @param n is an argument
     */
    static void rec(int n){
        if(n==0){
            return;
        }
        else{
            Scanner sc=new Scanner(System.in);
            int a= sc.nextInt();
            rec(n-1);
            System.out.print(a+" ");
        }
    }
}

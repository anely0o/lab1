
import java.util.Scanner;
public class Problem10 {
    /**
     * @param args not used
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println(gcd(a,b,c));
    }

    /**
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return the GCD of a, b and c
     */
    static int gcd(int a, int b, int c){
        if(a%c==0 && b%c==0){
            return c;
        }
        return gcd(a,b,c-1);
    }

}

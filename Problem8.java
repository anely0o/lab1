
import java.util.Scanner;
public class Problem8 {
    /**
     *
     * @param s string to check
     * @param n index of character that is now being checked
     */
    public static void rec(String s,int n){
        //non digit characters
        if(n<0){
            System.out.print("Yes");
            return;
        }
        //if the character is not digit, outputs no
        if(s.charAt(n)<'0' || s.charAt(n)>'9'){
            System.out.print("No");
            return;
        }
        else{
            rec(s, n-1);
        }

    }

    /**
     *
     * @param args not used
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length()-1;
        rec(s, n);
    }
}

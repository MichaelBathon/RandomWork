import java.lang.Math;
import java.util.Scanner;

/**
 * Created by michaelbathon on 1/24/16.
 */
public class HackForLoop {

    static void loopExponent(int a, int b, int n){
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = 0;
            for (int v = 0; v <= i; v++) {
                ans += ((int) Math.pow(2, v) * b);
            }
            ans += a;
            System.out.print(ans + " ");
        }
        System.out.println("\n");
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            loopExponent(a,b,n);
        }

    }
}

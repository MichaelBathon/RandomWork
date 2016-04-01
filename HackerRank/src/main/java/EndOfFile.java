import java.util.Scanner;

/**
 * Created by michaelbathon on 1/24/16.
 */
public class EndOfFile {

    static int i = 1;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            String x = sc.nextLine();
            System.out.println(i + " " + x);
            i++;
        }
    }
}

import java.util.Scanner;

/**
 * Created by michaelbathon on 1/13/16.
 */
public class Greeting {


    public static void main(String[] args) {

        String alice = "Alice", bob = "Bob";

        Scanner name = new Scanner(System.in);

        System.out.println("Please enter you're name, and do please remember to capitalize" +
                " the first letter, thanks!\nEnter your name here: ");

        String userName = name.nextLine();

        if (userName.equals(alice) || userName.equals(bob)) {
            System.out.println("Hey, " + userName + " good to see you, hope you are doing well!");
        }

    }


}

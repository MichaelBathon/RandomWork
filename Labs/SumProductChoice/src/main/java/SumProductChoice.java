import java.util.Scanner;


/**
 * Created by michaelbathon on 1/14/16.
 */
public class SumProductChoice {

   static int number = 0;

        public static int sumAll(int x) {
            for(int i = 1; i <= x; i++) {
                number = number + i;
            }
            return number;
        }

       static public int product(int y) {

            if (y==1){
                return 1;}
            else return y * product(y - 1);

        }


    public static void main(String[] args){

        String sum = "sum";

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");

        int userInput = input.nextInt();

        Scanner choice = new Scanner(System.in);

        System.out.println("Please choose if you want the number summed or the product:");

        String userChoice = choice.nextLine();


        if(userChoice.equals(sum)){
            System.out.println("If works");

            System.out.println(sumAll(userInput));
        }
        else {
            System.out.println("Else works");

            System.out.println(product(userInput));
        }



    }

}

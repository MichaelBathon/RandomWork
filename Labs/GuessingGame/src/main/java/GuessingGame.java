import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by michaelbathon on 1/14/16.
 */
public class GuessingGame {



    public static void main(String[] args){

        int x = 4;

        int userInput = 0;

        ArrayList<Integer> list = new ArrayList<Integer>();



        do {Scanner input = new Scanner(System.in);

            System.out.println("Guess the number! Enter a number here: ");

            userInput = input.nextInt();

            if(userInput == x){
            System.out.println("That's right!");
        }
        else if(userInput > x){
                System.out.println("Your guess is too high!\nGuess again: ");
            }
            else if(userInput < x) {
            System.out.println("Your guess is too low!\nGuess again: ");

        }
            if (!list.contains(userInput)){
                list.add((Integer)userInput);
            }
            } while (userInput > 4 || userInput < 4);

System.out.println("Number of guess attempts: " + list.size());

        }

    }





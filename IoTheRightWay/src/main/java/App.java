import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by michaelbathon on 1/22/16.
 */
public class App {
    private char[] startLetters;
    private String[] wordCollection;
    private int numberOfWords;
    public App(){

    }

    public static void main(String[] args) {
        App app = new App();
        app.start();
        System.out.println(Arrays.toString(app.getWordCollection()));
    }

    public void start(){
        startLetters = promptUserForString("Please enter a character sequence.").toCharArray();
        numberOfWords = promptUserForInt("Please specify how many words you want.");
        collectionGenerator();
    }

    public String promptUserForString(String message){
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        String user_in = input.next();
        return user_in;
    }

    public int promptUserForInt(String message){
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        int collectionSize = input.nextInt();
        return collectionSize;
    }

    private void collectionGenerator(){
        wordCollection = new String[numberOfWords];
        for(int i = 0; i < numberOfWords; i+= startLetters.length){
        /* Start Loop to generate random words in our array, at index position [0], then increment
            the number of random words the 2nd FOR Loop*/
           for(int x = 0; x < startLetters.length && i+x < numberOfWords; x++){
                String randomWord = RandomWordGenerator.makeWord(startLetters[x]);
                wordCollection[i+x] = randomWord;
            }
        }
    }

    public String[] getWordCollection(){
        return wordCollection;
    }

}

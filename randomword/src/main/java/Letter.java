import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by michaelbathon on 1/20/16.
 */
public class Letter {



    public ArrayList<Character> alphabetArray = new ArrayList<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));

    public char getLetter() {

        for (int i = 0; i < word.length; i++){
            int randomIndex = (int)(Math.random()* 27);

            letter = alphabetArray[randomIndex];


        }

        return letter;


    }



    private char letter = '';








}

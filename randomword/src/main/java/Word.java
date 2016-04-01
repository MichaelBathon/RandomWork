import java.lang.Math;

/**
 * Created by michaelbathon on 1/19/16.
 */
public class Word {

    /*Word(char leadingLetter){

    }*/



    public int makeWord(){
        //make random word

        length = (int)(Math.random()* 5 + 1);

      / for(int i = 0; i < length; i++){
            Integer randChar = (int)(Math.random()* 26);

            StringBuilder sb = new StringBuilder();

            sb = leadingLetter += randChar.toString();
        }  */

        return 1;


    }

    public String getRandomWord(){
        //make the random word accessible to other classes
        return randomWord;
    }

    private int length;
    private char leadingLetter;
    private String randomWord;

}

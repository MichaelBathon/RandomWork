/**
 * Created by michaelbathon on 1/21/16.
 */
public class RandomWordGenerator {

    public static String makeWord(char input){
        String wordToReturn = input + "";

        int randomLength = (int)(Math.random() * 10);

        for(int i = 0; i < randomLength; i++){
            int randomLetterValue = (int)(Math.random() * 26) +97;
            char randomChar = (char)(randomLetterValue);

            wordToReturn += randomChar;
        }

        return wordToReturn;
    }


}

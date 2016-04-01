import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 1/21/16.
 */
public class RandomWordGeneratorSpec {
    RandomWordGenerator random;
    char inputLetter = 'a';


    @Before
    public void constructor() {
        random = new RandomWordGenerator();
    }
    String testWord = random.makeWord(inputLetter);

    char firstLetter = testWord.charAt(0);

    @Test
    public void makeWordTest(){

        assertEquals("make test fail", firstLetter, 'a');

    }

    @Test
    public void testEachChar() {

        for (int x = 1; x < testWord.length(); x++) {
            assertTrue("char range beyond range of alphabet", testWord.charAt(x) >= 'a' && testWord.charAt(x) <= 'z');
        }
    }

        @Test
       public void testWordLength(){

            assertTrue("word length is not between 1 and 10", testWord.length() >= 1 && testWord.length() <= 10);
        }



    }




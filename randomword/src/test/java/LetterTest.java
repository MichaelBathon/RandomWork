import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by michaelbathon on 1/20/16.
 */
public class LetterTest {

    @Test
    public void testGetLetterMethod(){
        Letter letter1 = new Letter();

        char x = letter1.getLetter();

        char test = 'a';

        assertEquals(x, test);

    }

}

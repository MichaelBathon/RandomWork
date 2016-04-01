import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michaelbathon on 1/19/16.
 */

public class SpecTest {

        @Test
        public void testMakeWordMethod(){
            Word word = new Word();

           int x= word.makeWord();



            assertEquals(0, x);
        }
}


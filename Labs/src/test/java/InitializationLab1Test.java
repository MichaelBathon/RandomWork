import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;



/**
 * Created by michaelbathon on 1/22/16.
 */
public class InitializationLab1Test {
    ColorfulThing testColor;

    @Before
    public void setUp(){testColor = new ColorfulThing(ColorfulThing.ColorEnum.BLUE);}

    ColorfulThing.ColorEnum testEnum = ColorfulThing.ColorEnum.BLUE;

    @Test
    public void testGetColor(){
        assertEquals(testEnum, testColor.getColor());
    }

    @After
    public void tearDown(){

    }


}

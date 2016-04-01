package altlabs;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by michaelbathon on 1/22/16.
 */
public class InitializationLab2Test {
    InitializationLab2 test;
    ThingContainer container;
    ThingContainer container2;

    @Before
    public void setUp(){
       // test = new InitializationLab2();
       container = new ThingContainer(5);
        //ColorfulThing[] paint = new ColorfulThing[5];
       // container2 = new ThingContainer(paint);

        //ColorfulThing color1 = new ColorfulThing("maroon");
        //ColorfulThing color2 = new ColorfulThing("aqua");

        container.add(new ColorfulThing(ColorEnum.BLUE));
        container.add(new ColorfulThing(ColorEnum.RED));
        container.add(new ColorfulThing(ColorEnum.GREEN));
        container.add(new ColorfulThing(ColorEnum.RED));
        container.add(new ColorfulThing(ColorEnum.GREEN));



    }

  /* @Test
    public void testContainerArraySizeConstructor(){
       ColorfulThing[] x = new ColorfulThing[5];

        Assert.assertArrayEquals( container.getArray(), x );
    } */


  /*  @Test
    public void testArrayAddMethod(){

        //container.add(new ColorfulThing("ybrown"));

        Assert.assertNotNull(container.colorArray[3]);

        System.out.println(container.colorArray[1].getColor());

    } */

 /*   @Test
    public void testPrinter(){
        container.printThings();
    } */

   @Test
    public void testPop(){
        assertEquals("Fails if it doesn't return a ColorfulThing object removed from the last position in the" +
                " array", container.colorArray[4], container.pop());
    }

    @Test
    public void testEnumRemove(){

     /*   assertEquals("Fails if expected object doesn't have the same value as the removed Enum" +
                " searched ColorfulThing obj", ColorEnum.GREEN, container.remove(ColorEnum.GREEN).getColor()); */

        ColorfulThing removedThing = container.remove(ColorEnum.RED);

        assertNotNull(removedThing);

        ColorEnum result = removedThing.getColor();

        assertEquals("Fails if expected object doesn't have the same value as the removed Enum" +
                " searched ColorfulThing obj", ColorEnum.RED, result);

        System.out.println(container.colorArray[4]);

        assertNull("Fails if there is an object in the last index of the array", container.colorArray[container.colorArray.length -1]);
    }

    @Test
    public void testNullRemove(){
        assertEquals("Fails if it doesn't get null", null, container.remove(null));
    }


}

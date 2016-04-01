package bathon.michael;

import bathon.michael.Shield;

/**
 * Created by michaelbathon on 1/17/16.
 */
public class ShieldTest {

    public ShieldTest(int i){
        System.out.println("ShieldTest Constructor");

        shield1 = new Shield();

    }

    public ShieldTest(){}

    Shield shield1;


    public void cover(){
        shield1.block();
    }

    public static void main(String[] args) {

        ShieldTest test = new ShieldTest();
        test.cover();

    }
}

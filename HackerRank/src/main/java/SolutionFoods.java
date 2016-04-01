/**
 * Created by michaelbathon on 1/26/16.
 */
public class SolutionFoods {

    public static void main(String[] argh) {
        foodFactory myFoods = new foodFactory();
        Food food1 = myFoods.getFood("Fastfood");
        Food food2 = myFoods.getFood("Fruits");
        System.out.println("My name is: " + food1.getClass().getName());
        System.out.println("My name is: " + food2.getClass().getName());
        System.out.println("Our superclass is: " + food1.getClass().getSuperclass().getName());
        food1.serveFood();
        food2.serveFood();
    }




}

class foodFactory extends SolutionFoods {


    public Food getFood(String s){
        String foodType = s;
        if (foodType == "Fastfood"){

        return new Fastfood(foodType);}
        else{
            return new Fruits(foodType);
        }
    }

}

class Food extends SolutionFoods {
    String foodType;

    Food(String f){
        foodType = f;
    }

    public void serveFood(){
        System.out.println("I'm serving " + foodType);
    }
}

class Fastfood extends Food{

    Fastfood(String f) {
        super(f);
    }
}

class Fruits extends Food{
    Fruits(String f) {
        super(f);
    }



}

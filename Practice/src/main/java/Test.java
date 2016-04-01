/**
 * Created by michaelbathon on 1/15/16.
 */
public class Test {

    private int friendAge;
    private String friendName;
    private static int numberOfFriends;

    public Test(){
        numberOfFriends++;
    }

        public void setAge(int age){
            friendAge = age;
        }

        public void setName(String name){
            friendName = name;
        }

        public int getAge() {
            return friendAge;
        }

        public String getName(){
            return friendName;
        }




    public void listFriends(){
        System.out.println("Your Friend " + getName() + ", age: " + getAge() + " has been added to the list.");
        System.out.println("You have " + numberOfFriends + " in your list.");
    }

}

/**
 * Created by michaelbathon on 1/26/16.
 */
public class Comparator {

   public static void main(String[] args) {
        int a = 10;
        int b = 11;

        String test2 = "Hello";
        String test1 = "Hello";

        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7};

        Comparator comparator = new Comparator();

        System.out.println(comparator.compare(a, b));
        System.out.println(comparator.compare(test1, test2));
        System.out.println(comparator.compare(array1, array2));
    }


    boolean compare(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    boolean compare(String a, String b) {
        if (a.equals(b)) {
            return true;
        } else {
            return false;
        }
    }

       boolean compare(int[] a, int[] b){
            int count=0;
            if(a.length != b.length){
                return false;}
            else{for(int i =0; i < a.length; i++){
                if(a[i] == b[i])
                    count++;
            }if(count != a.length){
                return false;}
                return true;
            }
        }

}


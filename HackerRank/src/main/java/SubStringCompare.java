import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by michaelbathon on 1/24/16.
 */
public class SubStringCompare {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        int k = sc.nextInt(); //3

        String smallestPart = "";
        String largestPart = "";
       ArrayList<String> container = new ArrayList<String>();

       /* for(int i = 0; i < words.length()-k ; i++){
            smallestPart = words.substring(i, k + i);
            largestPart = words.substring(i, k + i);
            if((words.substring(i, k + i)).compareTo(words.substring(i +1, k +(i+1))) > 0){
                String tempLargestPart = words.substring(i, k + i);
                if(largestPart.compareTo(tempLargestPart) > 0);
                largestPart = tempLargestPart;

            } else{
                String tempSmallestPart = words.substring(i +1, k +(i+1));
                if(smallestPart.compareTo(tempSmallestPart) < 0);
                smallestPart = tempSmallestPart;
            }

        }
        System.out.println(smallestPart);
        System.out.println(largestPart);*/


       for(int i = 0; i <= words.length()-k ; i ++){
            container.add(words.substring(i, k + i));
        }

       Collections.sort(container);

       largestPart = container.get(0);
       smallestPart = container.get(container.size()-1);

       System.out.println(smallestPart);
       System.out.println(largestPart);

       /*for(int x = 0; x < container.size(); x++){

       }*/
















    }
}

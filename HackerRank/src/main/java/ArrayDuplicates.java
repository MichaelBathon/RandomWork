import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by michaelbathon on 1/25/16.
 */
public class ArrayDuplicates {

  int[] numbers = {1, 2, 3, 7, 4, 3, 1, 9, 8, 3};

  int count = 0;
    ArrayList<Integer> dups = new ArrayList<Integer>();

    int countDuplicates(int [] numbers) {
        Arrays.sort(numbers);
        int count = 0;
        for (int x = 1; x < numbers.length; x++) {
            if (numbers[x] == numbers[x - 1]) {
                dups.add(numbers[x]);
                if (!dups.contains(numbers[x])) {
                    count++;
                }

            }
        }
        return count;


    }

    int countDuplicates2(int [] numbers) {
        for (int x = 0; x < numbers.length; x++) {
            for (int j = x; j < numbers.length; j++)
                if (numbers[x] == numbers[j] && x != j) {
                    dups.add(numbers[x]);
                    if (!dups.contains(numbers[x])) {
                        count++;
                    }

                }

        }
        return count;
    }
}

import java.util.Arrays;

/**
 * Created by michaelbathon on 1/25/16.
 */
public class StellaArrayDupes {


    public static int duplicates() {
        int dupes = 0;

        int[] numbers = {0, 1, 1, 2, 2, 1, 3, 6, 5, 9, 4, 6, 7, 6, 8, 5, 2, 8, 9};

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length - 2; i++) {
            int j = i + 1;
            int k = i + 2;

            if (numbers[i] == numbers[j] && numbers[i] != numbers[k]) {
                dupes++;
            }

        }
        if (numbers[numbers.length - 2] == numbers[numbers.length - 1]) {
            dupes++;
        }
        return dupes;
    }

    public static void main(String[] args) {

        System.out.println(StellaArrayDupes.duplicates());

    }

}


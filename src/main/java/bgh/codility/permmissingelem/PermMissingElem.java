package bgh.codility.permmissingelem;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PermMissingElem {
    public int findMissingElem (int[] input) {

        int[] sorted = IntStream.of(input)
                .boxed()
                .sorted()
                .mapToInt(i -> i)
                .toArray();

        return missingItem(sorted);
    }

    private int missingItem(int[] input) {

        int midIdx = input.length / 2;

        if (input.length == 1)
            return input[0]-1;

        if (input[midIdx] == midIdx+1) {
            return missingItem(Arrays.copyOfRange(input, midIdx + 1, input.length));
        }
        else {
            return missingItem(Arrays.copyOfRange(input, 0, midIdx+1));
        }

    }
}

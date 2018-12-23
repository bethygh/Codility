package bgh.codility.permmissingelem;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PermMissingElem {
    public int findMissingElem (int[] input) {

        if (input.length == 0)
            return 1;

        int[] sorted = IntStream.of(input)
                .boxed()
                .sorted()
                .mapToInt(i -> i)
                .toArray();

        return missingItem(sorted, 0);
    }

    private int missingItem(int[] input, int shiftVal) {

        int midIdx = (input.length / 2 );

        /*if (input.length == 1)
            return input[0]-1;*/
        if (input.length == 1) {
            if (input[0] == (shiftVal + 2)) return 1 + shiftVal;//TODO
            if (input[0] == (shiftVal + 1)) return 2 + shiftVal;//TODO
        }
        if (input.length == 2) {
            if (input[0] == (shiftVal + 2)) return 1 + shiftVal;//TODO
            if (input[0] == (shiftVal + 1))
                if (input[1] == (shiftVal + 2)) return 3 + shiftVal;
                else return 2 + shiftVal;//TODO
        }

        if (input[midIdx] == (shiftVal+midIdx+1)) {
            return missingItem(Arrays.copyOfRange(input, midIdx + 1, shiftVal+input.length), input[midIdx]);
        }
        else {
            return missingItem(Arrays.copyOfRange(input, 0, midIdx+1), shiftVal);
        }

    }
}

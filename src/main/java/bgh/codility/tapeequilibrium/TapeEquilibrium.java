package bgh.codility.tapeequilibrium;

import java.util.Arrays;

public class TapeEquilibrium {

    public int findMinDiff(int[] input) {

        if (input.length == 1) return input[0];

        int min = Integer.MAX_VALUE, diff;
        long a, b;
        for (int p=1 ; p<input.length ; p++) {
            a = Arrays.stream(Arrays.copyOfRange(input, 0, p)).sum();
            b = Arrays.stream(Arrays.copyOfRange(input, p, input.length)).sum();

            diff = (int) ((b>a) ? b-a : a-b);
            min = (min<diff) ? min : diff;
        }

        return min;
    }
}

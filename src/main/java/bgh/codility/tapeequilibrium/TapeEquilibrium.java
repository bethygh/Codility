package bgh.codility.tapeequilibrium;

import java.util.Arrays;

public class TapeEquilibrium {

    public int findMinDiff(int[] input) {

        if (input.length == 1) return input[0];

        int min = Integer.MAX_VALUE, diff;
        long a, b;
        for (int p=1 ; p<input.length ; p++) {
            a = sumArray(Arrays.copyOfRange(input, 0, p));
            b = sumArray(Arrays.copyOfRange(input, p, input.length));

            diff = (int) ((b>a) ? b-a : a-b);
            min = (min<diff) ? min : diff;
        }

        return min;
    }

    private long sumArray(int[] input) {
        if (input.length == 0) return 0;

        long sum = 0;
        for (int i: input
             ) {
            sum += i;
        }
        return sum;
    }

}

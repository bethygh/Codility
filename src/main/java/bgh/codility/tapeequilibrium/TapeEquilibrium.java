package bgh.codility.tapeequilibrium;

import java.util.Arrays;
import java.util.Map;

public class TapeEquilibrium {

    public int findMinDiff(int[] input) {

        if (input.length == 1) return input[0];

        int min = Integer.MAX_VALUE, diff;
        long a, b=0;
        a = Arrays.stream(input).sum();
        for (int p=1 ; p<input.length ; p++) {
            b += input[p-1];
            a -= input[p-1];

            diff = (int) Math.abs(a-b);
            min = (min<diff) ? min : diff;
            if(min == 0) return min;
        }

        return min;
    }

    public int findMinDiff2(int[] input) {

        if (input.length == 1) return input[0];

        int min = Integer.MAX_VALUE, diff;
        long a, b;
        for (int p=1 ; p<input.length ; p++) {
            a = Arrays.stream(Arrays.copyOfRange(input, 0, p)).sum();
            b = Arrays.stream(Arrays.copyOfRange(input, p, input.length)).sum();

            diff = (int) Math.abs(a-b);
            min = Math.min(min, diff);
        }

        return min;
    }
}

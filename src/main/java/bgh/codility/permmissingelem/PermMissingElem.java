package bgh.codility.permmissingelem;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PermMissingElem {
    public int findMissingElem (int[] input) {

        if (input.length == 0)
            return 1;

        int[] sorted = java.util.stream.IntStream.of(input)
                .boxed()
                .sorted()
                .mapToInt(i -> i)
                .toArray();

        for(int i=0 ; i<sorted.length ; i++)
        {
            if (sorted[i] != i+1)
                return sorted[i] - 1;
        }

        return sorted.length+1;
    }
}

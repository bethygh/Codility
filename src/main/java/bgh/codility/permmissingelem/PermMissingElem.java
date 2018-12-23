package bgh.codility.permmissingelem;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PermMissingElem {
    public int findMissingElem (int[] input) {

        if (input.length == 0)
            return 1;

        Arrays.sort(input);

        for(int i=0 ; i<input.length ; i++)
        {
            if (input[i] != i+1)
                return input[i] - 1;
        }

        return input.length+1;
    }
}

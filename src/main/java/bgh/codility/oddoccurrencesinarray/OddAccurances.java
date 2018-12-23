package bgh.codility.oddoccurrencesinarray;

import java.util.HashMap;
import java.util.Map;

public class OddAccurances {

    public int findOddAccurances (int[] input) {

        int odd  =0 ;

        for (int i = 0 ; i< input.length ; i++) {
            odd ^= input[i];
        }

       return odd;
    }
}

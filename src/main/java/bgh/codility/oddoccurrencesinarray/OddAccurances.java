package bgh.codility.oddoccurrencesinarray;

import java.util.HashMap;
import java.util.Map;

public class OddAccurances {

    public int findOddAccurances (int[] input) {
        if (input.length%2 == 0)
            return -1;

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0 ; i< input.length ; i++) {
            if (map.containsKey(input[i])) {
                map.put(input[i],  map.get(input[i])+1);
            }
            else {
                map.put(input[i],  1);
            }
        }

        if (! map.containsValue(1) )
            return -1;

        return map.entrySet()
                .stream()
                .filter((i) -> (i.getValue()%2 != 0))
//                .min((x, y) -> Integer.compare(x.getValue(), y.getValue()))
                .findFirst()
                .get().getKey();
    }
}

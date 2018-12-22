package bgh.codility.cyclicrotation;

import org.springframework.stereotype.Component;

@Component
public class CyclicRotation {

public int[] doCyclicRotation (int[] list, int rotationCnt) {

    if (list.length == 0) return list;

    int prev = 0, tmp = 0;
    for (int j=0 ; j < rotationCnt ; j++) {
        prev = list[0];
        for (int i = 0; i < list.length; i++) {
            tmp = prev;
            prev = list[(i+1 < list.length) ? (i+1) : ((i+1) % list.length)];
            list[(i+1 < list.length) ? (i+1) : ((i+1) % list.length)] = tmp;           }
    }

    return list;
    }
}

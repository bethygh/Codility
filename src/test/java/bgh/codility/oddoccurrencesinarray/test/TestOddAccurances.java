package bgh.codility.oddoccurrencesinarray.test;

import bgh.codility.oddoccurrencesinarray.OddAccurances;
import org.junit.Assert;
import org.junit.Test;

public class TestOddAccurances {
    @Test
    public void testOddAccurances1() {
        OddAccurances oddAccurances = new OddAccurances();
        int [] array = {2, 1, 2};
        int ret = oddAccurances.findOddAccurances(array);
        Assert.assertEquals(1, ret);
    }

    @Test
    public void testOddAccurances2() {
        OddAccurances oddAccurances = new OddAccurances();
        int [] array = {9, 3, 9, 3, 9, 7, 9};
        int ret = oddAccurances.findOddAccurances(array);
        Assert.assertEquals(7, ret);
    }
}

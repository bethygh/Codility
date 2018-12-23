package bgh.codility.permmissingelem;

import bgh.codility.oddoccurrencesinarray.OddAccurances;
import org.junit.Assert;
import org.junit.Test;

public class TestPermMissingElem {
    @Test
    public void testMissingElem1() {
        PermMissingElem permMissingElem = new PermMissingElem();
        int [] array = {1,2,4};
        int ret = permMissingElem.findMissingElem(array);
        Assert.assertEquals(3, ret);
    }

    @Test
    public void testMissingElem2() {
        PermMissingElem permMissingElem = new PermMissingElem();
        int [] array = {3,2,1,5,6,7};
        int ret = permMissingElem.findMissingElem(array);
        Assert.assertEquals(4, ret);
    }

    @Test
    public void testMissingElem3() {
        PermMissingElem permMissingElem = new PermMissingElem();
        int [] array = {};
        int ret = permMissingElem.findMissingElem(array);
        Assert.assertEquals(0, ret);
    }

}

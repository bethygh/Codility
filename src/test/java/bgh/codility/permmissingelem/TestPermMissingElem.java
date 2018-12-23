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
        Assert.assertEquals(1, ret);
    }

    @Test
    public void testMissingElem4() {
        PermMissingElem permMissingElem = new PermMissingElem();
        int [] array = {2,5,6,3,4};
        int ret = permMissingElem.findMissingElem(array);
        Assert.assertEquals(1, ret);
    }

    @Test
    public void testMissingElem5() {
        PermMissingElem permMissingElem = new PermMissingElem();
        int [] array = {1,5,6,3,4};
        int ret = permMissingElem.findMissingElem(array);
        Assert.assertEquals(2, ret);
    }

    @Test
    public void testMissingElem6() {
        PermMissingElem permMissingElem = new PermMissingElem();
        int [] array = {2,5,1,3,4};
        int ret = permMissingElem.findMissingElem(array);
        Assert.assertEquals(6, ret);
    }
}

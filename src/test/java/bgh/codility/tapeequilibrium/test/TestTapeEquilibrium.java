package bgh.codility.tapeequilibrium.test;


import bgh.codility.tapeequilibrium.TapeEquilibrium;
import org.junit.Assert;
import org.junit.Test;

public class TestTapeEquilibrium {

    @Test
    public void testMissingElem1() {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int [] array = {3,1,2,4,3};
        int ret = tapeEquilibrium.findMinDiff(array);
        Assert.assertEquals(1, ret);
    }

    @Test
    public void testMissingElem2() {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int [] array = {3};
        int ret = tapeEquilibrium.findMinDiff(array);
        Assert.assertEquals(3, ret);
    }

    @Test
    public void testMissingElem3() {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int [] array = {3,2};
        int ret = tapeEquilibrium.findMinDiff(array);
        Assert.assertEquals(1, ret);
    }
}

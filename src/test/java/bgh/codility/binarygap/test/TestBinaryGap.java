package bgh.codility.binarygap.test;

import bgh.codility.binarygap.BinaryGap;
import org.junit.Assert;
import org.junit.Test;

public class TestBinaryGap {

    @Test
    public void finGapTest1041() {
        BinaryGap binaryGap = new BinaryGap();
        int ret = binaryGap.findGap(1041);

        Assert.assertEquals(5, ret);
    }

    @Test
    public void finGapTest15() {
        BinaryGap binaryGap = new BinaryGap();
        int ret = binaryGap.findGap(15);

        Assert.assertEquals(0, ret);
    }

    @Test
    public void finGapTest32() {
        BinaryGap binaryGap = new BinaryGap();
        int ret = binaryGap.findGap(32);

        Assert.assertEquals(0, ret);
    }


}
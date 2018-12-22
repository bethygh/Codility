package bgh.codility.frogjmp.test;

import bgh.codility.frogjmp.FrogJmp;
import org.junit.Assert;
import org.junit.Test;

public class TestFrogJmp {
    @Test
    public void testCyclicRotation1() {
        FrogJmp frogJmp = new FrogJmp();
        int ret = frogJmp.findFrogJmps(10, 85, 30);
        System.out.println(ret);
        Assert.assertEquals(3, ret);
    }
}

package bgh.codility.cyclicrotation.test;

import bgh.codility.cyclicrotation.CyclicRotation;
import org.junit.Assert;
import org.junit.Test;

public class TestCyclicRotation {
    @Test
    public void testCyclicRotation1() {
        CyclicRotation cyclicRotation = new CyclicRotation();
        int [] array = {3, 8, 9, 7, 6};
        int [] out = {9, 7, 6, 3, 8};
        int[] ret = cyclicRotation.doCyclicRotation(array, 3);

        Assert.assertArrayEquals(out, ret);
    }

    @Test
    public void testCyclicRotation2() {
        CyclicRotation cyclicRotation = new CyclicRotation();
        int [] array = {0, 0, 0};
        int [] out = {0, 0, 0};
        int[] ret = cyclicRotation.doCyclicRotation(array, 1);

        Assert.assertArrayEquals(out, ret);
    }

    @Test
    public void testCyclicRotation3() {
        CyclicRotation cyclicRotation = new CyclicRotation();
        int [] array = {1, 2, 3, 4};
        int [] out = {1, 2, 3, 4};
        int[] ret = cyclicRotation.doCyclicRotation(array, 4);

        Assert.assertArrayEquals(out, ret);
    }

    @Test
    public void testCyclicRotation4() {
        CyclicRotation cyclicRotation = new CyclicRotation();
        int [] array = {};
        int [] out = {};
        int[] ret = cyclicRotation.doCyclicRotation(array, 4);

        Assert.assertArrayEquals(out, ret);
    }

    @Test
    public void testCyclicRotation5() {
        CyclicRotation cyclicRotation = new CyclicRotation();
        int [] array = {1};
        int [] out = {1};
        int[] ret = cyclicRotation.doCyclicRotation(array, 3);

        Assert.assertArrayEquals(out, ret);
    }
}

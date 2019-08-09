package com.gmail.sergeykichukki4;

import org.junit.Assert;
import org.junit.Test;

//import java.util.Arrays;
//import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class StreamOperationsTest {

    int[] arrTest = {1, 2, 31, 17, 2, 7, 9};
    int[] arrTestForMultiplyAllElementsFunction = {10, 20, 310, 170, 20, 70, 90};
    StreamOperations streamOperations = new StreamOperations();

    @Test
    public void averageNumber() {
        double actual = streamOperations.averageNumber(arrTest);
        double expected = 9.85714285714;

        Assert.assertEquals(actual, expected, 0.01);
    }

    @Test
    public void minNumber() {
        int actual = streamOperations.minNumber(arrTest);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void minIdex() {
        int actual = streamOperations.minIdex(arrTest);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void countZeros() {
        int actual = streamOperations.countZeros(arrTest);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void moreThanZero() {
        int actual = streamOperations.moreThanZero(arrTest);
        int expected = 7;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void multiplyAllElements() {
        List<Integer> actual = streamOperations.multiplyAllElements(arrTest, 10).boxed().collect(Collectors.toList());
        IntStream expected = IntStream.of(arrTest).map(x -> x * 10);
        List<Integer> adoptedExpected = expected.boxed().collect(Collectors.toList());

        /*List<Integer> adoptedExpected = new ArrayList<Integer>();
        for (int i : arrTestForMultiplyAllElementsFunction) {
            adoptedExpected.add(i);
        }*/

        Assert.assertEquals(adoptedExpected, actual);
    }
}
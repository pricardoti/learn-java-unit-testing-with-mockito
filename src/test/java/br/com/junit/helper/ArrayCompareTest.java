package br.com.junit.helper;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.Assert.assertArrayEquals;

public class ArrayCompareTest {

    @Test
    public void testArraySort_RandomArray() {
        int[] numbers = new int[]{12, 3, 4, 1};
        int[] expected = new int[]{1, 3, 4, 12};

        Arrays.sort(numbers);

        // assertEquals => assertArrayEquals
        assertArrayEquals("Unordered values.", expected, numbers);
    }

    @Test(expected = NullPointerException.class)
    public void testArraySort_NullArray() {
        int[] numbers = null;
        Arrays.sort(numbers);
    }

    @Test(timeout = 100) // defining the execution of time (performance).
    public void testSort_Performance() {
        IntStream.range(0, 999999).sorted();
    }
}

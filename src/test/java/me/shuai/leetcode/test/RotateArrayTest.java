package me.shuai.leetcode.test;

import me.shuai.leetcode.RotateArray;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Shuai Zhang on 10/25/15.
 */
public class RotateArrayTest {
    private RotateArray.Solution solution;

    @Before
    public void setup() {
        RotateArray rotateArray = new RotateArray();
        solution = rotateArray.new Solution();
    }

    @Test
    public void RotateShouldReturnRotatedArray() {
        int[] sample1 = {1, 2, 3, 4, 5, 6, 7};
        solution.rotate(sample1, 3);
        int[] expected1 = {5, 6, 7, 1, 2, 3, 4};
        System.out.println(Arrays.toString(sample1));
        assertArrayEquals(expected1, sample1);

        int[] sample2 = {1, 2, 3, 4, 5, 6, 7};
        solution.rotate(sample2, 7);
        int[] expected2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(sample2));
        assertArrayEquals(expected2, sample2);

        int[] sample3 = {1, 2, 3, 4, 5, 6, 7};
        solution.rotate(sample3, 1);
        int[] expected3 = {7, 1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(sample3));
        assertArrayEquals(expected3, sample3);


    }
}

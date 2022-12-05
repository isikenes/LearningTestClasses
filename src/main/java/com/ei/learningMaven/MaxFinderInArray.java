package com.ei.learningMaven;

public class MaxFinderInArray {

    public int FindMax(int[] ints) {
        int max = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > max)
                max = ints[i];
        }
        return max;
    }
}

package dev.gustavoteixeira.lesson3;

import static java.lang.Math.abs;

public class TapeEquilibrium {


    public static int solution(int[] array) {
        // get the number of possible slices
        var sliceIndexQuantity = array.length - 1;
        if (sliceIndexQuantity == 1) return (int) getAbsDiff(array[0], array[1]);
        // variable that holds the lesser value
        long minimalDifference = Long.MAX_VALUE;

        // loop through them
        for (int i = 1; i < sliceIndexQuantity; i++) {
            // call the function (calculate left slice)
            var leftSliceSum = getLeftSliceSum(array, i);
            // call the function (calculate right slice)
            var rightSliceSum = getRightSliceSum(array, i);

            var currentMinimalDifference = getAbsDiff(leftSliceSum, rightSliceSum);
            if (minimalDifference > currentMinimalDifference)
                minimalDifference = currentMinimalDifference;
        }


        return (int) minimalDifference;
    }

    private static long getAbsDiff(long x, long y) {
        return abs(x - y);
    }

    private static long getRightSliceSum(int[] array, int i) {
        long sum = 0;

        for (int j = i; j < array.length; j++) {
            sum += array[j];
        }

        return sum;
    }

    private static long getLeftSliceSum(int[] array, int i) {
        long sum = 0;
        for (int j = 0; j < i; j++) {
            sum += array[j];
        }

        return sum;
    }
}

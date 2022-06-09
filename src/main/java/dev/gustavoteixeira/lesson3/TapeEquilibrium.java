package dev.gustavoteixeira.lesson3;

import static java.lang.Math.abs;

public class TapeEquilibrium {


    public static int solution(int[] array) {
        var arrayLength = array.length;
        if (arrayLength - 1 == 1) return abs(array[0] - array[1]);

        long leftSum = array[0];

        long rightSum = 0;
        for (int j = 1; j < array.length; j++) {
            rightSum += array[j];
        }

        var minimalDifference = abs(leftSum - rightSum);

        for (int i = 1; i < arrayLength - 1; i++) {
            leftSum += array[i];
            rightSum -= array[i];
            var currentMinimalDifference = abs(leftSum - rightSum);
            if (currentMinimalDifference < minimalDifference) {
                minimalDifference = currentMinimalDifference;
            }
        }

        return (int) minimalDifference;
    }

}

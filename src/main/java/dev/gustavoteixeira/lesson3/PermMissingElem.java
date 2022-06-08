package dev.gustavoteixeira.lesson3;


import java.util.Arrays;

public class PermMissingElem {


    public static int solution(int[] A) {
        var length = A.length;
        if (length == 0) return 1;
        length++;
        var sum = length * (length + 1) / 2;

        return  sum - Arrays.stream(A).sum();
    }

}

package dev.gustavoteixeira.lesson2;

public class CyclicRotation {


    public static int[] solution(int[] A, int K) {
        var MAX_LENGTH = A.length;
        if (MAX_LENGTH == 0) return A;
        var array = A.clone();

        while (K > 0) {
            var loopArray = array.clone();

            var last = array[MAX_LENGTH - 1];
            for (int i = 1; i < MAX_LENGTH; i++) {
                loopArray[i] = array[i - 1];
            }
            loopArray[0] = last;
            array = loopArray;
            K--;
        }


        return array;
    }

}

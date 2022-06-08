package dev.gustavoteixeira.lesson2;

import java.util.HashSet;

public class OddOccurrencesInArray {

    public static int solution(int[] A) {

        var hashMap = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (hashMap.contains(A[i])) {
                hashMap.remove(A[i]);
            } else {
                hashMap.add(A[i]);
            }
        }


        return (int) hashMap.stream().findFirst().get();
    }

    public static boolean hasMatchingPair(int number, int[] array, int index) {
        for (int i = index + 1; i < array.length; i++) {
            if (array[i] == number) {
                array[i] = -1;
                array[index] = -1;
                return true;
            }
        }
        return false;
    }

}

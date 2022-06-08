package dev.gustavoteixeira.lesson2;

public class OddOccurrencesInArray {

    public static int solution(int[] A) {
        var theOneLeftAlone = 0;
        for (int i = 0; i < A.length; i++) {
            System.out.println(i);
            if (!hasMatchingPair(A[i], A, i) && A[i] != -1) {
                theOneLeftAlone = A[i];
                break;
            }
        }
        return theOneLeftAlone;
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

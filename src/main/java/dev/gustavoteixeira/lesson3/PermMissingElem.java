package dev.gustavoteixeira.lesson3;


public class PermMissingElem {


    public static int solution(int[] A) {
        if(A.length == 0) return 1;

        long shouldBe = 0;
        var actual = 0;
        int i = 0;
        while (i < A.length) {
            actual += A[i];
            shouldBe += i + 1;
            i++;
        }
        shouldBe += i + 1;

        if(shouldBe == actual)  return A.length;
        return (int) (shouldBe - actual);
    }

}

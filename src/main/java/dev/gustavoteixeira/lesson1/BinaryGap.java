package dev.gustavoteixeira.lesson1;

public class BinaryGap {

    public static void main(String[] args) {
    }

    public static int solution(int N) {

        var binary = Integer.toBinaryString(N);

        var currentLongestGap = 0;

        var newGapSize = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                newGapSize++;
            } else {
                if (newGapSize > 0) {
                    currentLongestGap = Math.max(newGapSize, currentLongestGap);
                    newGapSize = 0;
                }
            }
        }
        return currentLongestGap;
    }
}

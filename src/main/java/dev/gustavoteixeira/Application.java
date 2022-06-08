package dev.gustavoteixeira;

public class Application {

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE - 12312312));
        System.out.println(solution(529));
    }

    public static int solution(int N) {

        var binary = Integer.toBinaryString(N);

        return getLongestBinaryGap2(binary);
    }


    public static int getLongestBinaryGap2(String binaryNumber) {

        var totalSize = binaryNumber.length();

        var currentIndex = totalSize - 1;
        while (binaryNumber.charAt(currentIndex) == '0') {
            currentIndex--;
        }


        return highestGap;
    }


    public static int getLongestBinaryGap(String binaryNumber) {

        var highestGap = 0;
        // start at position 0
        var currentPosition = 0;

        // if next position is 1
        while (binaryNumber.charAt(currentPosition) == '1' && currentPosition + 1 < binaryNumber.length()) {
            if (binaryNumber.charAt(currentPosition + 1) == '1') {
                // advance one position
                currentPosition++;
            } else {
                var possibleGapSize = findGapSize(binaryNumber, currentPosition);
                if (possibleGapSize > highestGap && possibleGapSize + currentPosition + 1 < binaryNumber.length()) {
                    highestGap = possibleGapSize;
                }
                currentPosition += possibleGapSize + 1 == binaryNumber.length() ? possibleGapSize : possibleGapSize + 1;
            }
        }
        return highestGap;
    }


    public static int findGapSize(String string, int initialIndex) {
        return countZerosTillNextOne(string.substring(initialIndex + 1));
    }

    public static int countZerosTillNextOne(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != '0') return i;
        }
        return string.length();
    }
}

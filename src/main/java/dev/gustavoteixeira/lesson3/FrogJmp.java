package dev.gustavoteixeira.lesson3;

public class FrogJmp {

    public static int solution(int X, int Y, int D) {

        var distance = (Y - X);
        if (distance % D > 0) {
            return (distance / D) + 1;
        } else {
            return distance / D;
        }
    }


}

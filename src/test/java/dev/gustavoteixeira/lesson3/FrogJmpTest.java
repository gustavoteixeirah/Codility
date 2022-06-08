package dev.gustavoteixeira.lesson3;

import dev.gustavoteixeira.lesson2.OddOccurrencesInArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.of;

public class FrogJmpTest {

    @ParameterizedTest(name = "#{index} - X {0} Y {1} D {2} should jump {3} times")
    @MethodSource("arguments")
    void test(int X, int Y, int D, int expected) {
        assertThat(FrogJmp.solution(X, Y, D)).isEqualTo(expected);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                of(10, 85, 30, 3),
                of(0, 10, 1, 10),
                of(0, 10, 20, 1),
                of(10, 100, 10, 9),
                of(10, 10, 10, 0),
                of(9, 29, 10, 2),
                of(10, 10, 30, 0)
        );
    }


}

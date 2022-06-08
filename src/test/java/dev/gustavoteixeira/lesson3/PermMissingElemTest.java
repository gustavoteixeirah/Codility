package dev.gustavoteixeira.lesson3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.of;

public class PermMissingElemTest {

    @ParameterizedTest(name = "#{index} - X {0} Y {1} D {2} should jump {3} times")
    @MethodSource("arguments")
    void test(int[] X, int expected) {
        assertThat(PermMissingElem.solution(X)).isEqualTo(expected);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                of(new int[]{2, 3, 1, 5}, 4)
        );
    }
}

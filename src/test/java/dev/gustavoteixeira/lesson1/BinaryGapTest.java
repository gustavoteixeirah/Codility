package dev.gustavoteixeira.lesson1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.gustavoteixeira.lesson1.BinaryGap.solution;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.of;

class BinaryGapTest {

    @ParameterizedTest(name = "#{index} - Number {0} should have {1} gaps")
    @MethodSource("arguments")
    void test(int input, int expected) {
        assertThat(solution(input)).isEqualTo(expected);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                of(1073741825, 29),
                of(1610612737, 28),
                of(805306369, 27),
                of(1041, 5),
                of(1376796946, 5),
                of(15, 0),
                of(6291457, 20),
                of(1162, 3),
                of(74901729, 4),
                of(32, 0),
                of(6, 0),
                of(42, 1),
                of(19, 2)
        );
    }
}

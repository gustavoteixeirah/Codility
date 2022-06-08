package dev.gustavoteixeira.lesson2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.of;

public class CyclicRotationTest {

    @ParameterizedTest(name = "#{index} - Number {0} should have {1} gaps")
    @MethodSource("arguments")
    void test(int[] A, int K, int[] expected) {
        assertThat(CyclicRotation.solution(A, K)).isEqualTo(expected);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                of(new int[]{1, 2, 3, 4}, 4, new int[]{1, 2, 3, 4}),
                of(new int[]{3, 8, 9, 7, 6}, 3, new int[]{9, 7, 6, 3, 8})
        );
    }


}

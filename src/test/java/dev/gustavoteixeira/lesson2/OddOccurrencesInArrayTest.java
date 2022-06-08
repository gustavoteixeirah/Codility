package dev.gustavoteixeira.lesson2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.of;

public class OddOccurrencesInArrayTest {


    @ParameterizedTest(name = "#{index} - Number {0} should have {1} gaps")
    @MethodSource("arguments")
    void test(int[] A, int expected) {
        assertThat(OddOccurrencesInArray.solution(A)).isEqualTo(expected);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                of(new int[]{9, 3, 7, 9, 3, 9, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9}, 7),
                of(new int[]{9, 3, 9, 3, 9, 7, 9}, 7),
                of(new int[]{1, 3, 9, 3, 9}, 1),
                of(new int[]{9, 3, 9, 3, 2}, 2),
                of(new int[]{9, 3, 9}, 3)
        );
    }

}

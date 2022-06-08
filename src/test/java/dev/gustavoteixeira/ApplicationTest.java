package dev.gustavoteixeira;

import org.junit.jupiter.api.Test;

import static dev.gustavoteixeira.Application.solution;
import static org.assertj.core.api.Assertions.assertThat;

class ApplicationTest {


    @Test
    void _15() {
        assertThat(solution(15)).isEqualTo(0);
    }

    @Test
    void _32() {
        assertThat(solution(32)).isEqualTo(0);
    }

    @Test
    void _1041() {
        assertThat(solution(1041)).isEqualTo(5);
    }

    @Test
    void _805306369() {
        assertThat(solution(805306369)).isEqualTo(27);
    }

    @Test
    void _1073741825() {
        assertThat(solution(1073741825)).isEqualTo(29);
    }

    @Test
    void bigNumber() {
        assertThat(solution(Integer.MAX_VALUE - 12312312)).isEqualTo(5);
    }

}

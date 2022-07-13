package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {

    @DisplayName("abc에서 replace로 b를 d로 바꾸면 adc를 반환한다.")
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @DisplayName("문자열을 delimiter로 자르면 그 delimiter를 제외한 원소로 이루어진 배열을 반환한다.")
    @Test
    void split() {
        String[] split = "1,2".split(",");
        assertThat(split).contains("1", "2");

        String[] split1 = "1,".split(",");
        assertThat(split1).containsExactly("1");
    }

    @DisplayName("(1,2)에서 첫 번째부터 네 번째 전까지 자르면 1,2를 반환한다.")
    @Test
    void substring() {
        String input = "(1,2)".substring(1, 4);
        assertThat(input).isEqualTo("1,2");
    }

    @DisplayName("특정 위치의 문자를 가져온다.")
    @Test
    void charAt() {
        char c = "abc".charAt(1);
        assertThat(c).isEqualTo('b');
    }

    @DisplayName("index의 범위가 0 ~ 문자열의 길이-1 을 벗어나면 예외가 발생한다.")
    @Test
    void charAtException() {
        assertThatThrownBy(() -> {
            "abc".charAt("abc".length());
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("%d", "abc".length());
    }

    @DisplayName("index의 범위가 0 ~ 문자열의 길이-1 을 벗어나면 예외가 발생한다.")
    @Test
    void charAtException2() {
        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    "abc".charAt("abc".length());
                }).withMessageMatching(String.format("String index out of range: %d", "abc".length()));
    }
}

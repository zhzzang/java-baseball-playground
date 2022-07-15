package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SplitterTest {

    @DisplayName("빈 공백 문자열을 기준으로 문자들을 분리한다.")
    @Test
    void separate() {
        String[] result = Splitter.separate("4 / 2 + 8");

        assertThat(result.length).isEqualTo(5);
        assertThat(result).contains("4", "/", "2", "+", "8");
    }

}
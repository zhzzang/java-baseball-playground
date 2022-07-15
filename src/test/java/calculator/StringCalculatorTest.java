package calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class StringCalculatorTest {

    @CsvSource(value = {"4 * 7 / 2:14", "3 / 2 + 2:3"}, delimiter = ':')
    @ParameterizedTest
    void calculate(String input, int expected) {
        StringCalculator stringCalculator = new StringCalculator();

        int result = stringCalculator.calculate(input.split(" "));

        assertThat(result).isEqualTo(expected);
    }
}

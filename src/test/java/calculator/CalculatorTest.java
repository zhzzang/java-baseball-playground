package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CalculatorTest {
    @DisplayName("두 숫자와 연산자를 입력받아 결과를 반환한다.")
    @CsvSource(value = {"3:5:+:8", "5:2:-:3", "4:3:*:12", "10:5:/:2"}, delimiter = ':')
    @ParameterizedTest
    void calculate(int first, int second, String operator, int value) {
        Calculator calculator = new Calculator();

        int result = calculator.calculate(first, second, operator);

        assertThat(result).isEqualTo(value);
    }

    @DisplayName("0으로 나눌 수 없다.")
    @CsvSource(value = {"3:0:/", "5:0:/"}, delimiter = ':')
    @ParameterizedTest
    void divideByZero(int first, int second, String operator) {
        Calculator calculator = new Calculator();

        assertThatThrownBy(() -> calculator.calculate(first, second, operator))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("+, -, /, * 외에 다른 기호는 입력할 수 없다.")
    @Test
    void calculateWithWrongSymbol() {
        Calculator calculator = new Calculator();

        assertThatThrownBy(() -> calculator.calculate(2, 5, "&"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}

package calculator;

public class Calculator {
    public int calculate(int first, int second, String operator) {
        if (operator.equals("+")) {
            return add(first, second);
        }

        if (operator.equals("-")) {
            return subtract(first, second);
        }

        if (operator.equals("*")) {
            return multiply(first, second);
        }

        if(operator.equals("/")) {
            return divide(first, second);
        }

        throw new IllegalArgumentException("알맞은 연산자를 입력해주세요.");
    }

    private int add(int i, int j) {
        return i + j;
    }

    private int subtract(int i, int j) {
        return i - j;
    }

    private int multiply(int i, int j) {
        return i * j;
    }

    private int divide(int i, int j) {
        if (j == 0) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
        return i / j;
    }
}

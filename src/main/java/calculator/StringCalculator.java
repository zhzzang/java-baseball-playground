package calculator;

public class StringCalculator {
    public int calculate(String[] value) {
        Calculator calculator = new Calculator();

        int result = 0;

        for(int i = 0; i + 2 < value.length; i += 2) {
            int first = toInt(value[i]);
            int second = toInt(value[i + 2]);
            String operator = value[i + 1];

            result = calculator.calculate(first, second, operator);
            value[i + 2] = Integer.toString(result);
        }

        return toInt(value[value.length - 1]);
    }

    private int toInt(String str) {
        return Integer.parseInt(str);
    }
}

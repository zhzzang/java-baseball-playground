package calculator;

import java.util.Scanner;

public class StringCalculatorApplication {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            StringCalculator stringCalculator = new StringCalculator();

            String input = sc.nextLine();
            String[] values = Splitter.separate(input);

            System.out.println(stringCalculator.calculate(values));
        } catch (Exception e) {
            System.out.println("[ERROR] " + e.getMessage());
            System.out.println("[INFO] 종료합니다. 다시 입력해주세요.");
        }
    }
}

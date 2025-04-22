package lv2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator(); // 계산기 객체 생성
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();

            System.out.print("연산자를 입력하세요 (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            int result = calc.calculate(num1, num2, operator);
            System.out.println("계산 결과: " + result);

            System.out.print("계속하시겠습니까? (y / exit): ");
            String input = scanner.next();
            if (input.equals("exit")) break;
        }

        System.out.println("저장된 결과 리스트: " + calc.getResults());
    }
}

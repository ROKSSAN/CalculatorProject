package lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {

            System.out.print("첫번째 숫자를 입력하세요 : ");
            int num1 = scanner.nextInt();

            System.out.print("두번째 숫자를 입력하세요 : ");
            int num2 = scanner.nextInt();

            System.out.print("사칙 연산할 문자의 번호를 입력하세요 " +
                    "\n 1. 더하기 \n 2. 빼기 \n 3. 곱하기 \n 4. 나누기 \n :");
            int num3 = scanner.nextInt();

            if (num3 == 1) {
                System.out.println("계산 결과 : " + (num1 + num2));
            } else if (num3 == 2) {
                System.out.println("계산 결과 : " + (num1 - num2));
            } else if (num3 == 3) {
                System.out.println("계산 결과 : " + (num1 * num2));
            } else if (num3 == 4) {
                if (num2 == 0) {
                    System.out.println("Error");
                } else{
                    System.out.println("계산 결과 : " + ((double)num1 / num2));

                }

            }

            System.out.println("계속하려면 y, 끝내려면 n 입력 : ");
            answer = scanner.next();
        } while (answer.equals("y"));
    }
}
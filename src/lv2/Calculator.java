package lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private int result;
    private List<Integer> results = new ArrayList<>();

    public int calculate(int num1, int num2, char operator) {
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    result = 0;
                    break;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                result = 0;
        }

        results.add(result); // 연산 결과 저장
        return result;
    }

    public int getResult() {
        return result;
    }

    public List<Integer> getResults() {
        return results;
    }

    public void setResults(List<Integer> results) {
        this.results = results;
    }

    public void removeResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }
}

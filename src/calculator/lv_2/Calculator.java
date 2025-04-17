package calculator.lv_2;

import java.util.ArrayList;
import java.util.List;

// 계산 구역
public class Calculator {
    // 속성
    int sum;
    private List<Integer> answer = new ArrayList<>();

    // 생성자


    // 기능
    public void Calculation(int a, int b, String c) {
        switch (c) {
            case "+" -> {
                sum = a + b;
                System.out.println("값은 = " + sum);
            }
            case "-" -> {
                sum = a - b;
                System.out.println("값은 = " + sum);
            }
            case "/" -> {
                sum = a / b;
                System.out.println("값은 = " + sum);
            }
            case "*" -> {
                sum = a * b;
                System.out.println("값은 = " + sum);
            }
            default -> System.out.println("사칙연산을 입력해주세요.");
        }
    }

    // 결과값 저장하는 곳
    public void result() {
        answer.add(sum);
        for(int i : answer){
            System.out.println(i);
        }
    }

    // remove( List 첫번째 인덱스 삭제 )
    public void remove(){
        answer.remove(0);
        for(int i : answer){
            System.out.println(i);
        }
    }

    // get List
    public List<Integer> getList() {
        return answer;
    }

    // setter
    public List<Integer> setList(List<Integer> answer) {
        return answer;
    }


}



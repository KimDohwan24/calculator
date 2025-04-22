package calculator.lv_3;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ScanResult<T> {
    Scanner scan = new Scanner(System.in);
    // 속성
    private T values;
    private double result;

    // 생성자
    public ScanResult() {

    }

    public ScanResult(T values) {
        this.values = values;
    }

    // 기능
    private T getNum() {
        return values;
    }

    // Getter
    public double getResult() {
        return result;
    }
    // Setter
//    public void setNum(double result){
//        this.result = result;
//    }

    // 확인용
    public void printNum() {
        System.out.println(result);
    }

    // 예외처리
    public void scanNum() {
        try {
            System.out.println("실수를 입력하세요 :");
            ScanResult<Double> num1 = new ScanResult<>(scan.nextDouble());
            this.result = num1.getNum();
        } catch (InputMismatchException e) {
            System.out.println("실수를 입력하세요");
            scan.next();
        }
    }


}


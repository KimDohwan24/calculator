package calculator.lv_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        ScanResult scanResult = new ScanResult();
        boolean check = true;

        while (check) {
            // 실수 받고 예외처리
            scanResult.scanNum();
            double result1 = scanResult.getResult();
            scanResult.printNum();

            System.out.print("연산자 입력 (+, -, *, /): ");
            String symbol = scan.next();
            OperationType op = OperationType.fromSymbol(symbol);

            scanResult.scanNum();
            double result2 = scanResult.getResult();
            scanResult.printNum();

            arithmeticCalculator.calculation(result1, result2, op);
            arithmeticCalculator.getResult();

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exitProgram = scan.next();
            if(exitProgram.equals("exit")){
                break;
            } else System.out.println("다시 입력해주세요");
        }
    }
}

package calculator.lv_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        ReslutList reslutList = new ReslutList();
        ScanResult scanResult = new ScanResult();

        while (true) {
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

            // 계산 결과
            arithmeticCalculator.calculation(result1, result2, op);
            arithmeticCalculator.printResult();
            double endReslut = arithmeticCalculator.getResult();

            // 리스트에 추가 및 계산결과보다 큰 값만 출력
            reslutList.addList(endReslut);
            reslutList.printList(endReslut);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exitProgram = scan.next();
            if(exitProgram.equals("exit")){
                break;
            } else System.out.println("계산을 계속합니다.");
        }
        
    }
}

package calculator.lv_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();

        while (true) {

            double value1 = 0;
            double value2 = 0;
            try {
                System.out.println("첫번째 실수를 입력하세요 :");
                ScanResult<Double> num1 = new ScanResult<>(scan.nextDouble());
                value1 = num1.getNum();
            } catch (InputMismatchException e) {
                System.out.println("실수를 입력하세요");
                scan.nextLine();
            }

            System.out.print("연산자 입력 (+, -, *, /): ");
            scan.nextLine();
            String symbol = scan.nextLine();
            OperationType op = OperationType.fromSymbol(symbol);

            try {
                System.out.println("두번째 실수를 입력하세요 :");
                ScanResult<Double> num2 = new ScanResult<>(scan.nextDouble());
                value2 = num2.getNum();
            } catch (InputMismatchException e) {
                System.out.println("실수를 입력하세요");
                scan.nextLine();
            }

            arithmeticCalculator.calculation(value1, value2, op);
            arithmeticCalculator.getResult();

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exitProgram = scan.next();
            if(exitProgram.equals("exit")){
                break;
            } else System.out.println("다시 입력해주세요");
        }
    }
}

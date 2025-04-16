package calculator.lv_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("첫번째 양의 정수를 입력해주세요. :");
        int a = scan.nextInt();
        if (a < 0) {
            System.out.println("양의 정수를 입력하세요");
        }

        System.out.println("두번째 양의 정수를 입력해주세요. :");
        int b = scan.nextInt();

        if (b < 0) {
            System.out.println("양의 정수를 입력하세요");
        }

        System.out.println("사칙연산중 하나를 입력해주세요 :");
        scan.nextLine(); // 버퍼에 남은 공백이 없게 처리함.
        String c = scan.nextLine();

        Calculator calculator = new Calculator();
        calculator.Calculation(a,b,c);
    }
}



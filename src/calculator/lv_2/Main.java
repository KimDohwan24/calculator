package calculator.lv_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();

        boolean check = true;

        while (check) {
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


            calculator.Calculation(a,b,c); // 계산
            calculator.result(); // 결과값 리스트에 저장

            System.out.println("계속 계산하시겠습니까? : (Y,N,D)");
            String str = scan.nextLine();

            if (str.equals("Y") || str.equals("y")) {
                check = true;
            } else if (str.equals("N") || str.equals("n")) {
                System.out.println("계산기를 종료합니다.");
                break;
            } else if (str.equals("D") || str.equals("d")) {
                calculator.remove();
            } else {
                System.out.println("Y,N,D으로 입력해주세요");
                break;
            }
        }
    }
}



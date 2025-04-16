package calculator.lv_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 초기값 설정
        int sum = 0;
        boolean check = true;

        while (check) {
            System.out.println("첫번째 양의 정수를 입력해주세요. :");
            int a = scan.nextInt();
            if (a < 0) {
                System.out.println("양의 정수를 입력하세요");
                break;
            }

            System.out.println("두번째 양의 정수를 입력해주세요. :");
            int b = scan.nextInt();

            if (b < 0) {
                System.out.println("양의 정수를 입력하세요");
                break;
            }
            // 버퍼에 남은 공백이 있어 입력하지 않아서 바로 넘어가짐
            // 버퍼는 데이터를 한 곳에서 다른 한 곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는 메모리의 영역 = Queue ( 큐 )
            System.out.println("사칙연산중 하나를 입력해주세요 :");
            scan.nextLine(); // 버퍼에 남은 공백이 없게 처리함.
            String c = scan.nextLine();

            if (c.equals("+")) {
                sum = a + b;
                System.out.println(sum);
            } else if (c.equals("-")) {
                sum = a - b;
                System.out.println(sum);
            } else if (c.equals("/")) {
                sum = a / b;
                System.out.println(sum);
            } else if (c.equals("*")) {
                sum = a * b;
                System.out.println(sum);
            } else System.out.println("사칙연산을 입력해주세요.");

            System.out.println("계속 계산하시겠습니까? : (Y,N)");
            String str = scan.nextLine();

            if (str.equals("Y")) {
                check = true;
            } else if (str.equals("N")) {
                check = false;
                break;
            } else {
                System.out.println("Y나 N으로 입력해주세요");
                break;
            }
        }


//        switch문
//        switch (c) {
//            case "+" -> {
//                sum = a + b;
//                System.out.println(sum);
//                sum = 0;
//            }
//            case "-" -> {
//                sum = a - b;
//                System.out.println(sum);
//                sum = 0;
//            }
//            case "/" -> {
//                sum = a / b;
//                System.out.println(sum);
//                sum = 0;
//            }
//            case "*" -> {
//                sum = a * b;
//                System.out.println(sum);
//                sum = 0;
//            }
//            default -> System.out.println("사칙연산을 입력해주세요.");
//        }


    }
}

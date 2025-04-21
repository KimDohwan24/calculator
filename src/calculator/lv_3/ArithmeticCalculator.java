package calculator.lv_3;

// 계산기 기능

public class ArithmeticCalculator {
    // 속성
    private double num1;
    private double num2;;
    private String symbol;
    private double result;

    // 생성자
    ArithmeticCalculator(){
    }

    // 기능
    public String getSymbol() {
        return symbol;
    }
    public double calculation(Double num1, Double num2, OperationType op) {
        switch (op) {
            case PLUS -> result = num1 + num2;
            case MIN -> result = num1 - num2;
            case MUL -> result = num1 * num2;
            case DIV -> {
                if (num1 == 0 || num2 == 0) throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
            }
        }
        return result;
    }
    public void getResult(){
        System.out.println("결과값 : " + result);
    }
}

package calculator.lv_3;

// enum 처리 ()
public enum OperationType {
    // 속성
    PLUS("+"),
    MIN("-"),
    DIV("/"),
    MUL("*");

    private String symbol;

    // 생성자
    OperationType(String symbol) {
        this.symbol = symbol;
    }

    // 기능
    public String getSymbol() {
        return symbol;
    }

    public static OperationType fromSymbol(String input) {
        for (OperationType op : values()) {
            if (op.getSymbol().equals(input)) {
                return op;
            }
        }
        throw new IllegalArgumentException("올바르지 않은 연산자입니다: " + input);
    }
}

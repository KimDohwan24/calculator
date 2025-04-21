package calculator.lv_3;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ScanResult<T> {
    // 속성
    private T values;

    // 생성자
    public ScanResult(T values) {
        this.values = values;
    }

    // 기능

    public T getNum(){
        return values;
    }
}


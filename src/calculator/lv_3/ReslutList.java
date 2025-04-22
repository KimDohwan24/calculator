package calculator.lv_3;

import java.util.ArrayList;
import java.util.List;

public class ReslutList {
    // 속성
    private List<Double> resultList = new ArrayList<>();
    private double result;

    // 생성자

    // 기능

    public void addList(double result) {
        resultList.add(result);
    }

    public void printList(double threshold) {
        resultList.stream()
                .filter(value -> value > threshold)
                .forEach(System.out::println);
    }
}

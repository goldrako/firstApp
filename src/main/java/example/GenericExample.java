package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericExample {

    // 제네릭 메서드 정의
    public static <T> List<T> Aaa(List<? extends T> list) {
        // 받은 리스트를 새로운 리스트로 복사
        return new ArrayList<>(list);
    }

    // static 없이 선언한 인스턴스 메서드
    public <T> List<T> Aaa2(List<? extends T> list) {
        return new ArrayList<>(list);
    }
    
    public static void main(String[] args) {
        // Integer 리스트 생성
        List<Integer> intList = Arrays.asList(10, 20, 30);

        // Aaa 메서드를 통해 Number 리스트로 복사
        List<Number> numberList = Aaa(intList);
        // 출력
        for (Number num : numberList) {
            System.out.println("Number: " + num);
        }

        // static이 없는 메서드 사용하려면
        GenericExample example = new GenericExample();
        List<Number> numberList2 = example.Aaa2(intList);
        numberList2.forEach( x -> System.out.println("Number: " + x));
        numberList2.stream().forEach( x -> System.out.println("Number: " + x));
        numberList2.stream()
                .map(x -> "Number: " + x)
                .forEach(System.out::println);
        
    }
}

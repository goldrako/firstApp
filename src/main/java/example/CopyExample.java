package example;

import java.util.Arrays;

public class CopyExample {
    public static void main(String[] args) {
        String[] fruits = {"사과", "바나나"};

        for (String fruit : fruits) {
            System.out.println(fruit);
        }        
        
        System.out.println(Arrays.toString(fruits));

        System.out.println("---크기 조정 : 4개-----");
        
        // 길이 4짜리 배열로 복사 (남는 자리는 null로 채워짐)
        fruits = Arrays.copyOf(fruits, 4);

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println(Arrays.toString(fruits));

    }
}

package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {
        // 1) 배열 생성 및 초기화
        String[] fruits = {"사과", "바나나", "귤"};
        
        // 2) 원소 접근
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("fruits[" + i + "] = " + fruits[i]);
        }
        
        // 3) 정렬(Arrays 사용)
        java.util.Arrays.sort(fruits);
        System.out.println("정렬 후: " + java.util.Arrays.toString(fruits));
        
        // 4) 크기 변경 불가 → 새로운 배열 생성
        String[] bigger = new String[5];
        System.arraycopy(fruits, 0, bigger, 0, fruits.length);
        bigger[3] = "포도";
        bigger[4] = "수박";
        System.out.println("확장 후: " + java.util.Arrays.toString(bigger));
        
        // 1) List 생성
        List<String> arrFruits = new ArrayList<>();
        
        // 2) 요소 추가/삽입
        arrFruits.add("사과");
        arrFruits.add("바나나");
        arrFruits.add(1, "귤");   // 인덱스 1 위치에 삽입
        
        // 3) 순회
        for (String f : arrFruits) {
            System.out.println(f);
        }
        
        // 4) 정렬
        Collections.sort(arrFruits);
        System.out.println("정렬 후: " + arrFruits);
        
        // 5) 삭제
        arrFruits.remove("귤");
        arrFruits.remove(0);      // 인덱스 0 삭제
        System.out.println("삭제 후: " + arrFruits);
        
        // 배열 → List
        String[] arr = {"A", "B", "C"};
        List<String> tolist = Arrays.asList(arr);
        System.out.println(tolist);
        // 주의: 고정 크기 List. add/remove 불가.

        List<String> list = new ArrayList<>(Arrays.asList("A","B","C"));
        String[] toarr = list.toArray(new String[0]);
        System.out.println(toarr);
        Arrays.stream(toarr)
        .forEach(System.out::println);
	}

}

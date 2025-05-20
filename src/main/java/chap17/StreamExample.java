package chap17;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("하나", "둘");

        // 1. 스트림을 얻는 방법
        Stream<String> stream1 = list.stream(); // List에서 스트림을 얻음
        Stream<String> stream2 = Arrays.stream(new String[]{"하나", "둘", "셋"}); // 배열에서 스트림을 얻음
        Stream<String> stream3 = Stream.of("넷", "다섯", "여섯"); // 직접 값을 넣어서 스트림을 생성

        // 2. 스트림을 사용하여 출력하는 방법 (forEach)
        list.stream().forEach(System.out::println); // "하나", "둘"을 각각 출력

        // 3. 스트림을 사용하여 배열로 변환하는 방법 (toArray)
        String[] array = list.stream().toArray(String[]::new); // 스트림의 내용을 String 배열로 변환
        System.out.println(Arrays.toString(array)); // 배열의 내용을 "[하나, 둘]" 형식으로 출력

        // 4. 스트림을 사용하여 필터링하고 출력하는 방법 (filter, forEach)
        list.stream()
                .filter(s -> s.length() == 2) // 길이가 2인 문자열만 필터링 ("둘"만 남음)
                .forEach(System.out::println); // 필터링된 결과인 "둘"을 출력

        // 5. 스트림을 사용하여 매핑하고 출력하는 방법 (map, forEach)
        list.stream()
                .map(s -> s + "!") // 각 문자열에 "!"를 붙임 ("하나!", "둘!")
                .forEach(System.out::println); // 매핑된 결과인 "하나!", "둘!"을 각각 출력

        // 6. 스트림을 사용하여 특정 조건에 맞는 요소가 있는지 확인하는 방법 (anyMatch, allMatch, noneMatch)
        boolean anyMatch = list.stream().anyMatch(s -> s.startsWith("하")); // "하"로 시작하는 요소가 하나라도 있는지 확인 (true)
        boolean allMatch = list.stream().allMatch(s -> s.length() == 3); // 모든 요소의 길이가 3인지 확인 (true)
        boolean noneMatch = list.stream().noneMatch(s -> s.contains("세")); // "세"를 포함하는 요소가 없는지 확인 (true)

        System.out.println("anyMatch: " + anyMatch);
        System.out.println("allMatch: " + allMatch);
        System.out.println("noneMatch: " + noneMatch);
    }
}

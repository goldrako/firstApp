package chap17;

import java.util.stream.IntStream;

public class Sample15 {

    public static void main(String[] args) {
    	/**
    	 * sum1, sum2, sum3 계산 순서에 상관없이 대체적으로 시간
    	 * 스트림 출력 시간 - 17~20
    	 * 스트림 출력 시간 - 0~1
    	 * 스트림 출력 시간 - 0~1
    	 */
    	long processTime1 = System.currentTimeMillis();
    	int sum3 = IntStream.rangeClosed(1, 100).reduce(0, Integer::sum);
    	System.out.println("스트림 출력 시간 - " + (System.currentTimeMillis() - processTime1));
    	
        processTime1 = System.currentTimeMillis();
        //1부터 100까지의 합
        int sum2 = IntStream.rangeClosed(1, 100).reduce(0, (x, y) -> {
        	return x + y;
        }
        		);
        System.out.println("스트림 출력 시간 - " + (System.currentTimeMillis() - processTime1));

        processTime1 = System.currentTimeMillis();
        int sum1 = IntStream.rangeClosed(1, 100).reduce(0, (x, y) -> x + y);
        System.out.println("스트림 출력 시간 - " + (System.currentTimeMillis() - processTime1));


        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }

}
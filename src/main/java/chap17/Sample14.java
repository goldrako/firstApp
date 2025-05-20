package chap17;

import java.util.stream.IntStream;

public class Sample14 {

    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0, sum3 = 0;
        for(int i=6; i <= 10; i++) {
            sum1 += i;
        }
        System.out.println("for 문 결과 : " + sum1);
        
        sum2 = IntStream.rangeClosed(7, 10)
                        .reduce(6, Integer::sum);

        System.out.println("reduce(sum2) 문 결과 : " + sum2);

        sum3 = IntStream.rangeClosed(7, 10)
                .reduce(6, (x,y) -> x+y);

        System.out.println("reduce(sum3) 문 결과 : " + sum3);        
    }

}

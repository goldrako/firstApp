package chap05;

public class Sample01 {

	public static void main(String[] args) {
		int[] number = new int[3];
		number[0] = 10;
		number[1] = 20;
		number[2] = 30;
        System.out.printf("배열의 개수는 %d개 입니다.", number.length);
		
        int[] number2 = {10,20,30};
		System.out.printf("\n\n배열의 개수는 %d개 입니다.", number2.length);
		
		int[] score = {1,2,3,4,5,6,7,8,9,0};
        System.out.println("\n\n" + score[5]);
        
        int[] score2 = score.clone();
        System.out.println("\n" + score2[9]);
        
	}

}

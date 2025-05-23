package chap16;

public class Sample01 {

    public static void main(String[] args) {
        Sample01Function f = (n) -> {
        	System.out.println("샘플01테스트 출력");
        	System.out.printf("Name is %s.", n);
        };
        
        Sample01Function f2 = new Sample01Function() {
			
			@Override
			public void test(String name) {
				System.out.printf("\n당신은 %s이군요.", name);
			}
		};
		
        f.test("Charlie");
        f2.test("Spring");
    }

}

//@FunctionalInterface : 딱 하나의 추상 메서드만 가진 함수형 인터페이스
@FunctionalInterface
interface Sample01Function {
    public abstract void test(String name);  //구현해야 할 유일한 추상 메서드
}

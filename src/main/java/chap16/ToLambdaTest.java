package chap16;

public class ToLambdaTest {

	public static void main(String[] args) {
	    Runnable r = () -> System.out.println("익명 내부 클래스 실행");
	    r.run();
	}

}

@FunctionalInterface
interface Runnable {
    public abstract void run();
}

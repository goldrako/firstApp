package chap08.Sample07;

public class Data {
    String name;
    int    age;  

    public Data() {
        System.out.println("Data 초기화합니다");
        this.name = "빵형";
        this.age  = 21;
    }

    public Data(String name, int age) {
    	this.name = name;
    	this.age = age;    	
    }
    /**
     * 초기화된 내용을 출력하기 위한 메서드
     */
    public String toString() {
        return "Data [name=" + name + ", age=" + age + "]";
    }

}

package chap12;

public class Sample03 {

    public static void main(String[] args) {
        Color1 inputColor = Color1.RED;

        System.out.println(inputColor.equals(Color1.RED) ? "Red" : "Not red");
        System.out.println(inputColor.equals(Size1.SMALL) ? "Red" : "Not red");
        System.out.println(Color1.RED);
        System.out.printf("%s", Color1.RED);
        
    }

}

// 색 집합
enum Color1 {
    RED {
    	@Override
    	public String toString(){
    		return "빨간색";
    	}
    }, 
    BLUE, 
    ORANGE;
}

// 크기 집합
enum Size1 {
    SMALL, MIDIUM, LARGE;
}

package example;

class Parent {
    void cook() {
        System.out.println("부모: 김치찌개를 고전 방식으로 요리합니다.");
    }
}

class Child extends Parent {
    @Override
    void cook() {
        System.out.println("자식: 김치찌개에 치즈를 넣어서 요리합니다.");
    }
}

public class OverrideExample {
    public static void main(String[] args) {
        Parent p = new Child();  // 부모 타입이지만 자식 인스턴스
        p.cook(); // "자식: 김치찌개에 치즈를 넣어서 요리합니다." 출력됨!
    }
}

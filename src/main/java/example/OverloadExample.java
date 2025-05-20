package example;

class Phone {
    void call(String input) {
        if (input.matches("\\d{10,11}")) {
            System.out.println(input + "로 전화를 겁니다.");
        } else {
            System.out.println(input + "에게 전화를 겁니다.");
        }
    }

    void call(String name, int time) {
        System.out.println(name + "에게 " + time + "분 동안 전화를 겁니다.");
    }
}

public class OverloadExample {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call("지민");             // 지민에게 전화를 겁니다.
        phone.call("태형", 10);         // 태형에게 10분 동안 전화를 겁니다.
        phone.call("01012345678");     // 01012345678로 전화를 겁니다.
    }
}
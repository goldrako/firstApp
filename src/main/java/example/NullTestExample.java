package example;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Target(ElementType.TYPE_PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@interface NullTest { }

// 제네릭 클래스
class Box<@NullTest T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public void printValue() {
        if (value == null) {
            System.out.println("경고: Null 값이 설정되었습니다!");
        } else {
            System.out.println("값: " + value);
        }
    }
}

public class NullTestExample {
    public static void main(String[] args) throws Exception {
        Box<String> box1 = new Box<>(null);
        box1.printValue();

        Box<String> box2 = new Box<>("Hello");
        box2.printValue();

        // 어노테이션 정보 출력
        TypeVariable<?>[] typeParameters = Box.class.getTypeParameters();
        for (TypeVariable<?> tp : typeParameters) {
            for (Annotation annotation : tp.getAnnotations()) {
                System.out.println("타입 파라미터에 붙은 어노테이션: " + annotation);
            }
        }
    }
}

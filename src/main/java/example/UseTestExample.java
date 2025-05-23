package example;

import java.lang.annotation.*;
import java.lang.reflect.*;
//import java.util.*;

@Target(ElementType.TYPE_USE)
@Retention(RetentionPolicy.RUNTIME)
@interface UseTest { }

class Person {
    private final @UseTest String name;

    public Person(@UseTest String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("이름: " + name);
    }
}

public class UseTestExample {
    public static void main(String[] args) throws Exception {
        Person p = new Person("홍길동");
        p.printName();

        // 필드에 붙은 어노테이션 검사
        Field field = Person.class.getDeclaredField("name");
        AnnotatedType type = field.getAnnotatedType();
        Annotation[] annotations = type.getAnnotations();

        for (Annotation a : annotations) {
            System.out.println("필드 타입에 붙은 어노테이션: " + a);
        }
    }
}

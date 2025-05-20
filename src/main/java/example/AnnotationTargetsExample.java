package example;

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.Arrays;

public class AnnotationTargetsExample {

    public static void main(String[] args) throws Exception {
        Class<?> clazz = ExampleClass.class;

        // 클래스 어노테이션
        System.out.println("클래스 어노테이션: " + Arrays.toString(clazz.getAnnotations()));

        // 필드 어노테이션
        Field field = clazz.getDeclaredField("name");
        System.out.println("필드 어노테이션: " + Arrays.toString(field.getAnnotations()));

        // 메서드 어노테이션
        Method method = clazz.getDeclaredMethod("sayHello", String.class);
        System.out.println("메서드 어노테이션: " + Arrays.toString(method.getAnnotations()));

        // 파라미터 어노테이션
        Annotation[][] paramAnnos = method.getParameterAnnotations();
        for (Annotation anno : paramAnnos[0]) {
            System.out.println("파라미터 어노테이션: " + anno);
        }
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MyClassAnno { }

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyFieldAnno { }

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyMethodAnno { }

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@interface MyParamAnno { }

@MyClassAnno
class ExampleClass {

    @MyFieldAnno
    private String name;

    @MyMethodAnno
    public void sayHello(@MyParamAnno String msg) {
        System.out.println("Hello, " + msg);
    }
}

package example;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Annotation;

/**
 * 리플렉션을 이용한 어노테이션 검사 코드
 * 리플레션(reflection):프로그램이 실행 중에 자기 자신(클래스, 메서드, 필드 등)의 정보를 조사하거나 조작할 수 있는 기능
 */
public class RetentionTest {

    public static void main(String[] args) {
        Class<TestAnnoClass> clazz = TestAnnoClass.class;  
        Annotation[] annotations = clazz.getAnnotations();

        System.out.println("=== Runtime에서 감지된 어노테이션 ===");
        for (Annotation annotation : annotations) {
            System.out.println(annotation.annotationType().getName());
        }
    }
}

// 어노테이션 정의

@Retention(RetentionPolicy.SOURCE)
@interface SourceAnno { }

@Retention(RetentionPolicy.CLASS)
@interface ClassAnno { }

@Retention(RetentionPolicy.RUNTIME)
@interface RuntimeAnno { }

// 어노테이션 적용 클래스

@SourceAnno
@ClassAnno
@RuntimeAnno
class TestAnnoClass { }

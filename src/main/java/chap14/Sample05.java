package chap14;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

public class Sample05 {

    @Sample05AnnoField
    private String test;
    
    @Sample05AnnoField
    private Color1 color = Color1.RED;
    
    private int number = 42; // 어노테이션이 없는 필드    

    public static void main(String[] args) {
        Sample05 sample = new Sample05();

        System.out.println("=== @Sample05AnnoField 어노테이션이 붙은 필드 ===");

    	for (Field field : Sample05.class.getDeclaredFields()) {
    	    if (field.isAnnotationPresent(Sample05AnnoField.class)) {
    	        System.out.println(field.getName() + " is marked with @Sample05AnnoField");
    	    }
    	}
        
        // 리플렉션을 통해 어노테이션 탐색
        for (Field field : Sample05.class.getDeclaredFields()) {
            if (field.isAnnotationPresent(Sample05AnnoField.class)) {
                field.setAccessible(true); // private 필드 접근 허용
                try {
                    Object value = field.get(sample);
                    System.out.println(field.getName() + " = " + value);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public void testMethod() { }
    
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Sample05AnnoField { }

enum Color1 {
    RED, BLUE, ORANGE;
}

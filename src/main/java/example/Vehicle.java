package example;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Vehicle {
    // final 필드 - 생성자에서 초기화 필수
    private final String registrationNumber;
    private final int yearOfManufacture;
    
    // @NonNull 필드 - 생성자에서 초기화 필수 + null 체크 수행
    @NonNull
    private String manufacturer;
    
    // 일반 필드 - 생성자에서 초기화되지 않음
    private String model;
    private int mileage;
    private String color;
    
    // 사용자 정의 메소드
    public void displayInfo() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Year: " + yearOfManufacture);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + (model != null ? model : "Not specified"));
        System.out.println("Mileage: " + mileage);
        System.out.println("Color: " + (color != null ? color : "Not specified"));
    }
    
    // 일반 필드를 위한 setter 메소드
    public void setModel(String model) {
        this.model = model;
    }
    
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    // 메인 메소드로 테스트
    public static void main(String[] args) {
        // @RequiredArgsConstructor에 의해 생성된 생성자 사용
        Vehicle car = new Vehicle("ABC123", 2022, "Toyota");
        
        // 일반 필드는 setter를 통해 설정
        car.setModel("Corolla");
        car.setMileage(5000);
        car.setColor("Blue");
        
        car.displayInfo();
        
        // final 필드는 변경 불가
        // car.registrationNumber = "XYZ789"; // 컴파일 오류 발생
        
        // null 체크 테스트
        try {
            Vehicle invalidCar = new Vehicle("DEF456", 2023, null); // NullPointerException 발생
        } catch (NullPointerException e) {
            System.out.println("\nException caught: " + e.getMessage());
        }
    }
}

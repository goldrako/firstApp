package chap08;

import lombok.Data;
import lombok.NonNull;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;

@Data
public class Car {
	@NonNull
    private String color;
    private int    door;
    private String manufacturer;
	
}



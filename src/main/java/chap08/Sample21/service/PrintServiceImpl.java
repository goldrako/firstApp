package chap08.Sample21.service;

public class PrintServiceImpl {
    public static DataServiceImpl data = new DataServiceImpl();
    
	public void printMessage() {
		System.out.printf("Hello!! %s", data.getName());
	}

}

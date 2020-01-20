package fruittest;

public class AppleTree {
	
	int apple;
	
	public int appledrop() {
		
		apple--;
		System.out.println("사과 하나 떨어졌음");
		return 1;
		
	}
	
	public void appleopen() {
		
		System.out.println("사과 열렸음");
		
		apple++;
		
	}
	
	public void display() {
		
		System.out.println("현재 사과 갯수"+apple);
	}
	
	

}

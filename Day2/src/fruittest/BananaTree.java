package fruittest;

public class BananaTree {
	
	int banana;
	
	public int bananadrop() {
		
		banana--;
		System.out.println("바나나 떨어졌음");
		return 1;
		
	}
	
	public void bananaopen() {
		
		banana++;
		System.out.println("바나나 열렸음");
		
	}
	
	public void display() {
		
		System.out.println("현재 바나나 갯수"+banana);
	}

}

package fruittest;

public class Customer {
	
	String name;
	int myapple;
	int mybanana;
	
	public void eatapple(int a) {
		System.out.println("사과냠냠");
		myapple = myapple - a;
	}
	
	public void eatbanana() {
		System.out.println("바나나냠냠");
		mybanana--;
	}
	
	public void display() {
		System.out.println("현재 남은 과일 갯수");
		
		System.out.println("사과갯수:" + myapple +"개");
		System.out.println("바나나갯수:" + mybanana+"개");
		
	}

}

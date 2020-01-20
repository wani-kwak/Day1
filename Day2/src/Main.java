import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student();  //  클래스 이름 , 변수 이름(별칭)  = new고정 클래스이름();
		
		Snake s2 = new Snake(); // 뱀도 객체화 시키는 코드
		
		s1.age = 20;
		s1.name = "홍길동";
		
		s1.studying();
		s1.display();
		
		Snake s3 = new Snake();
		Snake s4 = new Snake();
		
		Scanner scan = new Scanner(System.in);
		
		s3.name = scan.nextLine();
		s3.exp = scan.nextDouble();
		
		s3.info();
		
		
		
	
		
		

	}

}

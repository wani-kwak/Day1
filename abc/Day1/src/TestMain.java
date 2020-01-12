import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
//		int a = 10;
//		double b = 3.14;
//		String c = "곽병완";
//		char d = 'F';
		
//		int a = 50;
//		
//		if(a>30) {
//			System.out.println("good");		
//		}else
//			System.out.println("fail");
		
//		int a = 100;
//		
//		if(a>150) 
//			System.out.println("one");
//		else if(a>50)
//			System.out.println("two");
//		else if(a>30)
//			System.out.println("three");
//		else
//			System.out.println("four");
//		}
		
		
	
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); //국어점수
		int b = scan.nextInt(); //수학점수
		int c = scan.nextInt(); //영어점수
		
		int total = a+b+c; // 점수의 합
		int avg = total/3; // 평균 점수
		
		if(avg>90) 
			System.out.println("A");
		else if(avg>80) 
			System.out.println("B");
		else if(avg>70)
			System.out.println("C");
		else
			System.out.println("D");
		
		
	}
}

	
	


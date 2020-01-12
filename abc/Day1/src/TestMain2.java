import java.util.Scanner;

public class TestMain2 {

	public static void main(String[] args) {
//		int sum = 1;
//		for(int i = 1 ; i <=10 ; i++) {
//			sum*=i;
//		}
//			System.out.println(sum);
		
//		int i = 1;
//		
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
		
//		int a = 1;
//		System.out.println(++a);
//		System.out.println(a);
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
				
//		for(int i = 1 ; i < 10 ; i++) {
//			System.out.println(n+ "*"+ i +"="+ n*i);
//		}
		
//		int i = 1;
//		
//		while(i<10) {
//			System.out.println(n+ "*"+ i +"="+ n*i);
//			i++;
//		}
//		
//		scan.close();
		// 미완성 단계
//			if(a>b) {
//			 if(a>c) {
//				if(a>c) {
//					int max = a;
//					System.out.println(max);
//			}
		// &&를 써서 다시 구현해보기!!
		if(a>b) {
			if(a>c) {
				System.out.println("a가 최대");
			}	
		}
		else if(b>a) {
			if(b>c) {
				System.out.println("b가 최대");
			}
		}
		else if(c>a) {
			if(c>b) {
				System.out.println("c가 최대");
			}
		}
		
		
			
		
		
		}	
	}



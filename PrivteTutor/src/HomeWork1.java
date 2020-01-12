import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {

//		int n;
//		Scanner scan = new Scanner(System.in);
//	
//		System.out.println("출력할 단을 입력하세요");
//		System.out.println("============");
//		
//		n = scan.nextInt();
//		
//		for(int i = 1 ; i < 10 ; i++) {
//			System.out.println(n+"*"+i+"="+n*i);
//		}
		
		// 숙제1 && 이용해서 간단하게 만들기 - 완료
		
		int k,t,p;
		
		Scanner scan = new Scanner(System.in);
		
		k = scan.nextInt();
		t = scan.nextInt();
		p = scan.nextInt();
		
		if(k>t && k>p) {
			System.out.println(k+"가(이) 최대값이다.");
		}
		if(t>k && t>p) {
			System.out.println(t+"가(이) 최대값이다.");
		}
		
		if(p>k && p>t) {
			System.out.println(p+"가(이) 최대값이다.");
		}
		scan.close();
	}

}

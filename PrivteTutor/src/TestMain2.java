import java.util.Scanner;

public class TestMain2 {

	public static void main(String[] args) {
	// 1부터 10까지 구하는 합
		
		int a = 0;
		for(int i = 0 ; i < 10; i++) {
			a+=i;
		}
		System.out.println("1부터 10까지의 합은? : "+a);
		
	// 1부터 30 까지 곱
		
		int b = 1; // 곱셉이니까 0 하지마!
		for(int	i = 1 ; i <= 30; i++) {
			b*=i;
		}
		
		System.out.println("1부터 30까지의 곱은? : "+b);
		
	// 1부터 100 까지 더하기 while로
		
		int sum = 0;
		int j = 0;
		
		while(j<100) {
			
			sum = sum+j; 
			j++;
		}
		System.out.println("1부터 100까지의 합은? : "+sum);
		
		
	// 최대값 구하기
		int k,t,p;
		
		Scanner scan = new Scanner(System.in);
		
		k = scan.nextInt();
		t = scan.nextInt();
		p = scan.nextInt();
		
		if(k>t) {
			if(k>p) {
				System.out.println(k+"가(이) 최대값이다.");
			}
		}
		
		if(t>k) {
			if(t>p) {
				System.out.println(t+"가(이) 최대값이다.");
			}
		}
		
		if(p>k) {
			if(p>t) {
				System.out.println(p+"가(이) 최대값이다.");
			}
		}
		
		scan.close();
		
		

	}

}

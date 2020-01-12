import java.util.Scanner;

public class TestMain1 {

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력하세요");
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		int total = a+b+c;
		int avg = total/3;
		
		System.out.println("평균은 :"+avg+"점");
		
		/// 평균 5점 단위로 #으로 갯수 나타내기
		
		int mok = avg/5; // 평균점수를 5로 나눈다.
		
		for(int i = 0 ; i < mok ; i++) {
			System.out.print("#");
		}
		
		scan.close();
				
	}

}

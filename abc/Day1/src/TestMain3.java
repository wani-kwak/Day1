import java.util.Scanner;

public class TestMain3 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		int total = a+b+c;
		int avg = total/3;
		
		System.out.println(avg);
		
		int mok = avg/5;
		
		for(int i = 0 ; i < mok ; i++) {
			System.out.print("#");
		}
	}

}

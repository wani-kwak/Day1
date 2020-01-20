
public class MethodMain {

	public static void main(String[] args) {
		speak(); // 상자를 부르는 기본 형태
		
		int a = go();
		
		System.out.println(a); 
		
		add(1,2);
		
		double r = array(3.14,5);
		
		System.out.println("원의 넓이는: " + r +"입니다.");
		
		int c = multiple(2,3);
		System.out.println("두 수의 곱은: "+c);
		
		gugudan(2,5);
		
		int d = check(3);
		if(d == 1) {
			System.out.print("짝수입니다");
		}
		else {
			System.out.print("홀수입니다");
		}
		
		
		
	}
	
	// 상자를 만들고 ~~라는 이름을 붙힌다.
	
	public static void speak() {
		
		System.out.println("나는 간다.");
		
	}
	
	public static int go() {
		
		int a = 5;
		return a;
		
	}
	
	public static void add(int a , int b) {
		
		int r = a+b;
		System.out.println("결과:"+r);
	}
	
	public static double array(double a, double b) {
		
		double r = a * (b*b);
		
		
		return r;
	}
	
	public static int multiple(int a , int b) {
		
		int c = a*b;
		return c;
	}
	
	
	public static void gugudan(int a , int b) {
		for(int i = a ; i <= b ; i++) {
			for(int j = 1 ; j < 10 ; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
	}
	
	public static int check(int a){
		if(a%2==0) {
			return 1;
		}
		else {
			return 0;
		}
		
	}

}

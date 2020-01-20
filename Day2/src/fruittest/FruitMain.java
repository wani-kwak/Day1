package fruittest;

import java.util.Scanner;

public class FruitMain {

	public static void main(String[] args) {
		
		AppleTree a1 = new AppleTree();
		
		a1.apple = 50; // 사과 50개
		
		BananaTree b1 = new BananaTree();
		
		b1.banana = 25; // 바나나 25개
		
		Customer c1 = new Customer();
		
		c1.name = "김김김";
		c1.myapple = 0;
		c1.mybanana = 0;
		
		a1.display();
		b1.display();
		c1.display();
		
		a1.appledrop();
		a1.appledrop();
		a1.appledrop();
		
		
		
		b1.bananadrop();
		b1.bananadrop();
		b1.bananadrop();
		b1.bananadrop();
		b1.bananadrop();
		
		
		
		a1.appledrop();
		a1.appledrop();
		a1.appledrop();
		a1.appledrop();
		a1.appledrop();
		
		
		c1.myapple = c1.myapple + a1.appledrop(); // 떨어진 사과 하나 주워가기
		c1.myapple = c1.myapple + a1.appledrop();
		c1.myapple = c1.myapple + a1.appledrop();
		a1.appledrop();
		a1.appledrop();
		
		a1.display();
		b1.display();
		c1.display();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("사과 몇개 먹을래?");
		int apple = scan.nextInt();
		
		c1.eatapple(apple);
		
//		c1.eatapple();
//		c1.eatapple();
		
		c1.display();
		
		
	}

}

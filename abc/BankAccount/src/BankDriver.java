
public class BankDriver {
	public static void main(String[] args) {
		// 사람선언
		
		Person p1 = new Person(); //person 인스턴스 선언
		
		p1.setName("김신의");
		p1.setAge(-22);
		p1.setAge(28);
		p1.setCashAmount(30000);
		

		// 은행 계좌 생성
		
		BankAccount a1 = new BankAccount();
		a1.balance = 100000;
		
		p1.setAccount(a1);
		a1.setOwner(p1);
		
		// p2 생성
		Person p2 = new Person();
		
		p2.setName("문종모");
		p2.setAge(25);
		p2.setCashAmount(100000); // p2의 초기 현금 보유량
		
		// 은행 계좌2 생성
		BankAccount a2 = new BankAccount();
		a2.balance = 500000;
		
		p2.setAccount(a2);
		a2.setOwner(p2);
		
		
//		System.out.println(a2.deposit(30000));
//		System.out.println(a2.withdraw(170000));
//		System.out.println(a2.deposit(620000));
//		System.out.println(a2.withdraw(890000));
		
		//계좌이체 테스트
		a2.transfer(a1, 200000);
        a1.transfer(p2, 150000);
        p2.transfer(a1, 270000);
        p1.transfer(p2, 130000);
		
				
	}
}

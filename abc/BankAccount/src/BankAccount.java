
public class BankAccount {

	int balance;
	Person owner; // owner는 참조변수
	

	// 파라미터 : 입금할 액수 (정수)
	// 리턴 : 성공여부(불린)
	
	public void setBalance(int newBalance) {
		balance = newBalance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setOwner(Person newOwner) {
		owner = newOwner;
	}
	
	public Person getOwner() {
		return owner;
	}

	boolean deposit(int amount) {
		if (amount < 0 || owner.getCashAmount() < amount) {
			System.out.println("입금 실패입니다. 잔고:" + balance + "원," + " 현금: " + owner.getCashAmount() + "원");
			return false;
		} else {
			owner.setCashAmount(owner.getCashAmount() - amount);
			balance += amount;
			System.out.println(amount + "원 입금하였습니다. 잔고:" + balance + "원," + " 현금: " + owner.getCashAmount() + "원");
			return true;

		}

	}
	
	boolean deposit(double amount, double exchangeRate) { // 메소드 오버로
		System.out.println();
		return deposit((int)(amount * exchangeRate));
	}

	// 파라미터 : 출금할 액수 (정수)
	// 리턴 : 성공여부(불린)

	boolean withdraw(int amount) {
		if (amount < 0 || balance < amount) {
			System.out.println("출금 실패입니다. 잔고: " + balance + "원," + " 현금: " + owner.getCashAmount() + "원");
			return false;
		} else {
			balance -= amount;
			owner.setCashAmount(owner.getCashAmount() + amount);
			System.out.println(amount + "원 출금하였습니다. 잔고: " + balance + "원," + " 현금: " + owner.getCashAmount() + "원");
			return true;
		}

	}

	// 첫 번째 파라미터 : 받는 사람(Person)
	// 두 번째 파라미터 : 이체 할 금액(정수)
	// 리턴 : 성공여부(불린)

	boolean transfer(BankAccount to, int amount) {
		boolean success;
		
		if(amount < 0 || amount > balance) {
			success = false;
		}	else {
				balance -= amount;
				to.balance += amount;
				success = true;
			}
			System.out.println(success + " - from: "+owner.getName() + ", to: " + ((Person) to.owner).getName()
            + ", amount: " + amount
            + ", balance: " + balance);
			
			return success;
		}
	
	public boolean transfer(Person to, int amount) {
		return transfer(to.getAccount(),amount);
	}
		
	}



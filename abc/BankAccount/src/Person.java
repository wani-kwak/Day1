
public class Person {
	private String name;
	private int age;  // private로 선
	private int cashAmount;
	private BankAccount account; // account 참조변수
	public int balance;
	public Object owner;
	
	// private 이니까 값을 넣어주려면 이렇게 해야된다.= 접근제어자!!
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName()	{
		return name;
	}
	
	public void setAge(int newAge) { 
		if(newAge>=0) {
			age = newAge;
		}
		
	}
	
	public int getAge() {
		return age;
	}
	
	public void setCashAmount(int newCashAmount) {
		if(newCashAmount > 0) {
		cashAmount = newCashAmount;	
	   }
	}
	
	public int getCashAmount(){
		return cashAmount;
	}
	

	
	public void setAccount(BankAccount newAccount) {
		account = newAccount;
	}
	
	public BankAccount getAccount() {
		return account;
	}
	
	   public boolean transfer(Person to, int amount) {
	        return account.transfer(to.getAccount(), amount);
	    }

	    // account와 account 간의 거래이므로, BankAccount 클래스의 transfer 메소드를 써야함.
	    public boolean transfer(BankAccount to, int amount) {
	        return account.transfer(to, amount);
	    }
	 	

}

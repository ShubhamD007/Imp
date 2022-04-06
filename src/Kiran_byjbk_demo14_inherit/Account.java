package Kiran_byjbk_demo14_inherit;

public class Account {
	int accno;
	String name;
	double balance;

	public Account(int accno, String name, double balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

		  void deposit (double amount ) {
			  balance = balance + amount;
		}
		  void withdraw (double amount) {
			  balance = balance - amount;
		  }
		  void showbalance() {
			  System.out.println("total balance " +balance);
		  }
		
	
	
}

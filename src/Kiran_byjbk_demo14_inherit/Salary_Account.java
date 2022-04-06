package Kiran_byjbk_demo14_inherit;

public class Salary_Account extends Account {
	
	void withdraw (double amount) {
		if(balance - amount>0)
		  balance = balance - amount;
	  }
	
	public Salary_Account(int accno, String name, double balance) {
		super(accno, name, balance);
		 	}
	 
}

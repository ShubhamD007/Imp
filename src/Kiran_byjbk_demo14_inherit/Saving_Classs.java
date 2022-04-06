package Kiran_byjbk_demo14_inherit;

public class Saving_Classs extends Account {
	public Saving_Classs(int accno, String name, double balance) {
		super(accno, name, balance);

	}

	void withdraw(double amount) {
		if (balance - amount >= 10000)
			balance = balance - amount;
		else
			System.out.println("Maintain minimum balance");

	}

	void calintrest() {
		float rate = 7.00f;
		double intrest = balance * 1 * rate/100;
		System.out.println("Intrest" + intrest);
	}

}
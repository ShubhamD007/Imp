package KiranByJava_Simple_pro;

public class Saving_Account {

	int account;
	String name;
	float balence;

	void Deposit(float amount) {
		balence = balence + amount;

	}

	void Withdrwal(float amount) {
		balence = balence - amount;

	}

	void Showbalence(float amount) {
		System.out.println(balence);

	}

	public static void main(String[] args) {
		Saving_Account sa = new Saving_Account();
		System.out.println(sa.account = 6712);
		System.out.println(sa.name = "Shubham");
		sa.balence = 2400.25f;
		sa.Deposit(2000.98f);
		sa.Withdrwal(1800);
		sa.Deposit(1400);
		sa.Withdrwal(1100);
		sa.Showbalence(0);
	}
}

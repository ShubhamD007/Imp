package Kiran_by_jbk_Demo03;

public class Local_varible_instan {

	int t = 10; // instance variable use only with in that class

	void m1() {
		int t = 100;// local variable use only within that method
		t = t + 1;
		System.out.println("its local vaibel " + t);

		this.t = this.t + 1;
		
		System.out.println("This value ref the instance value " + this.t);

	}

	void m2() {

		System.out.println("its instance varible " + t);
	}

	public static void main(String[] args) {
		Local_varible_instan l = new Local_varible_instan();
		l.m1();
		l.m2();

	}
}
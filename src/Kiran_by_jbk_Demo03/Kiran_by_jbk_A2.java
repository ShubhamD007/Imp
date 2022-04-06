package Kiran_by_jbk_Demo03;

public class Kiran_by_jbk_A2 {

	int x = 20;
	void m1(int t) {
		System.out.println("======m1=====");
		System.out.println(t);
		x = x + 1;
		System.out.println(x);
	}
	void m2() {
		System.out.println("======m2=========");
		x = x + 1;
		System.out.println(x);
	}
	void m3() {
		System.out.println("======m3=========");
		x = x + 1;
		System.out.println(x);
	}
	public static void main(String[] args) {
		Kiran_by_jbk_A2 a2 = new Kiran_by_jbk_A2();
		a2.m1(10);
		a2.m1(56);
		a2.m2();
		a2.m3();
	}

}

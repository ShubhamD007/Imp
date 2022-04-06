package Kiran_by_jbk_Demo03;

public class Kiran_by_jbk_A1 {

	int add(int a, int b) {
		int c = a + b;
		return c;
	}

	int sub(int a, int b, int c) {
		int d = a + b + c;
		return d;

	}

	int mul(int s, int f) {
		int r = s * f;
		return r;

	}

	int div(int o, int p) {
		int y = o / p;
		return y;
	}

	public static void main(String[] args) {
		Kiran_by_jbk_A1 a = new Kiran_by_jbk_A1();
		int s = a.add(50, 45);
		System.out.println(s);
		System.out.println(a.sub(54, 65, 5));
		System.out.println(a.div(50, 10));
		System.out.println(a.mul(5, 4));

	}
}

package KiranByJava_Simple_Basic;

public class Simple_Method_different {

	int x = 0;
	int y = 0;

	public static void main(String[] args) {
		Simple_Method_different sm = new Simple_Method_different();
		Simple_Method_different sm1 = new Simple_Method_different();
		Simple_Method_different sm2 = new Simple_Method_different();

		sm.x = sm.x + 1;  sm.y = sm.y + 1;

		sm1.x = sm.x + 1;  sm1.y = sm1.y + 1;

		sm2.x = sm1.x + 1; 	sm2.y = sm2.y + 1;

		System.out.println(sm.x + " " + sm.y);
		System.out.println(sm1.x + " " + sm1.y);
		System.out.println(sm2.x + " " + sm2.y);
	}

}

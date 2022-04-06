package KiranByJava_Simple_Basic;

public class Simple_Method {
	int x = 0;
	int y = 0;

	public static void main(String[] args) {

		Simple_Method sm = new Simple_Method();
		Simple_Method sm1 = new Simple_Method();
		Simple_Method sm2 = new Simple_Method();
		sm.x = sm.x + 1; sm.y = sm.y + 1;
		
		sm1.x = sm.x + 1;  sm1.y = sm1.y + 1;
		
		sm2.x = sm1.x + 1;  sm2.y = sm2.y + 1;

		System.out.println(sm.x + " " + sm.y);
		System.out.println(sm1.x + " " + sm1.y);
		System.out.println(sm2.x + " " + sm2.y);

	}

}

package Kiran_byjbk_inheritance_demo08;

public class Test {

	public static void main(String[] args) {
		A a = new A();
		a.m1();
		A a1 = new B(); // parent class reference he eslilye o sirf 
		a1.m1();
		
		
		B b = new B();
		b.m1();
		b.m2();
		
		B n = new C();
		n.m1();
		n.m2();
		
		C c = new C();
		c.m1();
		c.m2();
		c.m3();

	}

}

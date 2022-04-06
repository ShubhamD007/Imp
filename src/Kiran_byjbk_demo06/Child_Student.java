package Kiran_byjbk_demo06;

public class Child_Student extends Parent_Student {

	void mul(int a, int b) {
		int c = a * b;
		System.out.println(c);
	}

	void div(int a, int b) {
		int c = a / b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Child_Student cs = new Child_Student();
		cs.mul(5, 4);
		cs.div(200, 10);
		cs.add(15, 10);
		cs.sub(500, 250);
		cs.display();
		
		Child_Student s1 = new Child_Student();
		s1.mul(50, 4);
		s1.div(2000, 10);
		s1.add(150, 10);
		s1.sub(50, 25);
		s1.display();

	}

}

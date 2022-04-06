package Kiran_by_jbk_Demo03;

public class Kiran_by_jbk_A3 {
	
	int id ;
	String name;
	
	void m1(int id, String name) {
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println(id);
		System.out.println(name);
	}

	public static void main(String[] args) {
		Kiran_by_jbk_A3 a3 = new Kiran_by_jbk_A3();
		a3.m1(1234,"m");
		a3.display();
	}
}

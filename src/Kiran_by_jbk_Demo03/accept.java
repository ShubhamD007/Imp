package Kiran_by_jbk_Demo03;

public class accept {

	int id;
	String name;

	void accept(int a, String b) {
		id = a;
		name = b;

	}
	void display() {
		System.out.println(id+" "+name);
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		accept a = new accept();
		accept a1 = new accept();
	a.accept(123, "Shubham");
	a1.accept(1234, "ShubhamD");
	
	a.display();
a1.display();

	}

}

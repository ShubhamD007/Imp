package Kiran_byjbk_demo06;

public class Parent_Student {

	int id = 6545;
	String name = " Shubham";
	String fathername = "Vilas";
	int dob = 15 / 01 / 1998;
	String bloodgp = "O+";
	int Datejoing = 15 / 06 / 2022;

	void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	void sub(int a, int b) {
		int c = a - b;
		System.out.println(c);
	}

	void display() {
		System.out.println("All are inheritances");
		System.out.println(id);
		System.out.println(name);
		System.out.println(fathername);
		System.out.println(dob);
		System.out.println(bloodgp);
		System.out.println(Datejoing);

	}

}

package Kiran_byjbk_demo_09;

public class Student01 {

	int id;
	String name;

	Student01() {
		System.out.println("Default Constructors");

	}

	Student01(int id, String name) {
		System.out.println("paramatrise conatructor");
		this.id = id;
		this.name = name;

	}

	void doingexam() {
		System.out.println("Doing exam right now");
	}

	public static void main(String[] args) {
		Student01 s = new Student01();
		Student01 s1 = new Student01(12,"sham");
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		

	}

}

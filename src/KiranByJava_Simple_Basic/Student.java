package KiranByJava_Simple_Basic;

public class Student {

	int id;
	String name;
	String course;
	float gp;

	void attendingsession() {
		System.out.println(name + " Attending Session ");
	}

	void dosubmission() {
		System.out.println(name + " Do Submission ");
	}

	void dopractical() {
		System.out.println(name + " Do practical ");
	}

	void dptest() {
		System.out.println(name + " Do test");
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.id = 10;
		s1.name = "Shubham";
		s1.course = "Bsc";
		s1.gp = 1.5f;

		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.course);
		System.out.println(s1.gp);
		
		s1.course ="kk";
	}

}

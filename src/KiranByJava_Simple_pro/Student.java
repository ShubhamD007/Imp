package KiranByJava_Simple_pro;

public class Student {

	int enrollno;
	String name;
	String couser;
	float percentage;

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();

		s1.enrollno = 101;
		s1.name = "Shubham";
		s1.couser = " BE";
		s1.percentage = 90.54f;

		s2.enrollno = 1010;
		s2.name = "Shubham raje";
		s2.couser = " ME";
		s2.percentage = 99.54f;

		System.out.println(s1.enrollno);
		System.out.println(s1.name);
		System.out.println(s1.couser);
		System.out.println(s1.percentage);
		
		System.out.println(s2.enrollno);
		System.out.println(s2.name);
		System.out.println(s2.couser);
		System.out.println(s2.percentage);

	}
}

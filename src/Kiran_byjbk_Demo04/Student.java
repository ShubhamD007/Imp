package Kiran_byjbk_Demo04;

import java.io.InputStream;
import java.util.Scanner;

public class Student {
	int id;
	String name;
	String course;
	float number;
	String cname;

	void accept() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the id");
		id = s.nextInt();
		System.out.println("Enter the name");
		name = s.next();
		System.out.println("Enter the course name");
		course = s.next();
		System.out.println("Enter the number");
		number = s.nextFloat();
		s.nextLine();
		System.out.println("Enter the college name");
		cname = s.next();

	}

	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(course);
		System.out.println(number);
		System.out.println(cname);
	}

}

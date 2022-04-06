package Kiran_byjbk_demo05;

import java.util.Scanner;

public class Student {
	int id;
	String name;
	String course;
	float percentage;
	String cname;
				// Constructor
	Student(){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the id");
		id = s.nextInt();
		
		System.out.println("Enter the name");
		name = s.next();
		
		System.out.println("Enter the course name");
		course = s.next();
		
		System.out.println("Enter the percentage");
		percentage = s.nextFloat();
		
		System.out.println("Enter the college name");
		cname = s.next();

	}

	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(course);
		System.out.println(percentage);
		System.out.println(cname);
	}

}

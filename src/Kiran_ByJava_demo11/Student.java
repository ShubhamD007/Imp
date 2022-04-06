package Kiran_ByJava_demo11;

public class Student {
	int x;
	int y;
	
	Student()   {
		this(10);
		System.out.println("Hello " +x +" " +y);
	}

	Student(int x) {
		this(11, 20);
		this.x = x;
		System.out.println("Good morning " +x);
	}

	Student(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		System.out.println("bye bye " +x +" " +y);
	}

}

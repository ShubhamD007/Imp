package KiranByJava_Simple_Basic;

public class A {

	int add(int n1, int n2) {
		int r = n1 + n2;
		return r;
	}
	
	void greet(){
		System.out.println("welcome to java programming");
		System.out.println("welcome to java programming 1");
		System.out.println("welcome to java programming 2");
		}


	public static void main(String[] args) {
		A a = new A(); // method calling
		int x = a.add(45, 55);
		int y = a.add(99, 2);
		int z = a.add(1212, 2121);
		
		System.out.println("Addition is :- " + x);
		System.out.println("Addition is :- " + y);
		System.out.println("Addition is :- " + z);
		
		a.greet(); // method calling 
		

	}

}

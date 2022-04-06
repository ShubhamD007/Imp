package Kiran_by_jbk_Demo03;

public class EvenandOddProgram {
	void odd(int n) { // local variable
		System.out.println("\nList of odd number");
		for (int i = 0; i < n; i++) {
			if (i % 2 != 0)
				System.out.print(" " + i);

		}

	}

	void even(int m) {
		System.out.println("\nlist of even number");
		for (int i = 0; i < m; i++) {
			if (i % 2 == 0)
				System.out.print(" " + i);
		}

	}
	
	

	void divisibleby5(int q) {
		System.out.println("\nlist of divisible number ");
		for (int i = 0; i < q; i++)
			if (i % 5 == 0)
				System.out.print(" " + i);

	}

	public static void main(String[] args) {

		EvenandOddProgram obj = new EvenandOddProgram();
		obj.odd(50);
		obj.even(51);
		obj.divisibleby5(100);

	}

}

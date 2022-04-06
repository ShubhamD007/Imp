package Kiran_byjbk_demo07;

public class Prime_NonPrime {
	public static void main(String[] args) {

		int n = 9;
		int cnt = 0;

		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {
				cnt++;
			}

			if (cnt == 2)

				System.out.println("This number is even number " +n);

			else
				System.out.println("This is not even number "+n);
		}

	}
}

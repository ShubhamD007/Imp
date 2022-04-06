package Kiran_byjbk_demo07;

public class one_morePrime {

	public static void main(String[] args) {
		for (int j = 1; j <= 100; j++) {
			int n = j;
			int cnt = 0;
			for (int i = 1; i <= n; i++) {

				if (n % i == 0) {
					cnt++;
				}
			}
			if (cnt == 2)

				System.out.println("This number is even number " +n );

			// else System.out.println("This is not even number");
		}
	}
	}



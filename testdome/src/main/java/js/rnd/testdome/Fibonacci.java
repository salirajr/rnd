package js.rnd.testdome;

import java.util.Arrays;

public class Fibonacci {

	static public int[] generate(int n) {
		int[] result = new int[n];
		result[0] = 1;
		int f0 = 0, f1 = 1, temp;
		for (int i = 1; i < n; i++) {
			result[i] = f0 + f1;
			temp = f0;
			f0 = f1;
			f1 = f1 + temp;
			System.out.println(f1);
		}
		return result;
	}

	static public int atN(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return atN(n - 1) + atN(n - 2);
	}

	public static void main(String[] args) {
		int n = 20;
		System.out.println(Arrays.toString(generate(n)));
		
		System.out.println(atN(n));
	}
}

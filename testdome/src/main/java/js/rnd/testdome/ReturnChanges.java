package js.rnd.testdome;

/**
 * Calculate possibility of return changes of 5c, 10c, 25c eg: 1 dollar, it may
 * have 10 of 10c, 20 of 5c, 4 of 25c
 * 
 * */

public class ReturnChanges {

	private final int C5 = 5;
	private final int C10 = 10;
	private final int C25 = 25;

	public int bruteForce(double dollars) {
		int cent = new Double(dollars * 100).intValue();
		int result = 0;

		for (int i = 0; i <= cent / C5; i++) {
			for (int j = 0; j <= cent / C10; j++) {
				for (int k = 0; k <= cent / C25; k++) {
					if (i * C5 + j * C10 + k * C25 == cent) {
						result++;
						System.out.println(result+"\t["+i+"]5c\t["+j+"]10c\t["+k+"]25c");
					}
				}
			}

		}
		return result;
	}

	public static void main(String[] args) {
		new ReturnChanges().bruteForce(1.2);
	}
}

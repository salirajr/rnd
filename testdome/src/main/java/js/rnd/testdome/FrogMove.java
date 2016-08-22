package js.rnd.testdome;

/**
 * A frog only moves forward, but it can move in steps 1 inch long or in jumps 2
 * inches long. A frog can cover the same distance using different combinations
 * of steps and jumps.
 * 
 * Write a function that calculates the number of different combinations a frog
 * can use to cover a given distance.
 * 
 * For example, a distance of 3 inches can be covered in three ways:
 * step-step-step, step-jump, and jump-step.
 *
 */
public class FrogMove {

	private long fac(long n) {

		long result = 1;
		if (n == 0) {
			return result;
		} else {
			for (long i = 2; i <= Math.abs(n); i++) {
				result *= i;
			}
			if (n < 0) {
				result *= -1;
			}
		}
		return result;
	}

	private long fac(long n, long nStart) {

		long result = 1;
		if (n == 0) {
			return result;
		} else {
			for (long i = nStart + 1; i <= Math.abs(n); i++) {
				result *= i;
			}
			if (n < 0) {
				result *= -1;
			}
		}
		return result;
	}

	// Permutation: n!/m!o!p!q!, with m o p q is equals values!
	public long permuateStep(long d) {
		if (d == 0)
			return 0;
		d = Math.abs(d);
		long result = 0, dJump, dStep, tStep;
		for (int i = 0; i <= new Double(Math.ceil(d / 2)).intValue(); i++) {
			dJump = (2 * i);
			dStep = (d - dJump);
			// tStep = fac(i + dStep) / (fac(i) * fac(dStep));
			tStep = fac(i + dStep, dStep) / fac(i);

			// ("jump:" + i + ", step:" + dStep + ", permutation: " + tStep);
			result += tStep;
		}
		// ("Posibility with distance of " + d + ": " + result + "\n");
		return result;
	}

	public int recursiveCalc(int step) {
		if (step <= 1)
			return 1;
		else
			return recursiveCalc(step - 1) + recursiveCalc(step - 2);
	}

}

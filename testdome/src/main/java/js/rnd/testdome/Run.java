package js.rnd.testdome;

/**
 * Write a function that finds the zero-based index of the longest run in a
 * string. A run is a consecutive sequence of the same character. If there is
 * more than one run with the same length, return the index of the first one.
 * 
 * For example, indexOfLongestRun("abbcccddddcccbba") should return 6 as the
 * longest run is dddd and it first appears on index 6.
 * */

public class Run {
	public static int indexOfLongestRun(String str) {
		int i = 1, pivot = 0, nPivot = 1, nHighestPivot = 1, highestPivot = 0;
		char currChar = str.charAt(0);
		while (i < str.length()) {
			if (str.charAt(i) == currChar) {
				nPivot++;
			} else {
				if (nHighestPivot < nPivot) {
					System.out.println("nPivot[" + nPivot
							+ "] > nHighestPivot[" + nHighestPivot
							+ "] with pivot: " + pivot);
					highestPivot = pivot;
					nHighestPivot = nPivot;
				}
				nPivot = 1;
				pivot = i;
				currChar = str.charAt(i);
			}
			i++;
		}

		return nHighestPivot < nPivot ? pivot : highestPivot;
	}

	public static void main(String[] args){
		System.out.println(indexOfLongestRun("abbcccddddcccbba"));
		System.out
				.println(indexOfLongestRun("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
		System.out
				.println(indexOfLongestRun("aaaaaaaaaaaaaaaaaaaasssssssssssssssaaaaaaaaaaaaaaaaaaaaaaaaaaassssssssssssss"));
		System.out
				.println(indexOfLongestRun("aaaaaaaaaaaaaaaaaaxccccxjsdsdsaaaaaaaaaaaaaaaaaaaaaa"));
	}
}

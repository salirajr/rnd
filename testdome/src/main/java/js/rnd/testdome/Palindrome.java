package js.rnd.testdome;

public class Palindrome {

	public boolean isValid(String word) {
		boolean result = true;
		word = word.replaceAll("[^a-zA-Z\\s]+", "").toLowerCase();
		int i = 0, nChars = word.length();
		while ( i <= (nChars - i - 1) && result) {
			System.out.println(word.charAt(i) + "[" + i + "]\t"
					+ word.charAt(nChars - i - 1) + "[" + (nChars - i - 1)
					+ "]");
			result = word.charAt(i) == word.charAt(nChars - i - 1);
			i++;
		}
		System.out.println("Palindrome().isvalid["+word+"]: "+result+"\n");
		return result;
	}
	public static void main(String[] args) {
		Palindrome pe = new Palindrome();
		System.out.println(pe.isValid("Noel sees Leon."));
	}

}

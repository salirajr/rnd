package js.rnd.testdome;

/**
 * An anagram is a word formed from another by rearranging its letters, using
 * all the original letters exactly once; for example, orchestra can be
 * rearranged into carthorse.
 * 
 * Write a function that checks if two words are anagrams of each other.
 * 
 * For example, areAnagrams("neural", "unreal") should return true as arguments
 * are anagrams of each other.
 * 
 * */

public class AreAnagrams {
	private static long count(String a, char b) {
		return a.chars().filter(ch -> ch == b).count();
	}

	public static boolean areAnagrams(String a, String b) {
		int i = 0;
		while (i < a.length() && count(a, a.charAt(i)) == count(b, a.charAt(i))) {
			i++;
		}
		return i == a.length();
	}

	public static boolean isValid(String a, String b) {
		a = a.replaceAll("[^a-zA-Z]+", "").toLowerCase();
		System.out.println();
		b = b.replaceAll("[^a-zA-Z]+", "").toLowerCase();
		if (a.length() != b.length())
			return false;
		return areAnagrams(a, b);
	}

	public static void main(String[] args) {
		System.out.println(areAnagrams("motherinlaw", "hitlerwoman"));
	}
}
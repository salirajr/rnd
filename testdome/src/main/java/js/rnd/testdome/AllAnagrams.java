package js.rnd.testdome;

/**
 * An anagram is a word formed from another by rearranging its letters, using all the original letters exactly once; 
 * for example, orchestra can be rearranged into carthorse.
 * Write a function which returns all anagrams of a given word (including the word itself) in any order.
 * For example getAllAnagrams("abba") should return collection containing "aabb", "abab", "abba", "baab", "baba", "bbaa".
 * 
 * */

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class AllAnagrams {
	public static Collection<String> getAllAnagrams(String string) {
		Set<String> result = new HashSet<String>();
		String[] temp = generate("", string).split("\\s+");
		for (String word : temp) {
			result.add(word);
		}
		System.out.println("Permutation generates: " + temp.length
				+ ", retrieve: " + result.size());
		System.out
				.println(result.toString() + " from " + Arrays.toString(temp));
		return result;
	}

	public static String generate(String prefix, String word) {
		int n = word.length();
		if (n == 0) {
			return prefix;
		} else {
			String result = "";
			for (int i = 0; i < n; i++) {
				result += generate(prefix + word.charAt(i),
						word.substring(0, i) + word.substring(i + 1, n))
						+ " ";

			}
			return result;
		}
	}

	public static void main(String[] args) {

		Collection<String> anagrams = getAllAnagrams("simple");// abba
		for (String a : anagrams)
			System.out.println(a);
	}
}
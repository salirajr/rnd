
import js.rnd.testdome.Palindrome;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TPalindrome {

    Palindrome drome;

    @Before
    public void init() {
        drome = new Palindrome();

    }

    @Test
    public void normal() {
        assertTrue(drome.isValid("abcddCba"));
        assertFalse(drome.isValid("efgfw"));
        assertTrue(drome.isValid("hijih"));
    }

    @Test
    public void negative() {
        assertTrue(drome.isValid("a"));
        assertFalse(drome.isValid("a "));
    }

}

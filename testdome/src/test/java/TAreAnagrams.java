
import js.rnd.testdome.AreAnagrams;
import org.junit.Assert;
import org.junit.Test;

public class TAreAnagrams {

    @Test
    public void normal() {
        Assert.assertTrue(AreAnagrams.areAnagrams("unreal", "neural"));
        Assert.assertTrue(AreAnagrams.areAnagrams("motherinlaw", "hitlerwoman"));
        Assert.assertTrue(AreAnagrams.areAnagrams("tommarvoloriddle", "iamlordvoldemort"));
    }

    @Test
    public void negative() {
        Assert.assertFalse(AreAnagrams.isValid("unreals", "neural"));
        Assert.assertTrue(AreAnagrams.isValid("mother in law", "hitler woman"));
        Assert.assertTrue(AreAnagrams.isValid("tom marvolo riddle", "i am lord voldemort"));
    }

}

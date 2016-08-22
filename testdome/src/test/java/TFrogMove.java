package js.rnd.testdome;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TFrogMove {

	FrogMove fmove;

	@Before
	public void init() {
		fmove = new FrogMove();
	}

	@Test
	public void normal() {
		assertTrue(fmove.permuateStep(1) == fmove.recursiveCalc(1));
		assertTrue(fmove.permuateStep(5) == fmove.recursiveCalc(5));
		assertTrue(fmove.permuateStep(12) == fmove.recursiveCalc(12));
	}

	@Test
	public void negative() {
		assertTrue(fmove.permuateStep(0) == 0);
		assertTrue(fmove.permuateStep(-1) == 1);
	}
}

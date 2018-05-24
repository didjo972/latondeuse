package fr.dmr.test;

import org.junit.Assert;
import org.junit.Test;

import fr.dmr.MainStart;

/**
 * MainStartTest
 */
public class MainStartTest {

	/**
	 * Test runMain nominal case
	 * @throws Exception
	 */
	@Test
	public void testRunMainNominal() throws Exception {
		// Entry parameters
		final String instructions = "5 5\n1 2 N\nGAGAGAGAA\n3 3 E\nAADAADADDA";

		// Call method to test
		final MainStart main = new MainStart();
		final String finalPostion = main.run(instructions);

		// Assertions
		Assert.assertEquals("1 3 N\n5 1 E", finalPostion);
		System.out.println(finalPostion);
	}

}

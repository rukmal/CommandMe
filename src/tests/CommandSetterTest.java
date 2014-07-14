package tests;

import me.rukmal.commandme.CommandSetter;
import org.junit.Assert;
import org.junit.Test;

/**
 * Testing class for all of the tests for the CommandSetter class
 *
 * @author Rukmal Weerawarana
 */
public class CommandSetterTest {
	private CommandSetter testcmd;

	public CommandSetterTest() {
		testcmd = new CommandSetter();
	}

	/**
	 * Test to check whether a command can be added using the command setter
	 */
	@Test
	public void testAddingLongCommand() {
		try {
			testcmd.setOption("f", "find", "Find a file");
		} catch (Exception e) {
			Assert.fail();
		}
	}

	/**
	 * Test to check whether a short command can be added
	 */
	@Test
	public void testAddingShortCommand() {
		try {
			testcmd.setOption("z", "find", "Find a file");
		} catch (Exception e) {
			Assert.fail();
		}
	}

	/**
	 * Test to ensure that the correct error is being thrown when a duplicate argument is added
	 */
	@Test
	public void testDuplicateCommandAddition() {
		CommandSetter cmd = new CommandSetter();
		cmd.setOption("f", "find", "Find a file");
		try {
			cmd.setOption("f", "find", "Find a file");
			Assert.fail();
		} catch (IllegalArgumentException e) {
			if (!e.getMessage().equals("Option f has already been added.")) {
				Assert.fail();
			}
		}
	}

	/**
	 * Test to ensure that command line metadata can be assigned successfully
	 */
	@Test
	public void testMetadataAssignment() {
		try {
			testcmd.setCommandMetadata("Testing this description thing out", "testcmd - the test command", "this is a simple test command", "0 on success, > 0 if error", null, null, null, "MIT", "Jul 14 2014");
		} catch (Exception e) {
			Assert.fail();
		}
	}
}
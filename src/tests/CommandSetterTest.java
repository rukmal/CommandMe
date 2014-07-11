package tests;

import me.rukmal.commandme.CommandSetter;

import static org.junit.Assert.*;

public class CommandSetterTest {
	@Test
	public void testSetOptionDuplicates() {
		CommandSetter cmd = new CommandSetter();
		cmd.setOption("f", "find", "Find a file");
	}
}
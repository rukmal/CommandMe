package tests;

import me.rukmal.commandme.CommandSetter;


public class CommandSetterTest {
	public void testSetOptionDuplicates() {
		CommandSetter cmd = new CommandSetter();
		cmd.setOption("f", "find", "Find a file");
	}
}
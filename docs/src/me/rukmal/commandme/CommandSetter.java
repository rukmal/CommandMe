package me.rukmal.commandme;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/**
 * Class to handle setting command line options for the terminal
 *
 * @author Rukmal Weerawarana
 */
public class CommandSetter {
	private List<Map<String, String>> args;

	public CommandSetter() {
		args = new ArrayList<Map<String, String>>();
	}

	public boolean setOption(String shortCommand, String longCommand, String description) {
		Map<String, String> newOption = new HashMap<String, String>();
		newOption.put("shortCommand", shortCommand);
		newOption.put("longCommand", longCommand);
		newOption.put("description", description);
		if (args.contains(newOption)) {
			System.out.println("Caught it!");
			return false;
		} else {
			return true;
		}
	}
}

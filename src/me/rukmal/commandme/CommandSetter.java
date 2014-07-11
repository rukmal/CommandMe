package me.rukmal.commandme;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/**
 * Class to handle setting terminal commands for a CLI program
 *
 * @author Rukmal Weerawarana
 */
public class CommandSetter {
	private List<Map<String, String>> args;

	public CommandSetter() {
		args = new ArrayList<Map<String, String>>();
	}

	/**
	 * Function to add a new option to the cli tool
	 * @param	shortOption	Short option (eg: 'e' or 'f')
	 * @param 	longOption	Long option (eg: 'errors' or 'file)
	 * @param 	description Short description of the option (eg: Using f searches for the file)
	 * @return				True if successfully added, false if not
	 */
	public boolean setOption(String shortOption, String longOption, String description) {
		Map<String, String> newArg = new HashMap<String, String>();
		newArg.put("shortOption", shortOption);
		newArg.put("longOption", longOption);
		newArg.put("description", description);
		for (Map<String, String> map : args) {
			if (map.equals(newArg)) {
				System.out.println("caught it!");
				return false;
			}
		}
		return true;
	}
}

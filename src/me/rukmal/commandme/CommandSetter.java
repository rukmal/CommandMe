package me.rukmal.commandme;

import com.sun.tools.internal.ws.wsdl.framework.DuplicateEntityException;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.lang.Exception;

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
	 * @param	shortOption			Short option (eg: 'e' or 'f')
	 * @param 	longOption			Long option (eg: 'errors' or 'file)
	 * @param 	description 		Short description of the option (eg: Using f searches for the file)
	 * @throws	java.lang.Exception	Thrown if the option has already been added
	 */
	public void setOption(String shortOption, String longOption, String description) throws Exception {
		Map<String, String> newArg = new HashMap<String, String>();
		newArg.put("shortOption", shortOption);
		newArg.put("longOption", longOption);
		newArg.put("description", description);
		for (Map<String, String> map : args) {
			if (map.get("shortOption").equals(shortOption)) {
				throw new Exception("Option " + shortOption + " has already been added.");
			}
		}
	}
}

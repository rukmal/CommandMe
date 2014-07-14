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
	private String description;
	private String name;
	private String synopsis;
	private String exitStatus;
	private String seeAlso;
	private String standards;
	private String history;
	private String license;
	private String creationDate;

	/**
	 * Constructor to instantiate a new CommandSetter object
	 */
	public CommandSetter() {
		args = new ArrayList<Map<String, String>>();
	}

	/**
	 * Function to add a new option to the cli tool
	 * @param	shortOption							Short option (eg: 'e' or 'f')
	 * @param 	longOption							Long option (eg: 'errors' or 'file)
	 * @param 	description 						Short description of the option (eg: Using f searches for the file)
	 * @throws	java.lang.IllegalArgumentException	Thrown if the option has already been added
	 */
	public void setOption(String shortOption, String longOption, String description) throws IllegalArgumentException {
		Map<String, String> newArg = new HashMap<String, String>();
		newArg.put("shortOption", shortOption);
		newArg.put("longOption", longOption);
		newArg.put("description", description);
		for (Map<String, String> map : args) {
			if (map.get("shortOption").equals(shortOption)) {
				throw new IllegalArgumentException("Option " + shortOption + " has already been added.");
			}
		}
		args.add(newArg);
	}

	/**
	 * Function to add a new option to the cli tool
	 * @param	shortOption					Short option (eg: 'e' or 'f')
	 * @param	description					Short description of the option (eg: Using f searches for the file)
	 * @throws	IllegalArgumentException	Thrown if the option has already been added
	 */
	public void setOption(String shortOption, String description) throws IllegalArgumentException {
		setOption(shortOption, null, description);
	}

	/**
	 * Function to set the long description of the cli tool
	 * @param	description	Long description of the cli tool
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Function to add the metadata of the cli to the Command object
	 * Note: All of the arguments are optional. 'null' should be passed
	 * in place of the argument if it is to be kept blank
	 * @param	description		Long description of the cli tool
	 * @param	name			Name and short description of the cli tool
	 * @param	synopsis		Synopsis usage of the cli tool (eg: ls [-a | -l | -h]
	 * @param	exitStatus		Exit status information about the cli tool (eg: Exits 0 on success, > 1 if error)
	 * @param	seeAlso			Any additional information that relates to the cli tool
	 * @param	standards		Standards of compliance of the cli tool (eg: IEEE Std)
	 * @param	history			History of the cli tool
	 * @param	license			License under which the cli tool is registered
	 * @param	creationDate	Creation date of the cli tool
	 */
	public void setCommandMetadata(String description, String name, String synopsis, String exitStatus, String seeAlso, String standards, String history, String license, String creationDate) {
		this.description = description;
		this.synopsis = synopsis;
		this.exitStatus = exitStatus;
		this.seeAlso = seeAlso;
		this.standards = standards;
		this.history = history;
		this.license = license;
		this.creationDate = creationDate;
	}
}

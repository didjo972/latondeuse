package fr.dmr;

import java.util.ArrayList;
import java.util.List;

/**
 * GestionInstructions
 */
public class GestionInstructions {

	/**
	 * Constructor
	 */
	public GestionInstructions() {
		
	}

	/**
	 * Parse the data
	 * @param instructions
	 * @return an instruction list
	 */
	public List<String> parse(String instructions) {
		String[] tabInstructions = instructions.split("\n");
		List<String> listInstruction = new ArrayList<>();
		for(int i=0; i<tabInstructions.length; i++) {
			listInstruction.add(tabInstructions[i]);
		}
		return listInstruction;
	}

	/**
	 * Get initial information about position
	 * @param informationPosition
	 * @return an array with position and orientation
	 */
	public String[] getInitialPosition(String informationPosition) {
		return informationPosition.split(" ");
	}

}

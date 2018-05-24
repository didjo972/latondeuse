package fr.dmr;

import java.util.List;

/**
 * MainStart
 */
public class MainStart {

	public MainStart() {

	}

	public static void main(String[] args) {
		// Entry parameters
		final String instructions = "5 5\n1 2 N\nGAGAGAGAA\n3 3 E\nAADAADADDA";

		// Call method to test
		final MainStart main = new MainStart();
		String finalPostion = "";
		try {
			finalPostion = main.run(instructions);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		System.out.println(finalPostion);
	}

	/**
	 * Run the program
	 * 
	 * @return the final positions
	 * @throws Exception
	 */
	public String run(final String instructions) throws Exception {
		/** Run the first Mower */
		String finalPosition = runMower(instructions, 1, 2) + "\n" + runMower(instructions, 3, 4);
		return finalPosition;
	}

	/**
	 * RunMower
	 * 
	 * @param instructions
	 * @return the final Position
	 * @throws Exception
	 */
	private String runMower(final String instructions, final int indexInitialPosition, final int indexInstruction)
			throws Exception {
		// Get instructions list
		final GestionInstructions gInstructions = new GestionInstructions();
		final List<String> listInstructions = gInstructions.parse(instructions);

		// Get initial position
		final String[] positions = gInstructions.getInitialPosition(listInstructions.get(indexInitialPosition));

		if (positions.length != 3) {
			throw new Exception("There some missing informations about positions");
		}

		final Mower mower = new Mower(Integer.valueOf(positions[0]), Integer.valueOf(positions[1]), positions[2]);
		mower.startMower(listInstructions.get(indexInstruction));

		final String finalPositionMower = mower.getPositionX() + " " + mower.getPositionY() + " "
				+ mower.getOrientation();
		return finalPositionMower;
	}

}

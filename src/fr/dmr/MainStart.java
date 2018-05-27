package fr.dmr;

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
		try {
			main.run(instructions);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	/**
	 * Run the program
	 * 
	 * @throws Exception
	 */
	public String run(final String instructions) throws Exception {
		StringBuilder builder = new StringBuilder();
		String[] tabInstruction = instructions.split("\n");
		int i = 1;
		while(tabInstruction.length > i) {
			String resultMower = runMower(tabInstruction[i], tabInstruction[i + 1]);
			if (i == tabInstruction.length - 2) {
				builder.append(resultMower);
			} else {
				builder.append(resultMower + "\n");
			}
			System.out.println(resultMower);
			i += 2;
		}
		return builder.toString();
	}

	/**
	 * Run mower
	 * @param initialPosition
	 * @param instructions
	 * @return the mower informations
	 */
	private String runMower(String initialPosition, String instructions) {
		// Get initial position
		final GestionInstructions gInstructions = new GestionInstructions();
		final String[] positions = gInstructions.getInitialPosition(initialPosition);
		
		// Start Mower
		final Mower mower = new Mower(Integer.valueOf(positions[0]), Integer.valueOf(positions[1]), positions[2]);
		mower.startMower(instructions);
		return mower.toString();
	}

}

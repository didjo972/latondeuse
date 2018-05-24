package fr.dmr;

/**
 * OrientationEnum
 */
public enum OrientationEnum {
	NORTH("N"), SOUTH("S"), EAST("E"), WEST("W");

	/** Name */
	private String name = "";

	// Constructor
	OrientationEnum(final String name) {
		this.name = name;
	}

	/**
	 * toString
	 */
	public String toString() {
		return name;
	}
}

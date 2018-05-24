package fr.dmr;

public enum CommandEnum {
	AVANCER('A'), DROITE('D'), GAUCHE('G');

	private char name;

	// Constructor
	CommandEnum(char name) {
		this.name = name;
	}

	public char toChar() {
		return name;
	}
}

package fr.dmr;

/**
 * Mower
 */
public class Mower {

	/** PositionX */
	private int positionX;

	/** PositionY */
	private int positionY;

	/** OrientationEnum */
	private OrientationEnum orientation;

	/**
	 * Constructor
	 * @param positionInitialX
	 * @param positionInitialY
	 * @param orientation
	 */
	public Mower(int positionInitialX, int positionInitialY, String orientation) {
		this.positionX = positionInitialX;
		this.positionY = positionInitialY;
		for (OrientationEnum value : OrientationEnum.values()) {
			if (value.toString().equals(orientation)) {
				this.orientation = value;
			}
		}
	}

	/**
	 * @return the positionX
	 */
	public int getPositionX() {
		return positionX;
	}

	/**
	 * @param positionX
	 *            the positionX to set
	 */
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	/**
	 * @return the positionY
	 */
	public int getPositionY() {
		return positionY;
	}

	/**
	 * @param positionY
	 *            the positionY to set
	 */
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	/**
	 * @return the orientation
	 */
	public OrientationEnum getOrientation() {
		return orientation;
	}

	/**
	 * @param orientation
	 *            the orientation to set
	 */
	public void setOrientation(OrientationEnum orientation) {
		this.orientation = orientation;
	}

	/**
	 * Start the mower
	 * 
	 * @param instructions
	 *            the instructions
	 */
	public void startMower(String instructions) {
		for (int i = 0; i < instructions.length(); i++) {
			switch (instructions.charAt(i)) {
			case 'A':
				moveStraight();
				break;
			case 'D':
				turnRight();
				break;
			case 'G':
				turnLeft();
				break;
			default:
				break;
			}
		}
	}

	/**
	 * Turn Left
	 */
	private void turnLeft() {
		switch (this.orientation) {
		case NORTH:
			setOrientation(OrientationEnum.WEST);
			break;
		case SOUTH:
			setOrientation(OrientationEnum.EAST);
			break;
		case EAST:
			setOrientation(OrientationEnum.NORTH);
			break;
		case WEST:
			setOrientation(OrientationEnum.SOUTH);
			break;
		default:
			break;
		}
	}

	/**
	 * Turn Right
	 */
	private void turnRight() {
		switch (this.orientation) {
		case NORTH:
			setOrientation(OrientationEnum.EAST);
			break;
		case SOUTH:
			setOrientation(OrientationEnum.WEST);
			break;
		case EAST:
			setOrientation(OrientationEnum.SOUTH);
			break;
		case WEST:
			setOrientation(OrientationEnum.NORTH);
			break;
		default:
			break;
		}
	}

	/**
	 * Move Straight
	 */
	private void moveStraight() {
		switch (this.orientation) {
		case NORTH:
			if (this.positionY < 5)
				setPositionY(this.positionY + 1);
			break;
		case SOUTH:
			if (this.positionY > 0)
				setPositionY(this.positionY - 1);
			break;
		case EAST:
			if (this.positionX < 5)
				setPositionX(this.positionX + 1);
			break;
		case WEST:
			if (this.positionX > 0)
				setPositionX(this.positionX - 1);
			break;
		default:
			break;
		}
	}
	
	@Override
	public String toString() {
		return this.positionX + " " + this.positionY + " " + this.orientation;
	}

}

/*
 * BikDS
 * September 30, 2017
 * This class implements the logic for the game by analyzing when the 
 * user wins or loses or has to keep rolling
 */

public class CrapsGame {
	private int point = 0;

	/**
	 * Calculates the result of the next dice roll in the Craps game. The parameter
	 * total is the sum of dots on two dice. point is set to the saved total, if the
	 * game continues, or 0, if the game has ended. Returns 1 if player won, -1 if
	 * player lost, 0 if player continues rolling.
	 */
	public int processRoll(int total) {
		int result;
		if (point == 0) {
			if (total == 7 || total == 11) {
				result = 1;
				return result;
			} else if (total == 2 || total == 3 || total == 12) {
				result = -1;
				return result;
			} else {
				result = 0;
				point = total;
				return result;
			}
		} else {
			if (total == point) {
				result = 1;
				point = 0; // want the saved sum to reset
				return result;
			} else if (total == 7) { // check if next rolled amount is 7
				result = -1;
				point = 0;
				return result;
			} else {
				result = 0;
				return result;
			}
		}
	}

	/**
	 * Returns the saved point
	 */
	public int getPoint() {
		return point;
	}
}

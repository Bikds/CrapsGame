
/*
 * BikDS
 * Septermber 27, 2017
 * This class simulates the roll of one die using the Random class
 */
import java.util.Random;

public class Die {
	private int value;
	Random rand = new Random();

	/*
	 * Simulates a dice roll
	 */
	public void roll() {
		value = 1 + rand.nextInt(6);
	}
	/*
	 * returns the simulated roll
	 */
	public int getNumDots() {
		return value;
	}

}

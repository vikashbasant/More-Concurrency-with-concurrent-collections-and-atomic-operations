package in.co.decimal.concurrency;

public class BiCounter {
	private int i = 0;
	private int j = 0;

	synchronized void incrementI() {
		i++;
		// get i
		// increment
		// set i

	}

	/**
	 * @return the i
	 */
	public int getI() {
		return i;
	}

	synchronized void incrementJ() {
		j++;
		// get j
		// increment
		// set j

	}

	/**
	 * @return the j
	 */
	public int getJ() {
		return j;
	}

}

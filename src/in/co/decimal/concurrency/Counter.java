package in.co.decimal.concurrency;

public class Counter {
	private int i = 0;

	synchronized void increment() {
		i++;
		// here i++ look like simple operations:
		// but actually it involve 3 operations:
		/**
		 * 1. get the value of i 
		 * 2. then increment 
		 * 3. finally set the value of i
		 */
	}

	/**
	 * @return the i
	 */
	public int getI() {
		return i;
	}

	/**
	 * @param i the i to set
	 */
	public void setI(int i) {
		this.i = i;
	}
}

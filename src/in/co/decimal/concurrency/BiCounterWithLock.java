package in.co.decimal.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
	private int i = 0;
	private int j = 0;

	// Now Implementing the lock:
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();

	void incrementI() {
		// Get Lock for I:
		lockForI.lock();
		i++;
		// Release Lock for I:
		lockForI.unlock();

	}

	/**
	 * @return the i
	 */
	public int getI() {
		return i;
	}

	void incrementJ() {
		// Get Lock for J:
		lockForJ.lock();
		j++;
		// Release Lock for J:
		lockForJ.unlock();

	}

	/**
	 * @return the j
	 */
	public int getJ() {
		return j;
	}

}

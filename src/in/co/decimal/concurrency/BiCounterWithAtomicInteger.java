package in.co.decimal.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterWithAtomicInteger {
	private AtomicInteger i = new AtomicInteger();
	private AtomicInteger j = new AtomicInteger();



	void incrementI() {

		i.incrementAndGet();

	}

	/**
	 * @return the i
	 */
	public int getI() {
		return i.get();
	}

	void incrementJ() {

		j.incrementAndGet();

	}

	/**
	 * @return the j
	 */
	public int getJ() {
		return j.get();
	}

}

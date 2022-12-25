package in.co.decimal.concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteListRunner {

	// add - copy
	// get

	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();

		// Thread insert -3
		// copyOnWriteList does is only synchronized the add operation:
		list.add("Ant");
		list.add("Bat");
		list.add("Cat");

		// Thread get - 10000
		// copyOnWriteList does not synchronized the get operation:
		for (String element : list) {
			System.out.println(element);
		}
	}
}

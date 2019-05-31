package lesson5.labs.prob4;

public class Item {
	String name;
	Item(String name) {        // deliberate package visibility
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return name;
	}
}

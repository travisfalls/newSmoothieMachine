package org.elevenfifty.smoothie.fruit;

public final class Strawberry extends Berry implements Cutable {

	boolean cut;
	
	public Strawberry() {
		super("Strawberry", "Red");
	}
	
	@Override
	public void cut() {
		if (!cut) {
			cut = true;
			System.out.println("Cut an " + getName());
		}

	}

	@Override
	public boolean isCut() {
		return cut;
	}
}

package org.elevenfifty.smoothie.fruit;

public class Peach extends Citrus implements Pittable, Cutable, Washable, Addable {

	boolean cut;
	boolean washed;
	boolean pitted;
	boolean added;

	public Peach() {
		super("Peach");
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

	@Override
	public void wash() {
		if (!washed) {
			washed = true;
			System.out.println("Wash an " + getName());
		}
	}

	@Override
	public boolean isWashed() {
		return washed;
	}

	@Override
	public void pit() {
		if (!pitted) {
			pitted = true;
			System.out.println("Pit an " + getName());
		}
	}

	@Override
	public boolean isPitted() {
		return pitted;
	}
	
	@Override
	public void add() {
		if (!added) {
			added = true;
			System.out.println("Add the " + getName());
		}
	}

	@Override
	public boolean isAdded() {
		return added;
	}

}

package org.elevenfifty.smoothie.fruit;

public class Mango extends Citrus implements Pittable, Cutable, Peelable, Addable {

	boolean cut;
	boolean peeled;
	boolean pitted;
	boolean added;

	public Mango() {
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
	public void peel() {
		if (!peeled) {
			peeled = true;
			System.out.println("Peel an " + getName());
		}
	}

	@Override
	public boolean isPeeled() {
		return peeled;
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

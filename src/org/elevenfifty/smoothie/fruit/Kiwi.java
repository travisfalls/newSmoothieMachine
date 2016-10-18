package org.elevenfifty.smoothie.fruit;

public class Kiwi extends Fruit implements Peelable, Cutable, Addable {
	boolean peeled;
	boolean cut;
	boolean added;

	public Kiwi() {
		super("Kiwi");
	}

	@Override
	public void peel() {
		if (!peeled) {
			peeled = true;
			System.out.println("Peeled a " + getName());
		} else {
			System.out.println("Already peeled!");
		}
	}

	@Override
	public boolean isPeeled() {
		return peeled;
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
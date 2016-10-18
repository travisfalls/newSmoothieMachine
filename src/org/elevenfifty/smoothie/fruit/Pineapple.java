package org.elevenfifty.smoothie.fruit;

public final class Pineapple extends Fruit implements Coreable, Cutable, Addable {

	boolean cored;
	boolean cut;
	boolean added;

	public Pineapple() {
		super("Pineapple");
	}

	@Override
	public void core() {
		if (!cored) {
			cored = true;
			System.out.println("Cored an " + getName());
		}
	}

	@Override
	public boolean isCored() {
		return cored;
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

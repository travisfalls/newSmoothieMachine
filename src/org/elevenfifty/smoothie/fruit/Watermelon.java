package org.elevenfifty.smoothie.fruit;

public class Watermelon extends Fruit implements Cutable, Addable {
	
	boolean cut;
	boolean added;

	public Watermelon() {
		super("Watermelon");
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

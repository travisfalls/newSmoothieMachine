package org.elevenfifty.smoothie.fruit;

public final class Strawberry extends Fruit implements Cutable, Washable, Addable {

	boolean cut;
	boolean added;
	boolean washed;
	
	public Strawberry() {
		super("Strawberry");
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

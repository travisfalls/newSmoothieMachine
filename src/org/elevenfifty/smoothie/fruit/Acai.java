package org.elevenfifty.smoothie.fruit;

public class Acai extends Fruit implements Washable, Addable{
	
	boolean washed;
	boolean added;

	public Acai() {
		super("Acai");
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
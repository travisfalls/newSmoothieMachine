package org.elevenfifty.smoothie.fruit;

public final class Pineapple extends Fruit implements Coreable, Cutable {

	boolean cored;
	boolean cut;

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

}

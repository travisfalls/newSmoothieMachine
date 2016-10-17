package org.elevenfifty.smoothie.fruit;

public class Watermelon extends Fruit implements Cutable {
	
	boolean cut;

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

}

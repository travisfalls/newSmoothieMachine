package org.elevenfifty.smoothie.fruit;

public final class Apple extends Fruit implements Coreable, Peelable, Cutable {

	boolean cored;
	boolean peeled;
	boolean cut;

	public Apple() {
		super("Apple");
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

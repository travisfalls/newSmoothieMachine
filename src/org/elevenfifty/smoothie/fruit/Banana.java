package org.elevenfifty.smoothie.fruit;

public class Banana extends Fruit implements Peelable, Cutable {
	boolean peeled;
	boolean cut;

	public Banana() {
		super("Banana");
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
}
package org.elevenfifty.smoothie.fruit;

public class Orange extends Citrus implements Peelable, Cutable {

	boolean peeled;
	boolean cut;

	public Orange() {
		super("Orange");
		setColor("Orange");
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

package org.elevenfifty.smoothie.fruit;

public class Lemon extends Fruit implements Cutable, Juiceable, Addable {
	int juiciness;
	boolean cut;
	boolean juiced;
	boolean added;

	public Lemon() {
		super("Lemon");
	}

	/**
	 * Sets juciness on a scale from 1 - 100. Values larger than 100 are reduced
	 * to 100 and values lower than 1 are increased to 1.
	 * 
	 * @param juciness
	 */
	public void setJuiciness(int juciness) {
		if (juciness > 100)
			this.juiciness = 100;
		else if (juciness < 1)
			this.juiciness = 1;
		else
			this.juiciness = juciness;
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
	public void juice() {
		if (!juiced) {
			juiced = true;
			System.out.println("Juice an " + getName());
		}
	}

	@Override
	public boolean isJuiced() {
		return juiced;
	}
	
	@Override
	public void add() {
		if (!added) {
			added = true;
			System.out.println("Add the " + getName() + " juice.");
		}
	}

	@Override
	public boolean isAdded() {
		return added;
	}
	
}

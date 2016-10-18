package org.elevenfifty.smoothie.vegetable;

import org.elevenfifty.smoothie.Ingredient;
import org.elevenfifty.smoothie.fruit.Addable;
import org.elevenfifty.smoothie.fruit.Cutable;
import org.elevenfifty.smoothie.fruit.Washable;

public final class Kale extends Vegetable implements Cutable, Washable, Addable, Ingredient {

	boolean cut;
	boolean added;
	boolean washed;
	
	public Kale() {
		super("Kale");
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

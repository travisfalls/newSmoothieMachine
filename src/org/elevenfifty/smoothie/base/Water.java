package org.elevenfifty.smoothie.base;

import org.elevenfifty.smoothie.Ingredient;
import org.elevenfifty.smoothie.fruit.Addable;

public class Water extends Base implements Ingredient, Addable {

	boolean added;
	
	public Water() {
		super("Water");
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

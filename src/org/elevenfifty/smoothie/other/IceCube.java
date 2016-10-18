package org.elevenfifty.smoothie.other;

import org.elevenfifty.smoothie.Ingredient;
import org.elevenfifty.smoothie.fruit.Addable;

public class IceCube implements Ingredient, Addable {

	boolean added;
	
	@Override
	public String getName() {
		return "Ice Cubes";
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

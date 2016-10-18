package org.elevenfifty.smoothie.other;

import org.elevenfifty.smoothie.Ingredient;
import org.elevenfifty.smoothie.fruit.Addable;

public class Yogurt implements Ingredient, Addable {

	boolean added;
	
	@Override
	public String getName() {
		return "Yogurt";
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

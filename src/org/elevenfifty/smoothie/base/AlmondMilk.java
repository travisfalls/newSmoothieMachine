package org.elevenfifty.smoothie.base;

import org.elevenfifty.smoothie.Ingredient;
import org.elevenfifty.smoothie.fruit.Addable;

public class AlmondMilk extends Base implements Ingredient, Addable {

	boolean added;
	
	public AlmondMilk() {
		super("Almond Milk");
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

package org.elevenfifty.smoothie;

import static org.apache.commons.lang3.StringUtils.equalsIgnoreCase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;
import org.elevenfifty.smoothie.base.Milk;
import org.elevenfifty.smoothie.fruit.Banana;
import org.elevenfifty.smoothie.fruit.Orange;
import org.elevenfifty.smoothie.fruit.Pineapple;
import org.elevenfifty.smoothie.fruit.Strawberry;
import org.elevenfifty.smoothie.other.AppleJuice;
import org.elevenfifty.smoothie.other.IceCube;
import org.elevenfifty.smoothie.other.Rum;

public class ReadRecipes {

	public static void main(String[] args) {
		ReadRecipes readRecipes = new ReadRecipes();

		final Collection<Recipe> recipes = readRecipes.loadRecipes("recipes.csv");

		recipes.stream().forEach(ingredient -> System.out.println(ingredient));
	}

	public Collection<Recipe> loadRecipes(String filename) {
		final File recipeFile = new File(filename);
		final Collection<Recipe> recipes = new ArrayList<>();

		final InputStream recipeStream;
		try {
			recipeStream = new FileInputStream(recipeFile);
		} catch (FileNotFoundException e) {
			System.out.println("Couldn't find the file: " + recipeFile.getAbsolutePath());
			return recipes;
		}

		try (Scanner input = new Scanner(recipeStream)) {
			while (input.hasNextLine()) {
				String[] items = input.nextLine().split(",");
				recipes.add(buildRecipe(items));
			}
		}
		return recipes;
	}

	public Recipe buildRecipe(String[] items) {
		Recipe recipe = new Recipe(items[0]);

		for (int i = 1; i < items.length; i++) {
			recipe.addIngredient(createIngredient(items[i]));
		}

		return recipe;
	}

	public Ingredient createIngredient(String ingredientName) {
		if (equalsIgnoreCase("Banana", ingredientName)) {
			return new Banana();
		} else if ("Strawberry".equalsIgnoreCase(ingredientName)) {
			return new Strawberry();
		} else if("Rum".equalsIgnoreCase(ingredientName)) {
			return new Rum();
		} else if("Orange".equalsIgnoreCase(ingredientName)){
			return new Orange();
		} else if("Pineapple".equalsIgnoreCase(ingredientName)){
			return new Pineapple();
		} else if("AppleJuice".equalsIgnoreCase(ingredientName)){
			return new AppleJuice();
		} else if ("IceCubes".equalsIgnoreCase(ingredientName)){
			return new IceCube();
		} else if ("Milk".equalsIgnoreCase(ingredientName)){
			return new Milk();
		}
//
//		switch (fruitName.toLowerCase()) {
//		case "banana": //NOTE: This is lower case!
//			return new Banana();
//		case "strawberry":
//			return new Strawberry();
//		}
//		// ADVANCED OPTION (Cannot 100% implement here)
//		new HashMap<String, Fruit>();
//		return fruitMap.get(fruitName.toLowerCase());

		return null;
	}

}

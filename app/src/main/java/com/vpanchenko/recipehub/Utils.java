package com.vpanchenko.recipehub;

import java.util.ArrayList;

public class Utils {

    private static Utils instance; // static instance of this singelton class

    private static ArrayList<RecipeModel> allRecipes;

    private static ArrayList<RecipeModel> hotDishes;

    private static ArrayList<RecipeModel> deserts;

    private static ArrayList<RecipeModel> favorites;

    private Utils() { // constructor
        if(null == allRecipes) {
            allRecipes = new ArrayList<>();
            initData();
        }

        if(null == hotDishes) {
            hotDishes = new ArrayList<>();
        }

        if(null == deserts) {
            deserts = new ArrayList<>();
        }

        if(null == favorites) {
            favorites = new ArrayList<>();
        }
    }

    private void initData() {
        allRecipes.add(new RecipeModel(1,
                "Borscht",
                "Borscht description",
                "ingridients",
                "how to cook borscht soup",
                "https://www.gutekueche.at/img/rezept/13978/borschtsch-leicht-gemacht.jpg"));
        allRecipes.add(new RecipeModel(2,
                "Ananas",
                "Ananas description",
                "Ananas ingridients",
                "how to cook ananas",
                "https://cdn.webshopapp.com/shops/47345/files/278239177/image.jpg"));
    }

    public static Utils getInstance() { // getter
        if (null != instance) {
            return instance;
        }else {
            instance = new Utils();
            return instance;
        }
    }

    public static ArrayList<RecipeModel> getAllRecipes() {
        return allRecipes;
    }

    public static ArrayList<RecipeModel> getHotDishes() {
        return hotDishes;
    }

    public static ArrayList<RecipeModel> getDeserts() {
        return deserts;
    }

    public static ArrayList<RecipeModel> getFavorites() {
        return favorites;
    }

    public RecipeModel getRecipeById(int id) {
        for (RecipeModel r: allRecipes) {
            if (r.getId() == id) {
                return r;
            }
        }
        return null; // TODO: 1:10 - if I didn't find a recipe with id - returns null
    }

    public boolean addToHotDishes(RecipeModel recipe) {
        return hotDishes.add(recipe);
    }
}

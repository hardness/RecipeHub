package com.vpanchenko.recipehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class RecipeActivity extends AppCompatActivity {

    public static final String RECIPE_ID_KEY = "recipeId";

    private TextView txtDishName, txtEdit, txtIngridients, txtHowToCook, txtUrl, txtDescription;
    private Button btnAddHotDishes, btnAddSalads, btnAddDeserts, btnAddFavorites;
    private ImageView imgDish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        initViews();

//        TODO: (1:12:45) commented cause Intent logic implementeted below
//        String howToCook = "Fill a large pot halfway with water(about 2 quarts), and bring to a boil. " +
//                "Add the sausage, and cover the pot. Return to a boil. Add the beets, and cook until" +
////                "\n" +
//                "they have lost their color. Add the carrots and potatoes, and cook until tender," +
//                " about 15 minutes. Add the cabbage, and the can of diced tomatoes.";
//
//        RecipeModel recipe = new RecipeModel(
//                1,
//                "Borscht",
//                "description",
//                "ingridients",
//                howToCook,
//                "https://www.gutekueche.at/img/rezept/13978/borschtsch-leicht-gemacht.jpg");

        Intent intent = getIntent();
        if (null != intent) { // all checkings needed to prevent some incedents during working app
            int recipeId = intent.getIntExtra(RECIPE_ID_KEY, -1);
            if (recipeId != -1) {
                RecipeModel incomingRecipe = Utils.getInstance().getRecipeById(recipeId);
                if (null != incomingRecipe) {
                    setData(incomingRecipe);
                }
            }
        }

//        setData(recipe); //TODO: moved to if statement above (1:11:00 or 1:12:00)
    }

    private void setData(RecipeModel recipe) {
        txtDishName.setText(recipe.getName());
        txtHowToCook.setText(recipe.getHowToCook());
        txtIngridients.setText(recipe.getIngredients());
        Glide.with(this)
                .asBitmap().load(recipe.getPhoto())
                .into(imgDish);

    }

    private void initViews() {
        txtDishName = findViewById(R.id.txtDishName);
        txtEdit = findViewById(R.id.txtEdit);
        txtIngridients = findViewById(R.id.txtIngridients);
        txtHowToCook = findViewById(R.id.txtHowToCook);
        txtUrl = findViewById(R.id.txtUrl);
        txtDescription = findViewById(R.id.txtDescription);

        btnAddHotDishes = findViewById(R.id.btnAddHotDishes);
        btnAddSalads = findViewById(R.id.btnAddSalads);
        btnAddDeserts = findViewById(R.id.btnAddDeserts);
        btnAddFavorites = findViewById(R.id.btnAddFavorites);

        imgDish = findViewById(R.id.imgDish);
    }
}

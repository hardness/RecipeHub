package com.vpanchenko.recipehub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class RecipeActivity extends AppCompatActivity {

    private TextView txtDishName, txtEdit, txtIngridients, txtHowToCook, txtUrl, txtDescription;
    private Button btnAddHotDishes, btnAddSalads, btnAddDeserts, btnAddFavorites;
    private ImageView imgDish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        initViews();

        RecipeModel recipe = new RecipeModel(
                1,
                "Borscht",
                "description",
                "ingridients",
                "how to cook borscht soup",
                "https://www.gutekueche.at/img/rezept/13978/borschtsch-leicht-gemacht.jpg");
        setData(recipe);
    }

    private void setData(RecipeModel recipe) {
        txtDishName.setText(recipe.getName());
        txtHowToCook.setText(recipe.getHowToCook());
        txtIngridients.setText(recipe.getIngredients());
        Glide.with(this)
                .asBitmap().load(recipe.getPhoto())
                .into(imgDish);

    }

    private void initViews () {
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

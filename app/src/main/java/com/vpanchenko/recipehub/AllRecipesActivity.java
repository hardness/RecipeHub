package com.vpanchenko.recipehub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AllRecipesActivity extends AppCompatActivity {

    private RecyclerView articlesRecView;
    private RecipesRecViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_articles);

        adapter = new RecipesRecViewAdapter(this);
        articlesRecView = findViewById(R.id.articlesRecView);

        articlesRecView.setAdapter(adapter);
//        articlesRecView.setLayoutManager(new GridLayoutManager(this, 2)); //TODO 23:01
        articlesRecView.setLayoutManager(new LinearLayoutManager(this));

//        ArrayList<RecipeModel> recipes = new ArrayList<>(); // TODO: 59:25 - moved to Utils class inside initData method
//        recipes.add(new RecipeModel(1,
//                "Borscht",
//                "Borscht description",
//                "ingridients",
//                "how to cook borscht soup",
//                "https://www.gutekueche.at/img/rezept/13978/borschtsch-leicht-gemacht.jpg"));
//        recipes.add(new RecipeModel(2,
//                "Ananas",
//                "Ananas description",
//                "Ananas ingridients",
//                "how to cook ananas",
//                "https://cdn.webshopapp.com/shops/47345/files/278239177/image.jpg"));
        adapter.setRecipes(Utils.getInstance().getAllRecipes()); // TODO: added 1.00 - we call a getter from a singelton instance
    }
}

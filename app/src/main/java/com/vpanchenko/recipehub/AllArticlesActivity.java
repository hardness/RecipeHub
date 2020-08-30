package com.vpanchenko.recipehub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AllArticlesActivity extends AppCompatActivity {

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

        ArrayList<Recipe> recipes = new ArrayList<>();
        recipes.add(new Recipe(1,
                "Borscht",
                "ingridients",
                "how to cook borscht soup",
                "https://www.youtube.com/watch?v=6CXgPVw_-0g",
                "some photo"));
        adapter.setRecipes(recipes);
    }
}

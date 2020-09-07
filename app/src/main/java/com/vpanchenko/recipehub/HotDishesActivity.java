package com.vpanchenko.recipehub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class HotDishesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_dishes);

        RecyclerView recyclerView = findViewById(R.id.hotDishesRecView);
        RecipesRecViewAdapter adapter = new RecipesRecViewAdapter(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

//        adapter.setRecipes(Utils.getInstance().getHotDishes()); // full form
        adapter.setRecipes(Utils.getHotDishes()); //potential bug: if no Instance- null will be returned


        }
}

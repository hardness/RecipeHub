package com.vpanchenko.recipehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAllRecipes, btnHotDishes, btnSalads, btnDeserts, btnFavorites, btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        btnAllRecipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllRecipesActivity.class);
                startActivity(intent);
            }
        });

        btnHotDishes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HotDishesActivity.class);
                startActivity(intent);
            }
        });

        Utils.getInstance(); //TODO: 1:27:00 - initialise instance here to prevent some nullPointer issues
    }

    private void initViews() {
        btnAllRecipes = findViewById(R.id.btnAllRecipes);
        btnHotDishes = findViewById(R.id.btnHotDishes);
        btnSalads = findViewById(R.id.btnSalads);
        btnDeserts = findViewById(R.id.btnDeserts);
        btnFavorites = findViewById(R.id.btnFavorites);
        btnAbout = findViewById(R.id.btnAbout);
    }
}

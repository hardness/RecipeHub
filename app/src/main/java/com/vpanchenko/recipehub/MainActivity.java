package com.vpanchenko.recipehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAllArticles, btnHotDishes, btnSalads, btnDeserts, btnFavorites, btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initVies();

        btnAllArticles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllArticlesActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initVies() {
        btnAllArticles = findViewById(R.id.btnAllArticles);
        btnHotDishes = findViewById(R.id.btnHotDishes);
        btnSalads = findViewById(R.id.btnSalads);
        btnDeserts = findViewById(R.id.btnDeserts);
        btnFavorites = findViewById(R.id.btnFavorites);
        btnAbout = findViewById(R.id.btnAbout);
    }
}

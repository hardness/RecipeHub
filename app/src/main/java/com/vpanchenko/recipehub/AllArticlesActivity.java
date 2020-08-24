package com.vpanchenko.recipehub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class AllArticlesActivity extends AppCompatActivity {

    private RecyclerView articlesRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_articles);

        articlesRecView = findViewById(R.id.articlesRecView);
    }
}

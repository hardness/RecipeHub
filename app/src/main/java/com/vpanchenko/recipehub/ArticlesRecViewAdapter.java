package com.vpanchenko.recipehub;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ArticlesRecViewAdapter extends RecyclerView.Adapter<ArticlesRecViewAdapter.ViewHolder> {

    private ArrayList<Recipe> articles = new ArrayList<>();
    private Context mContext;

    public ArticlesRecViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { //we have to create an instance of ViewHolder and return it
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_all_articles,  parent, false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() { // returns the size of items(size of list) in our Recycle View
        return articles.size();
    }

    public void setArticles(ArrayList<Recipe> articles) {
        this.articles = articles;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private CardView parent;
        private ImageView imgArticle;
        private TextView txtDishName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            parent = itemView.findViewById(R.id.parent);
            imgArticle = itemView.findViewById(R.id.imgArticle);
            txtDishName = itemView.findViewById(R.id.txtDishName);
        }
    }
}

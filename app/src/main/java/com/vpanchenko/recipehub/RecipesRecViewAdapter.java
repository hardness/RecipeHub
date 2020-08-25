package com.vpanchenko.recipehub;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecipesRecViewAdapter extends RecyclerView.Adapter<RecipesRecViewAdapter.ViewHolder> {

    private static final String TAG = "RecipesRecViewAdapter"; //TODO: shortcut is logt (time 12:49)

    private ArrayList<Recipe> recipes = new ArrayList<>();
    private Context mContext;

    public RecipesRecViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { //we have to create an instance of ViewHolder and return it
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_article, parent, false);
//        ViewHolder holder = new ViewHolder(view);
//        return holder;
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: "); //TODO: shortcut is logd (time 13:05)
        holder.txtDishName.setText(recipes.get(position).getName());
    }

    @Override
    public int getItemCount() { // returns the size of items(size of list) in our Recycle View
        return recipes.size();
    }

    public void setRecipes(ArrayList<Recipe> recipes) {
        this.recipes = recipes;
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

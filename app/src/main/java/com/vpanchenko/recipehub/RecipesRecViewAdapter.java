package com.vpanchenko.recipehub;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

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
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: "); //TODO: shortcut is logd (time 13:05)
        holder.txtDishName.setText(recipes.get(position).getName());
        Glide.with(mContext)
                .asBitmap()
                .load(recipes.get(position).getUrl())
                .into(holder.imgArticle);

        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, recipes.get(position).getName() + " selected", Toast.LENGTH_SHORT).show();
            }
        });
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

        private ImageView downArrow, upArrow;
        private RelativeLayout expandedRelLayout;
        private TextView rcpDescription, rcpDetails;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            parent = itemView.findViewById(R.id.parent);
            imgArticle = itemView.findViewById(R.id.imgArticle);
            txtDishName = itemView.findViewById(R.id.txtDishName);

            downArrow = itemView.findViewById(R.id.btnDownArrow);
            upArrow = itemView.findViewById(R.id.btnUpArrow);
            expandedRelLayout = itemView.findViewById(R.id.expandedRelLayout);
            rcpDescription = itemView.findViewById(R.id.rcpDescription);
            rcpDetails = itemView.findViewById(R.id.rcpDetails);
        }
    }
}

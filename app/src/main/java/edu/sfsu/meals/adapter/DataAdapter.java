package edu.sfsu.meals.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import edu.sfsu.meals.R;
import edu.sfsu.meals.model.DataModel;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    static Context context;
    private final ArrayList<DataModel> model;
    public DataAdapter(ArrayList<DataModel> model) {
        this.model = model;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView strId;
        TextView strMeal;
        TextView strCategory;
        ImageView imageView;
        RecyclerView recyclerView;
        public ViewHolder(@NonNull View view) {
            super(view);

            this.strId = view.findViewById(R.id.idMeal);
            this.strMeal = view.findViewById(R.id.strMeal);
            this.strCategory = view.findViewById(R.id.strCategory);
            this.imageView = view.findViewById(R.id.theImageView);
            this.recyclerView = view.findViewById(R.id.recyclerView);

            // context = view.getContext();
        }
    }

    @NonNull
    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        return new ViewHolder(view);
    }
    private int imageWidth, imageHeight;
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        imageHeight = 300;
        imageWidth = holder.imageView.getWidth();
        DataModel mod = model.get(position);
        holder.strId.setText(String.format("%s", mod.getIdMeal()));
        holder.strMeal.setText(String.format("%s", mod.getStrMeal()));
        holder.strCategory.setText(String.format("%s", mod.getStrCategory()));
        Picasso.get().load(Uri.parse(model.get(position).getStrMealThumb())).resize(imageWidth, imageHeight).centerCrop().into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return model.size();
    }
}
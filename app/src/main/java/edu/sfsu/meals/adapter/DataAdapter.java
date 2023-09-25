package edu.sfsu.meals.adapter;

import android.content.Context;
import android.content.Intent;
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
import edu.sfsu.meals.activity.DetailActivity;
import edu.sfsu.meals.model.DataModel;

import static edu.sfsu.meals.activity.DetailActivity.EXTRA_ID;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_MEAL;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_DRINK_ALTERNATE;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_CATEGORY;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_AREA;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_INSTRUCTIONS;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_MEAL_THUMB;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_TAGS;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_YOUTUBE;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_INGREDIENT1;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_INGREDIENT2;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_INGREDIENT3;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_INGREDIENT4;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_INGREDIENT5;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_INGREDIENT6;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_INGREDIENT7;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_INGREDIENT8;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_INGREDIENT9;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_INGREDIENT10;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_INGREDIENT11;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_INGREDIENT12;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_INGREDIENT13;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_INGREDIENT14;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_INGREDIENT15;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_INGREDIENT16;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_INGREDIENT17;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_INGREDIENT18;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_INGREDIENT19;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_INGREDIENT20;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_MEASURE1;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_MEASURE2;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_MEASURE3;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_MEASURE4;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_MEASURE5;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_MEASURE6;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_MEASURE7;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_MEASURE8;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_MEASURE9;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_MEASURE10;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_MEASURE11;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_MEASURE12;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_MEASURE13;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_MEASURE14;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_MEASURE15;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_MEASURE16;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_MEASURE17;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_MEASURE18;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_MEASURE19;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_MEASURE20;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_SOURCE;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_IMAGE_SOURCE;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_CREATIVE_COMMONS_CONFIRMED;
import static edu.sfsu.meals.activity.DetailActivity.EXTRA_DATE_MODIFIED;

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

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, DetailActivity.class);

                intent.putExtra(EXTRA_ID, mod.getIdMeal());
                intent.putExtra(EXTRA_MEAL, mod.getStrMeal());
                intent.putExtra(EXTRA_DRINK_ALTERNATE, mod.getStrDrinkAlternate());
                intent.putExtra(EXTRA_CATEGORY, mod.getStrDrinkAlternate());
                intent.putExtra(EXTRA_AREA, mod.getStrDrinkAlternate());
                intent.putExtra(EXTRA_INSTRUCTIONS, mod.getStrCategory());
                intent.putExtra(EXTRA_MEAL_THUMB, mod.getStrCategory());
                intent.putExtra(EXTRA_TAGS, mod.getStrCategory());
                intent.putExtra(EXTRA_YOUTUBE, mod.getStrYoutube());
                intent.putExtra(EXTRA_INGREDIENT1, mod.getStrIngredient1());
                intent.putExtra(EXTRA_INGREDIENT2, mod.getStrIngredient2());
                intent.putExtra(EXTRA_INGREDIENT3, mod.getStrIngredient3());
                intent.putExtra(EXTRA_INGREDIENT4, mod.getStrIngredient4());
                intent.putExtra(EXTRA_INGREDIENT5, mod.getStrIngredient5());
                intent.putExtra(EXTRA_INGREDIENT6, mod.getStrIngredient6());
                intent.putExtra(EXTRA_INGREDIENT7, mod.getStrIngredient7());
                intent.putExtra(EXTRA_INGREDIENT8, mod.getStrIngredient8());
                intent.putExtra(EXTRA_INGREDIENT9, mod.getStrIngredient9());
                intent.putExtra(EXTRA_INGREDIENT10, mod.getStrIngredient10());
                intent.putExtra(EXTRA_INGREDIENT11, mod.getStrIngredient11());
                intent.putExtra(EXTRA_INGREDIENT12, mod.getStrIngredient12());
                intent.putExtra(EXTRA_INGREDIENT13, mod.getStrIngredient13());
                intent.putExtra(EXTRA_INGREDIENT14, mod.getStrIngredient14());
                intent.putExtra(EXTRA_INGREDIENT15, mod.getStrIngredient15());
                intent.putExtra(EXTRA_INGREDIENT16, mod.getStrIngredient16());
                intent.putExtra(EXTRA_INGREDIENT17, mod.getStrIngredient17());
                intent.putExtra(EXTRA_INGREDIENT18, mod.getStrIngredient18());
                intent.putExtra(EXTRA_INGREDIENT19, mod.getStrIngredient19());
                intent.putExtra(EXTRA_INGREDIENT20, mod.getStrIngredient20());
                intent.putExtra(EXTRA_MEASURE1, mod.getStrMeasure1());
                intent.putExtra(EXTRA_MEASURE2, mod.getStrMeasure2());
                intent.putExtra(EXTRA_MEASURE3, mod.getStrMeasure3());
                intent.putExtra(EXTRA_MEASURE4, mod.getStrMeasure4());
                intent.putExtra(EXTRA_MEASURE5, mod.getStrMeasure5());
                intent.putExtra(EXTRA_MEASURE6, mod.getStrMeasure6());
                intent.putExtra(EXTRA_MEASURE7, mod.getStrMeasure7());
                intent.putExtra(EXTRA_MEASURE8, mod.getStrMeasure8());
                intent.putExtra(EXTRA_MEASURE9, mod.getStrMeasure9());
                intent.putExtra(EXTRA_MEASURE10, mod.getStrMeasure10());
                intent.putExtra(EXTRA_MEASURE11, mod.getStrMeasure11());
                intent.putExtra(EXTRA_MEASURE12, mod.getStrMeasure12());
                intent.putExtra(EXTRA_MEASURE13, mod.getStrMeasure13());
                intent.putExtra(EXTRA_MEASURE14, mod.getStrMeasure14());
                intent.putExtra(EXTRA_MEASURE15, mod.getStrMeasure15());
                intent.putExtra(EXTRA_MEASURE16, mod.getStrMeasure16());
                intent.putExtra(EXTRA_MEASURE17, mod.getStrMeasure17());
                intent.putExtra(EXTRA_MEASURE18, mod.getStrMeasure18());
                intent.putExtra(EXTRA_MEASURE19, mod.getStrMeasure19());
                intent.putExtra(EXTRA_MEASURE20, mod.getStrMeasure20());
                intent.putExtra(EXTRA_SOURCE, mod.getStrSource());
                intent.putExtra(EXTRA_IMAGE_SOURCE, mod.getStrImageSource());
                intent.putExtra(EXTRA_CATEGORY, mod.getStrCreativeCommonsConfirmed());
                intent.putExtra(EXTRA_DATE_MODIFIED, mod.getDateModified());

                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return model.size();
    }
}
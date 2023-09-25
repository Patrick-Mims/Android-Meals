package edu.sfsu.meals.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import edu.sfsu.meals.R;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_ID = "ID";
    public static final String EXTRA_MEAL = "MEAL";
    public static final String EXTRA_DRINK_ALTERNATE = "ALTERNATE";
    public static final String EXTRA_CATEGORY = "CATEGORY";
    public static final String EXTRA_AREA = "AREA";
    public static final String EXTRA_INSTRUCTIONS = "INSTRUCTIONS";
    public static final String EXTRA_MEAL_THUMB = "THUMB";
    public static final String EXTRA_TAGS = "TAGS";
    public static final String EXTRA_YOUTUBE = "YOUTUBE";
    public static final String EXTRA_INGREDIENT1 = "INGREDIENT1";
    public static final String EXTRA_INGREDIENT2 = "INGREDIENT2";
    public static final String EXTRA_INGREDIENT3 = "INGREDIENT3";
    public static final String EXTRA_INGREDIENT4 = "INGREDIENT4";
    public static final String EXTRA_INGREDIENT5 = "INGREDIENT5";
    public static final String EXTRA_INGREDIENT6 = "INGREDIENT6";
    public static final String EXTRA_INGREDIENT7 = "INGREDIENT7";
    public static final String EXTRA_INGREDIENT8 = "INGREDIENT8";
    public static final String EXTRA_INGREDIENT9 = "INGREDIENT9";
    public static final String EXTRA_INGREDIENT10 = "INGREDIENT10";
    public static final String EXTRA_INGREDIENT11 = "INGREDIENT11";
    public static final String EXTRA_INGREDIENT12 = "INGREDIENT12";
    public static final String EXTRA_INGREDIENT13 = "INGREDIENT13";
    public static final String EXTRA_INGREDIENT14 = "INGREDIENT14";
    public static final String EXTRA_INGREDIENT15 = "INGREDIENT15";
    public static final String EXTRA_INGREDIENT16 = "INGREDIENT16";
    public static final String EXTRA_INGREDIENT17 = "INGREDIENT17";
    public static final String EXTRA_INGREDIENT18 = "INGREDIENT18";
    public static final String EXTRA_INGREDIENT19 = "INGREDIENT19";
    public static final String EXTRA_INGREDIENT20 = "INGREDIENT20";
    public static final String EXTRA_MEASURE1 = "MEASURE1";
    public static final String EXTRA_MEASURE2 = "MEASURE2";
    public static final String EXTRA_MEASURE3 = "MEASURE3";
    public static final String EXTRA_MEASURE4 = "MEASURE4";
    public static final String EXTRA_MEASURE5 = "MEASURE5";
    public static final String EXTRA_MEASURE6 = "MEASURE6";
    public static final String EXTRA_MEASURE7 = "MEASURE7";
    public static final String EXTRA_MEASURE8 = "MEASURE8";
    public static final String EXTRA_MEASURE9 = "MEASURE9";
    public static final String EXTRA_MEASURE10 = "MEASURE10";
    public static final String EXTRA_MEASURE11 = "MEASURE11";
    public static final String EXTRA_MEASURE12 = "MEASURE12";
    public static final String EXTRA_MEASURE13 = "MEASURE13";
    public static final String EXTRA_MEASURE14 = "MEASURE14";
    public static final String EXTRA_MEASURE15 = "MEASURE15";
    public static final String EXTRA_MEASURE16 = "MEASURE16";
    public static final String EXTRA_MEASURE17 = "MEASURE17";
    public static final String EXTRA_MEASURE18 = "MEASURE18";
    public static final String EXTRA_MEASURE19 = "MEASURE19";
    public static final String EXTRA_MEASURE20 = "MEASURE20";
    public static final String EXTRA_SOURCE = "SOURCE";
    public static final String EXTRA_IMAGE_SOURCE = "IMAGE_SOURCE";
    public static final String EXTRA_CREATIVE_COMMONS_CONFIRMED = "CREATIVE_COMMONS_CONFIRMED";
    public static final String EXTRA_DATE_MODIFIED = "DATE_MODIFIED";

    public static Intent newIntent(Context packageContext,
                                   String EXTRA_ID,
                                   String EXTRA_MEAL,
                                   String EXTRA_DRINK_ALTERNATE,
                                   String EXTRA_CATEGORY,
                                   String EXTRA_AREA,
                                   String EXTRA_INSTRUCTIONS,
                                   String EXTRA_MEAL_THUMB,
                                   String EXTRA_TAGS,
                                   String EXTRA_YOUTUBE,
                                   String EXTRA_INGREDIENT1,
                                   String EXTRA_INGREDIENT2,
                                   String EXTRA_INGREDIENT3,
                                   String EXTRA_INGREDIENT4,
                                   String EXTRA_INGREDIENT5,
                                   String EXTRA_INGREDIENT6,
                                   String EXTRA_INGREDIENT7,
                                   String EXTRA_INGREDIENT8,
                                   String EXTRA_INGREDIENT9,
                                   String EXTRA_INGREDIENT10,
                                   String EXTRA_INGREDIENT11,
                                   String EXTRA_INGREDIENT12,
                                   String EXTRA_INGREDIENT13,
                                   String EXTRA_INGREDIENT14,
                                   String EXTRA_INGREDIENT15,
                                   String EXTRA_INGREDIENT16,
                                   String EXTRA_INGREDIENT17,
                                   String EXTRA_INGREDIENT18,
                                   String EXTRA_INGREDIENT19,
                                   String EXTRA_INGREDIENT20,
                                   String EXTRA_MEASURE1,
                                   String EXTRA_MEASURE2,
                                   String EXTRA_MEASURE3,
                                   String EXTRA_MEASURE4,
                                   String EXTRA_MEASURE5,
                                   String EXTRA_MEASURE6,
                                   String EXTRA_MEASURE7,
                                   String EXTRA_MEASURE8,
                                   String EXTRA_MEASURE9,
                                   String EXTRA_MEASURE10,
                                   String EXTRA_MEASURE11,
                                   String EXTRA_MEASURE12,
                                   String EXTRA_MEASURE13,
                                   String EXTRA_MEASURE14,
                                   String EXTRA_MEASURE15,
                                   String EXTRA_MEASURE16,
                                   String EXTRA_MEASURE17,
                                   String EXTRA_MEASURE18,
                                   String EXTRA_MEASURE19,
                                   String EXTRA_MEASURE20,
                                   String EXTRA_SOURCE,
                                   String EXTRA_IMAGE_SOURCE,
                                   String EXTRA_CREATIVE_COMMONS_CONFIRMED,
                                   String EXTRA_DATE_MODIFIED) {

        Intent intent = new Intent(packageContext, DetailActivity.class);

        intent.putExtra(EXTRA_ID, "EXTRA_ID");
        intent.putExtra(EXTRA_MEAL, "MEAL");
        intent.putExtra(EXTRA_DRINK_ALTERNATE, "ALTERNATE");
        intent.putExtra(EXTRA_CATEGORY, "CATEGORY");
        intent.putExtra(EXTRA_AREA, "AREA");
        intent.putExtra(EXTRA_INSTRUCTIONS, "INSTRUCTIONS");
        intent.putExtra(EXTRA_MEAL_THUMB, "MEAL_THUMB");
        intent.putExtra(EXTRA_TAGS, "TAGS");
        intent.putExtra(EXTRA_YOUTUBE, "YOUTUBE");
        intent.putExtra(EXTRA_INGREDIENT1, "INGREDIENT1");
        intent.putExtra(EXTRA_INGREDIENT2, "INGREDIENT2");
        intent.putExtra(EXTRA_INGREDIENT3, "INGREDIENT3");
        intent.putExtra(EXTRA_INGREDIENT4, "INGREDIENT4");
        intent.putExtra(EXTRA_INGREDIENT5, "INGREDIENT5");
        intent.putExtra(EXTRA_INGREDIENT6, "INGREDIENT6");
        intent.putExtra(EXTRA_INGREDIENT7, "INGREDIENT7");
        intent.putExtra(EXTRA_INGREDIENT8, "INGREDIENT8");
        intent.putExtra(EXTRA_INGREDIENT9, "INGREDIENT9");
        intent.putExtra(EXTRA_INGREDIENT10, "INGREDIENT10");
        intent.putExtra(EXTRA_INGREDIENT11, "INGREDIENT11");
        intent.putExtra(EXTRA_INGREDIENT12, "INGREDIENT12");
        intent.putExtra(EXTRA_INGREDIENT13, "INGREDIENT13");
        intent.putExtra(EXTRA_INGREDIENT14, "INGREDIENT14");
        intent.putExtra(EXTRA_INGREDIENT15, "INGREDIENT15");
        intent.putExtra(EXTRA_INGREDIENT16, "INGREDIENT16");
        intent.putExtra(EXTRA_INGREDIENT17, "INGREDIENT17");
        intent.putExtra(EXTRA_INGREDIENT18, "INGREDIENT18");
        intent.putExtra(EXTRA_INGREDIENT19, "INGREDIENT19");
        intent.putExtra(EXTRA_INGREDIENT20, "INGREDIENT20");
        intent.putExtra(EXTRA_MEASURE1, "MEASURE1");
        intent.putExtra(EXTRA_MEASURE2, "MEASURE2");
        intent.putExtra(EXTRA_MEASURE3, "MEASURE3");
        intent.putExtra(EXTRA_MEASURE4, "MEASURE4");
        intent.putExtra(EXTRA_MEASURE5, "MEASURE5");
        intent.putExtra(EXTRA_MEASURE6, "MEASURE6");
        intent.putExtra(EXTRA_MEASURE7, "MEASURE7");
        intent.putExtra(EXTRA_MEASURE8, "MEASURE8");
        intent.putExtra(EXTRA_MEASURE9, "MEASURE9");
        intent.putExtra(EXTRA_MEASURE10, "MEASURE10");
        intent.putExtra(EXTRA_MEASURE11, "MEASURE11");
        intent.putExtra(EXTRA_MEASURE12, "MEASURE12");
        intent.putExtra(EXTRA_MEASURE13, "MEASURE13");
        intent.putExtra(EXTRA_MEASURE14, "MEASURE14");
        intent.putExtra(EXTRA_MEASURE15, "MEASURE15");
        intent.putExtra(EXTRA_MEASURE16, "MEASURE16");
        intent.putExtra(EXTRA_MEASURE17, "MEASURE17");
        intent.putExtra(EXTRA_MEASURE18, "MEASURE18");
        intent.putExtra(EXTRA_MEASURE19, "MEASURE19");
        intent.putExtra(EXTRA_MEASURE20, "MEASURE20");
        intent.putExtra(EXTRA_SOURCE, "SOURCE");
        intent.putExtra(EXTRA_IMAGE_SOURCE, "IMAGE_SOURCE");
        intent.putExtra(EXTRA_CREATIVE_COMMONS_CONFIRMED, "CREATIVE_COMMONS_CONFIRMED");
        intent.putExtra(EXTRA_DATE_MODIFIED, "DATE_MODIFIED");

        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String id = getIntent().getStringExtra(EXTRA_ID);
        String meal = getIntent().getStringExtra(EXTRA_MEAL);
        String category = getIntent().getStringExtra(EXTRA_CATEGORY);

        TextView tv_id = findViewById(R.id.idMeal);
        TextView tv_meal = findViewById(R.id.strMeal);
        TextView tv_category = findViewById(R.id.strCategory);

        tv_id.setText(id);
        tv_meal.setText(meal);
        tv_category.setText(category);
    }
}

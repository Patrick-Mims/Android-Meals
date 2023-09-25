package edu.sfsu.meals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.ArrayList;
import edu.sfsu.meals.model.DataModel;
import edu.sfsu.meals.task.DataTask;

public class MainActivity extends AppCompatActivity {
    ArrayList<DataModel> dataModel = null;
    ProgressBar progressBar;
    RecyclerView recyclerView;
    private static final String api = "https://www.themealdb.com/api/json/v1/1/search.php?f=k";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataModel = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);

        new DataTask(MainActivity.this, recyclerView, progressBar, dataModel).execute(api);
    }
}
package edu.sfsu.meals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.ArrayList;
import edu.sfsu.meals.model.DataModel;
import edu.sfsu.meals.task.DataTask;

public class MainActivity extends AppCompatActivity {
    ArrayList<DataModel> dataModel;
    ProgressBar progressBar;
    RecyclerView recyclerView;

    private static final String api = "https://www.themealdb.com/api/json/v1/1/search.php?f=a";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        dataModel = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);

        new DataTask(MainActivity.this, recyclerView, progressBar, dataModel).execute(api);
    }
}

        /*
        final Request request = new Request.Builder().url("https://www.themealdb.com/api/json/v1/1/search.php?f=a").build();
        AsyncTask<Void, Void, String> asyncTask = new AsyncTask<Void, Void, String>() {
            @SuppressLint("StaticFieldLeak")
            @Override
            protected String doInBackground(Void... params) {

                try {
                    Response response = client.newCall(request).execute();
                    if(!response.isSuccessful()) {
                        return null;
                    }
                    return response.body().string();
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);

                if(s != null) {
                    Log.i("LOG", "SOMETHING" + s);
                }

                try {
                    JSONObject root = new JSONObject(s);
                    JSONArray list = root.getJSONArray("meals");

                    for(int i = 0; i < list.length(); i++) {
                        //dataModel.add(new DataModel (
                        //        list.getJSONObject(i).getString("idMeal"),
                        //        list.getJSONObject(i).getString("strMeal")
                        //));
                    }

                } catch(Exception e) {
                    e.printStackTrace();
                }

            }
        };
        asyncTask.execute();
        */
//        this.recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        //this.recyclerView.setAdapter(new DataAdapter(model));
package edu.sfsu.meals.task;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ProgressBar;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import edu.sfsu.meals.adapter.DataAdapter;
import edu.sfsu.meals.model.DataModel;

//Started Work: September 18th, 2023

public class DataTask extends AsyncTask<String, Integer, String> {
    Context context;
    RecyclerView recyclerView;
    ProgressBar progressBar;
    ArrayList<DataModel> model;

    public DataTask(Context context, RecyclerView recyclerView, ProgressBar progressBar, ArrayList<DataModel> model) {
        this.context = context;
        this.recyclerView = recyclerView;
        this.progressBar = progressBar;
        this.model = model;
    }

    protected void progressDialog() {
       super.onPreExecute();
    }
    @Override
    protected String doInBackground(String... params) {
        BufferedReader bufferedReader;
        HttpURLConnection urlConnection = null;
        String line;
        String results = null;
        StringBuilder builder;
        URL url;

        try {
            url = new URL(params[0]);

            urlConnection = (HttpURLConnection) url.openConnection();

            int code = urlConnection.getResponseCode();

            if(code != 200) {
                throw new IOException("Invalid response from server: " + code);
            }

            bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            builder = new StringBuilder();

            while((line = bufferedReader.readLine()) != null) {
                Log.v("LOG", "line => " + line);
                builder.append(line).append("\n");
            }

            if(builder.length() == 0) {
                return null;
            }

            results = builder.toString();

            return results;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(urlConnection != null) {
                urlConnection.disconnect();
            }
        }
        return null;
    }

    protected void onProgessUpdate(String... progress) {
        super.onPostExecute(progress[0]);
    }

    protected void onPostExecute(String result) {
       super.onPostExecute(result);

        try {
            JSONObject root = new JSONObject(result);
            JSONArray list = root.getJSONArray("meals");

            for(int i = 0; i < list.length(); i++) {
                model.add(new DataModel(
                        list.getJSONObject(i).getString("idMeal"),
                        list.getJSONObject(i).getString("strMeal"),
                        list.getJSONObject(i).getString("strDrinkAlternate"),
                        list.getJSONObject(i).getString("strCategory"),
                        list.getJSONObject(i).getString("strArea"),
                        list.getJSONObject(i).getString("strInstructions"),
                        list.getJSONObject(i).getString("strMealThumb"),
                        list.getJSONObject(i).getString("strTags"),
                        list.getJSONObject(i).getString("strYoutube"),
                        list.getJSONObject(i).getString("strIngredient1"),
                        list.getJSONObject(i).getString("strIngredient2"),
                        list.getJSONObject(i).getString("strIngredient3"),
                        list.getJSONObject(i).getString("strIngredient4"),
                        list.getJSONObject(i).getString("strIngredient5"),
                        list.getJSONObject(i).getString("strIngredient6"),
                        list.getJSONObject(i).getString("strIngredient7"),
                        list.getJSONObject(i).getString("strIngredient8"),
                        list.getJSONObject(i).getString("strIngredient9"),
                        list.getJSONObject(i).getString("strIngredient10"),
                        list.getJSONObject(i).getString("strIngredient11"),
                        list.getJSONObject(i).getString("strIngredient12"),
                        list.getJSONObject(i).getString("strIngredient13"),
                        list.getJSONObject(i).getString("strIngredient14"),
                        list.getJSONObject(i).getString("strIngredient15"),
                        list.getJSONObject(i).getString("strIngredient16"),
                        list.getJSONObject(i).getString("strIngredient17"),
                        list.getJSONObject(i).getString("strIngredient18"),
                        list.getJSONObject(i).getString("strIngredient19"),
                        list.getJSONObject(i).getString("strIngredient20"),
                        list.getJSONObject(i).getString("strMeasure1"),
                        list.getJSONObject(i).getString("strMeasure2"),
                        list.getJSONObject(i).getString("strMeasure3"),
                        list.getJSONObject(i).getString("strMeasure4"),
                        list.getJSONObject(i).getString("strMeasure5"),
                        list.getJSONObject(i).getString("strMeasure6"),
                        list.getJSONObject(i).getString("strMeasure7"),
                        list.getJSONObject(i).getString("strMeasure8"),
                        list.getJSONObject(i).getString("strMeasure9"),
                        list.getJSONObject(i).getString("strMeasure10"),
                        list.getJSONObject(i).getString("strMeasure11"),
                        list.getJSONObject(i).getString("strMeasure12"),
                        list.getJSONObject(i).getString("strMeasure13"),
                        list.getJSONObject(i).getString("strMeasure14"),
                        list.getJSONObject(i).getString("strMeasure15"),
                        list.getJSONObject(i).getString("strMeasure16"),
                        list.getJSONObject(i).getString("strMeasure17"),
                        list.getJSONObject(i).getString("strMeasure18"),
                        list.getJSONObject(i).getString("strMeasure19"),
                        list.getJSONObject(i).getString("strMeasure20"),
                        list.getJSONObject(i).getString("strSource"),
                        list.getJSONObject(i).getString("strImageSource"),
                        list.getJSONObject(i).getString("strCreativeCommonsConfirmed"),
                        list.getJSONObject(i).getString("dateModified")));
            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        this.recyclerView.setLayoutManager(new LinearLayoutManager(context));
        this.recyclerView.setAdapter(new DataAdapter(model));
    }
}

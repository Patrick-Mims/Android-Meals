package edu.sfsu.meals.task;

import android.net.Network;
import android.os.AsyncTask;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.ArrayList;

import edu.sfsu.meals.model.DataModel;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class HttpClient extends AsyncTask<String, Void, String> {
    ArrayList<DataModel> dataModel;
    @Override
    protected String doInBackground(String... params) {
        try {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder().url(params[0]).build();
            Response response = client.newCall(request).execute();

            Gson gson = new Gson();

            DataModel dataModel = gson.fromJson(response.body().toString(), DataModel.class);
            //dataModel.g

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }
//    private final OkHttpClient client = new OkHttpClient();

}
        /*
    public void run() throws Exception {
        Request request = new Request.Builder().url("https://www.themealdb.com/api/json/v1/1/search.php?f=a").build();
        Gson gson = new Gson();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {

               // String responseBody = response.body().string();

                try (ResponseBody responseBody = response.body()) {
                    if(!response.isSuccessful()) throw new IOException("Unexpected code" + response);

                    Headers responseHeaders = response.headers();

                    for(int i = 0, size = responseHeaders.size(); i < size; i++) {
                        Log.v("LOG", "responseHeaders.name(i) => " + responseHeaders.name(i) + ": " + responseHeaders.value(1));
                    }

                    DataModel dm = gson.fromJson(responseBody.charStream(), DataModel.class);
                    Log.v("LOG", "responseBody.toString() => " + dm);
                }
            }

            @Override public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }
        });
    }
    */

/*
public class HttpClient extends AsyncTask<String, Integer, String> {
    public HttpClient() {

    }
    @Override
    protected String doInBackground(String... params) {
        OkHttpClient client = new OkHttpClient();
        Request.Builder builder = new Request.Builder();
        builder.url(params[0]);
        Request request = builder.build();

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
}
*/

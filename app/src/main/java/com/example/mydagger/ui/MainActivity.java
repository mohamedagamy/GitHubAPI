package com.example.mydagger.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.mydagger.R;
import com.example.mydagger.data.remote.RetrofitBuilder;
import com.example.mydagger.pojo.GithubRepo;
import com.example.mydagger.utils.Constants;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    RecyclerView recyclerView;
    UsersAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.main_recyclerview_items);

        final Call<List<GithubRepo>> repos =RetrofitBuilder.build().listRepos(Constants.ACCESS_TOKEN);
        repos.enqueue(new Callback<List<GithubRepo>>() {
            @Override
            public void onResponse(Call<List<GithubRepo>> call, Response<List<GithubRepo>> response) {
                Log.e(TAG, "onResponse: "+response.body());
                adapter = new UsersAdapter(response.body());
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<GithubRepo>> call, Throwable t) {
                Log.e(TAG, "onResponse: "+t.getLocalizedMessage());
            }
        });


    }

    private void beforeDagger() {

    }

    private void afterDagger() {

    }

}

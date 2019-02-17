package com.example.mydagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import org.androidannotations.annotations.ViewById;

public class MainActivity extends AppCompatActivity {

    @ViewById(R.id.main_recyclerview_items)
    RecyclerView recyclerView;

    String gitHub = "https://api.github.com/";
    String accessToken = "access_token=29a02874cdd3b561731115af4d864b73f59a1ff8";
    String url = "https://api.github.com/user/followers?="+accessToken;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    private void beforeDagger() {

    }

    private void afterDagger() {

    }

}

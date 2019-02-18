package com.example.mydagger.data.remote;

import com.example.mydagger.pojo.GithubRepo;
import com.example.mydagger.pojo.GithubUser;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GitHubService {
    @GET("user/repos")
    Call<List<GithubRepo>> listRepos(@Query("access_token") String token);

    @GET("user/followers")
    Call<List<GithubUser>> listFollowers(@Query("access_token") String token);

    @GET("user/following")
    Call<List<GithubUser>> listFollowing(@Query("access_token") String token);
}

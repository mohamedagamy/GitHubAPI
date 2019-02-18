package com.example.mydagger.ui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mydagger.R;
import com.example.mydagger.pojo.GithubRepo;
import com.example.mydagger.pojo.GithubUser;

import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<UserViewHolder>{
    private List<GithubRepo> githubRepos;
    private List<GithubUser> githubUsers;

    public UsersAdapter(List<GithubRepo> githubRepos, List<GithubUser> githubUsers) {
        this.githubRepos = githubRepos;
        this.githubUsers = githubUsers;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from( viewGroup.getContext()).inflate(R.layout.rv_list_item,viewGroup,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder userViewHolder, int i) {
        if(githubRepos != null)
            userViewHolder.bindRepos(githubRepos.get(i));
        else if(githubUsers != null)
            userViewHolder.bindUser(githubUsers.get(i));
    }

    @Override
    public int getItemCount() {
        int usersCount = githubUsers != null? githubUsers.size() : 0;
        int reposCount = githubRepos != null? githubRepos.size() : 0;
        int max = Math.max(usersCount,reposCount);
        return max;
    }
}

package com.example.mydagger.ui;

import android.content.Context;
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
    private List<GithubRepo> githubUsers;

    public UsersAdapter(List<GithubRepo> githubUsers) {
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
        userViewHolder.bind(githubUsers.get(i));
    }

    @Override
    public int getItemCount() {
        int count = githubUsers != null? githubUsers.size() : 0;
        return count;
    }
}

package com.example.mydagger.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mydagger.R;
import com.example.mydagger.pojo.GithubRepo;
import com.example.mydagger.pojo.GithubUser;
import com.squareup.picasso.Picasso;


public class UserViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    Context mContext;
    ImageView itemImage;
    TextView itemText;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        mContext = itemView.getContext();
        itemView.setOnClickListener(this);
        itemImage = itemView.findViewById(R.id.main_item_img);
        itemText = itemView.findViewById(R.id.main_item_txt);
    }


    @Override
    public void onClick(View v) {
        Toast.makeText(mContext, "Welcome : "+itemText.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    public void bindUser(GithubUser githubUser) {
        if(githubUser != null) {
            String username = githubUser.getLogin() != null ? githubUser.getLogin() : "";
            String avatarURL = githubUser.getAvatarUrl() != null ? githubUser.getAvatarUrl() : "";
            itemText.setText(username);
            Picasso.get().load(avatarURL).into(itemImage);
        }
    }

    public void bindRepos(GithubRepo githubRepo) {
        if(githubRepo != null) {
            String username = githubRepo.getFullName() != null ? githubRepo.getFullName() : "";
            String avatarURL = githubRepo.getOwner() != null ? githubRepo.getOwner().getAvatarUrl() : "";
            itemText.setText(username);
            Picasso.get().load(avatarURL).into(itemImage);
        }
    }
}

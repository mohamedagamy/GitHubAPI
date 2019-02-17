package com.example.mydagger;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.androidannotations.annotations.ViewById;

public class UserViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    Context mContext;

    @ViewById(R.id.main_item_img)
    ImageView itemImage;

    @ViewById(R.id.main_item_txt)
    TextView itemText;

    public UserViewHolder(@NonNull View itemView,Context context) {
        super(itemView);
        this.mContext = context;
        itemView.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Toast.makeText(mContext, "Welcome : "+itemText.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}

package com.example.endhomework.adapter;


import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.endhomework.R;

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public ImageView avatar;
    public String id;
    public String feedurl;
    public String nickname;
    public String description;
    public long likecount;
    private final ListAdapter.ListItemClickListener mOnClickListener;

    public MyHolder(View view, ListAdapter.ListItemClickListener mOnClickListener) {
        super(view);
        avatar=view.findViewById(R.id.avatar);
        view.setOnClickListener(this);
        this.mOnClickListener=mOnClickListener;
    }


    @Override
    public void onClick(View v) {
        int clickedPosition = getAdapterPosition();
        if (mOnClickListener != null) {
            mOnClickListener.onListItemClick(clickedPosition);
        }
    }
}

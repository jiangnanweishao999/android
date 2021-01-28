package com.example.endhomework.adapter;

import android.content.Context;
import android.net.Uri;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import com.example.endhomework.R;
import com.example.endhomework.model.Message;

public class ListAdapter extends RecyclerView.Adapter<MyHolder> {
    private static final String TAG = "ListAdapter";
    private Context context;
    public List<Message> list;
    private  ListItemClickListener mOnClickListener;


    public ListAdapter(Context context, List<Message> list, ListItemClickListener mOnClickListener) {
        this.context = context;
        this.list = list;
        this.mOnClickListener=mOnClickListener;

    }

    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.im_list_item, parent, false);
        MyHolder holder = new MyHolder(view,this.mOnClickListener);
        return holder;
    }



    @Override
    public void onBindViewHolder(MyHolder holder,  int position) {
        Message message=list.get(position);
        Log.d(TAG,message.getAvatar().replaceFirst("http","https"));
        holder.avatar.setImageURI(Uri.parse(message.getAvatar().replaceFirst("http","https")));
        holder.id=message.get_id();
        holder.feedurl=message.getFeedurl();
        holder.description=message.getDescription();
        holder.likecount=message.getLikecount();
        holder.nickname=message.getNickname();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public interface ListItemClickListener {
        void onListItemClick(int clickedItemIndex);
    }

}

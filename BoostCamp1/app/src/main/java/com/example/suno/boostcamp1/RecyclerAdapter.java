package com.example.suno.boostcamp1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.suno.boostcamp1.data.NewsPost;
import com.example.suno.boostcamp1.data.Newsfeed;
import com.example.suno.boostcamp1.data.NewsfeedItem;
import com.example.suno.boostcamp1.holder.ItemViewHolder;
import com.example.suno.boostcamp1.holder.NewPostViewHolder;
import com.example.suno.boostcamp1.holder.StoryViewHolder;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by suno on 2017. 7. 4..
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<Newsfeed> itemList;
    private Context context;

    public static final int TYPE_STORY = 0;
    public static final int TYPE_NEWPOST = 1;
    public static final int TYPE_NEWITEM = 2;

    public RecyclerAdapter(ArrayList<Newsfeed> itemList, Context  context){
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType){
            case TYPE_STORY:
                return new StoryViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.newsfeed_poster_story, parent, false));
            case TYPE_NEWPOST:
                return new NewPostViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.newsfeed_poster_newpost, parent, false), context);
            case TYPE_NEWITEM:
                return new ItemViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.newsfeed_poster_item, parent, false), context);
        }

        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (getItemViewType(position)){
            case TYPE_STORY:
                ((StoryViewHolder)holder).bindView(itemList.get(position));
                break;
            case TYPE_NEWPOST:
                ((NewPostViewHolder)holder).bindView(itemList.get(position));
                break;
            case TYPE_NEWITEM:
                ((ItemViewHolder)holder).bindView(itemList.get(position));
                break;
        }
    }

    @Override
    public int getItemViewType(int position){
        return itemList.get(position).getViewType();
    }

    @Override
    public int getItemCount() {
        return itemList != null ? itemList.size() : 0;
    }

}


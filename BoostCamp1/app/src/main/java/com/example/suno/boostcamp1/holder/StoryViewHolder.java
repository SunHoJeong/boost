package com.example.suno.boostcamp1.holder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.suno.boostcamp1.R;
import com.example.suno.boostcamp1.data.Newsfeed;
import com.example.suno.boostcamp1.data.Story;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;

/**
 * Created by suno on 2017. 7. 7..
 */

public class StoryViewHolder extends RecyclerView.ViewHolder {
    private Context context;
    private Story st;

    @BindView(R.id.imageView_story)
    ImageView imgv_story;
    @BindView(R.id.imageView_story_camera)
    ImageView imgv_story_camera;
    @BindView(R.id.textView_story)
    TextView tv_stroy;

    public StoryViewHolder(View itemView, Context context) {
        super(itemView);
        this.context = context;
        ButterKnife.bind(this, itemView);
    }

    public void bindView(Newsfeed item) {
        st = ((Story)item);
        Glide.with(context)
                .load(st.getStoryImgId())
                .bitmapTransform(new RoundedCornersTransformation(context, 15, 2))
                .into(imgv_story);
        tv_stroy.setText(st.getStoryName());
    }

    @OnClick({R.id.imageView_story, R.id.imageView_story_camera})
    public void Click(View v){
        switch (v.getId()){
            case R.id.imageView_story_camera:
                Toast.makeText(context, "Story camera clicked!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView_story:
                Toast.makeText(context, "my story clicked!", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
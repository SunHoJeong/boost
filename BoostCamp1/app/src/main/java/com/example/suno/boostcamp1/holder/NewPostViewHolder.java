package com.example.suno.boostcamp1.holder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.suno.boostcamp1.R;
import com.example.suno.boostcamp1.data.NewsPost;
import com.example.suno.boostcamp1.data.Newsfeed;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by suno on 2017. 7. 7..
 */

public class NewPostViewHolder extends RecyclerView.ViewHolder{
    @BindView(R.id.imageBtn_newpost_profile)
    ImageButton imageBtn;
    @BindView(R.id.textView_newpost)
    TextView textView;

    public Context context;
    NewsPost np;

    public NewPostViewHolder(View itemView, Context context) {
        super(itemView);

        this.context = context;
        ButterKnife.bind(this, itemView);
    }

    public void bindView(Newsfeed item){
        np = (NewsPost)item;

        //imageBtn.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_boost_profile));
        imageBtn.setImageResource(np.getImageId());
        textView.setText("수노님 업데이트를 공유하시겠어요?");
    }

    @OnClick(R.id.textView_newpost) void newpostClicked(){
        Toast.makeText(context, "newPostClicked", Toast.LENGTH_SHORT).show();
    }
}
package com.example.suno.boostcamp1.holder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.suno.boostcamp1.R;
import com.example.suno.boostcamp1.data.Newsfeed;
import com.example.suno.boostcamp1.data.NewsfeedItem;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by suno on 2017. 7. 7..
 */

public class ItemViewHolder extends RecyclerView.ViewHolder{
    Context context;
    NewsfeedItem nf;

    @BindView(R.id.imageBtn_postby)
    ImageButton imgBtn_postBy;
    @BindView(R.id.textView_postby)
    TextView tv_postBy;
    @BindView(R.id.textView_date)
    TextView tv_date;
    @BindView(R.id.textView_postComment)
    TextView tv_postComment;
    @BindView(R.id.textView_symCnt)
    TextView tv_symCnt;
    @BindView(R.id.textView_commentCnt)
    TextView tv_comCnt;
    @BindView(R.id.textView_shareCnt)
    TextView tv_shareCnt;
    @BindView(R.id.textView_myName)
    TextView tv_myName;
    @BindView(R.id.textView_myComment)
    TextView tv_myComment;
    @BindView(R.id.imageView_postImg)
    ImageView imgv_postImg;

    public ItemViewHolder(View itemView, Context context) {
        super(itemView);

        this.context = context;
        ButterKnife.bind(this, itemView);
    }

    public void bindView(Newsfeed item){
        nf = ((NewsfeedItem)item);

        imgBtn_postBy.setImageResource(nf.getPostByImgId());
        tv_postBy.setText(nf.getPostBy());
        tv_date.setText(nf.getDate());
        tv_postComment.setText(nf.getPostComment());
        imgv_postImg.setImageResource(nf.getPostImgId());
        tv_symCnt.setText(nf.getSympathyCnt());
        tv_comCnt.setText("댓글 "+nf.getCommentCnt()+"개");
        tv_shareCnt.setText("공유 "+nf.getShareCnt()+"회");
        tv_myName.setText(nf.getMyName());
        tv_myComment.setText(nf.getMyComment());

    }

    @OnClick(R.id.textView_postby) void postbyClicked(){
        Toast.makeText(context, "작성자: "+nf.getPostBy(), Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.textView_date) void dateClicked(){
        Toast.makeText(context, "작성시간: "+nf.getDate(), Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.textView_symCnt) void symCntClicked(){
        Toast.makeText(context, "종아요 "+nf.getSympathyCnt()+"개", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.textView_commentCnt) void commentCntClicked(){
        Toast.makeText(context, "댓글 "+nf.getCommentCnt()+"개", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.textView_shareCnt) void shareCntClicked(){
        Toast.makeText(context, "공유 "+nf.getShareCnt()+"회", Toast.LENGTH_SHORT).show();
    }

}
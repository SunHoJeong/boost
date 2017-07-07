package com.example.suno.boostcamp1.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.suno.boostcamp1.data.NewsPost;
import com.example.suno.boostcamp1.data.Newsfeed;
import com.example.suno.boostcamp1.data.NewsfeedItem;
import com.example.suno.boostcamp1.R;
import com.example.suno.boostcamp1.RecyclerAdapter;

import java.util.ArrayList;

import static com.example.suno.boostcamp1.RecyclerAdapter.TYPE_NEWPOST;

/**
 * Created by suno on 2017. 7. 4..
 */

public class NewsfeedFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private LinearLayoutManager mLayoutManager;
    private ArrayList<Newsfeed> mDataset;

    public NewsfeedFragment(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_newsfeed_tab, container, false);

        Context context = view.getContext();
        mRecyclerView = (RecyclerView)view.findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(context);
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mDataset = new ArrayList<>();

        addItem(); //add fixed data

        mAdapter = new RecyclerAdapter(mDataset, getActivity());
        mRecyclerView.setAdapter(mAdapter);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    public void addItem(){
        mDataset.add(new NewsPost(TYPE_NEWPOST, R.drawable.img_suno));

        NewsfeedItem.Builder builder = new NewsfeedItem.Builder();
        mDataset.add(builder
                .withViewType(RecyclerAdapter.TYPE_NEWITEM)
                .withPostByImgId(R.drawable.ic_boost_profile)
                .withPostBy("부스트캠프")
                .withDate("50분")
                .withPostComment("#부스트캠프 2기는 누구? 바로 나야,나!!!\n " +
                        "바로 오늘 부캠 2기 #오리엔테이션이 열렸습니다!\n교육에 임하는 단단한 각오와 함께,\n본격적으로 부스트부스트~달려보겠습니다!")
                .withPostImgId(R.drawable.img_boostcamp)
                .withSympathCnt("11")
                .withCommentCnt("77")
                .withShareCnt("33")
                .withMyName("수노")
                .withMycomment("반갑습니다!")
                .build());

        mDataset.add(builder
                .withViewType(RecyclerAdapter.TYPE_NEWITEM)
                .withPostByImgId(R.drawable.img_suno)
                .withPostBy("정수노")
                .withDate("13분")
                .withPostComment("오늘은 Google I/O에 다녀왔습니다. Handling Lifecycles, LiveData,\n"+
                        "ViewModel에 관련된 내용으로 진행되었습니다.\n\n\nKotlin 같이 공부할사람!!!?")
                .withPostImgId(R.drawable.img_google)
                .withSympathCnt("123")
                .withCommentCnt("27")
                .withShareCnt("5")
                .withMyName("수노")
                .withMycomment("보람찬 하루였어ㅋㅋㅋ")
                .build());

        mDataset.add(builder
                .withViewType(RecyclerAdapter.TYPE_NEWITEM)
                .withPostByImgId(R.drawable.ic_lego)
                .withPostBy("정수노")
                .withDate("23분")
                .withPostComment("오늘 내 동료들을 영입했다! "+
                        "나는 더이상 혼자가 아니다. 나의 세력을 좀 더 키워서 이 세상을 지배하겠다 하하하!\n\n"+"#너 내 동료가 돼라!\n"+"#LEGO")
                .withPostImgId(R.drawable.img_lego)
                .withSympathCnt("882")
                .withCommentCnt("443")
                .withShareCnt("43")
                .withMyName("수노")
                .withMycomment("저도 지원할 수 있나요?")
                .build());

        mDataset.add(builder
                .withViewType(RecyclerAdapter.TYPE_NEWITEM)
                .withPostByImgId(R.drawable.ic_coding)
                .withPostBy("생활코딩")
                .withDate("1시간 전")
                .withPostComment("여름방학 특집으로 구글과 생활코딩이 함께하는 코딩야학 2기의 참가 모집이 시작 되었습니다. " +
                        "코딩, 웹, 인터넷 그리고 컴퓨터를 배웁니다. 코딩야학에서는 30일 분량으로 쪼개진 온라인 강의를 무료로 제공하고, " +
                        "현업 개발자들이 막히는 부분을 온라인으로 지원 해드립니다. 다가오는 방학을 코딩야학과 함께 해보시면 어떨까요?" +
                        "여름방학 특집으로 구글과 생활코딩이 함께하는 코딩야학 2기의 참가 모집이 시작 되었습니다. 코딩, 웹, " +
                        "인터넷 그리고 컴퓨터를 배웁니다. 코딩야학에서는 30일 분량으로 쪼개진 온라인 강의를 무료로 제공하고, " +
                        "현업 개발자들이 막히는 부분을 온라인으로 지원 해드립니다. 다가오는 방학을 코딩야학과 함께 해보시면 어떨까요?")
                .withPostImgId(R.drawable.img_coding)
                .withSympathCnt("730")
                .withCommentCnt("118")
                .withShareCnt("472")
                .withMyName("수노")
                .withMycomment("열심히 하겠습니다!")
                .build());

    }
}

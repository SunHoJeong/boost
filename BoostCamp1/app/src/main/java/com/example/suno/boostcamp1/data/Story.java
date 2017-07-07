package com.example.suno.boostcamp1.data;

/**
 * Created by suno on 2017. 7. 6..
 */

public class Story extends Newsfeed{
    private int myImgId, storyImgId;

    public Story(int viewType, int myImgId, int storyImgId) {
        super(viewType);
        this.myImgId = myImgId;
        this.storyImgId = storyImgId;
    }

    public int getMyImgId() {
        return myImgId;
    }

    public void setMyImgId(int myImgId) {
        this.myImgId = myImgId;
    }

    public int getStoryImgId() {
        return storyImgId;
    }

    public void setStoryImgId(int storyImgId) {
        this.storyImgId = storyImgId;
    }
}

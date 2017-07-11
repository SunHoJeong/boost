package com.example.suno.boostcamp1.data;

/**
 * Created by suno on 2017. 7. 6..
 */

public class Story extends Newsfeed{
    private String storyName;
    private int storyImgId;

    public Story(int viewType, String storyName, int storyImgId) {
        super(viewType);
        this.storyName = storyName;
        this.storyImgId = storyImgId;
    }

    public String getStoryName() {
        return storyName;
    }

    public void setStoryName(String storyName) {
        this.storyName = storyName;
    }

    public int getStoryImgId() {
        return storyImgId;
    }

    public void setStoryImgId(int storyImgId) {
        this.storyImgId = storyImgId;
    }
}

package com.example.suno.boostcamp1.data;

/**
 * Created by suno on 2017. 7. 5..
 */

public class Newsfeed {
    private int viewType;

    public Newsfeed(int viewType) {
        this.viewType = viewType;
    }

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }
}

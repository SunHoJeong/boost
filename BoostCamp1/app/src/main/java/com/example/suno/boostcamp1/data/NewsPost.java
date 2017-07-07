package com.example.suno.boostcamp1.data;

/**
 * Created by suno on 2017. 7. 5..
 */

public class NewsPost extends Newsfeed {
    private int imageId;

    public NewsPost(int viewType, int imageId) {
        super(viewType);
        this.imageId = imageId;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageBtn) {
        this.imageId = imageBtn;
    }
}

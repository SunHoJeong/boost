package com.example.suno.boostcamp1.data;

public class NewsfeedItem extends Newsfeed {
    private String postBy, date, postComment, sympathyCnt,commentCnt, shareCnt, myName, myComment;
    private int postByImgId, postImgId;

    public NewsfeedItem(int viewType, int postByImgId, String postBy, String date, String postComment, int postImgId,
                        String sympathyCnt, String commentCnt, String shareCnt,
                        String myName, String myComment){
        super(viewType);
        this.postByImgId = postByImgId;
        this.postBy = postBy;
        this.date = date;
        this.postComment = postComment;
        this.postImgId = postImgId;
        this.sympathyCnt = sympathyCnt;
        this.commentCnt = commentCnt;
        this.shareCnt = shareCnt;
        this.myName = myName;
        this.myComment = myComment;
    }

    public String getPostBy() {
        return postBy;
    }

    public String getDate() {
        return date;
    }

    public String getPostComment() {
        return postComment;
    }

    public String getSympathyCnt() {
        return sympathyCnt;
    }

    public String getCommentCnt() {
        return commentCnt;
    }

    public String getShareCnt() {
        return shareCnt;
    }

    public String getMyName() {
        return myName;
    }

    public String getMyComment() {
        return myComment;
    }

    public int getPostByImgId() {
        return postByImgId;
    }

    public int getPostImgId() {
        return postImgId;
    }

    public static class Builder{
        private String postBy, date, postComment, sympathyCnt,commentCnt, shareCnt, myName, myComment;
        private int viewType, postByImgId, postImgId;

        public Builder withViewType(int viewType){
            this.viewType = viewType;

            return this;
        }

        public Builder withPostBy(String postBy){
            this.postBy = postBy;

            return this;
        }

        public Builder withDate(String date){
            this.date = date;

            return this;
        }

        public Builder withPostComment(String postComment){
            this.postComment = postComment;

            return this;
        }

        public Builder withSympathCnt(String sympathyCnt){
            this.sympathyCnt = sympathyCnt;

            return this;
        }

        public Builder withCommentCnt(String commentCnt){
            this.commentCnt = commentCnt;

            return this;
        }

        public Builder withShareCnt(String shareCnt){
            this.shareCnt = shareCnt;

            return this;
        }

        public Builder withMyName(String myName){
            this.myName = myName;

            return this;
        }

        public Builder withMycomment(String myComment){
            this.myComment = myComment;

            return this;
        }

        public Builder withPostByImgId(int postByImgId){
            this.postByImgId = postByImgId;

            return this;
        }

        public Builder withPostImgId(int postImgId){
            this.postImgId = postImgId;

            return this;
        }

        public NewsfeedItem build(){
            return new NewsfeedItem(viewType, postByImgId, postBy, date, postComment, postImgId,
                    sympathyCnt, commentCnt, shareCnt, myName, myComment);
        }
    }


}

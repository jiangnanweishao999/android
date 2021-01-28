package com.example.endhomework.model;


/**
 * 消息  data class
 */
public class Message {
    private String _id;
    private String feedurl;
    private String nickname;
    private String description;
    private long likecount;
    private String avatar;

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFeedurl(String feedurl) {
        this.feedurl = feedurl;
    }



    public void setLikecount(long likecount) {
        this.likecount = likecount;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public long getLikecount() {
        return likecount;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getDescription() {
        return description;
    }

    public String getFeedurl() {
        return feedurl;
    }

    public String getNickname() {
        return nickname;
    }
}

package com.david.buptcommunity.entity;

import java.util.Date;

public class DiscussPost {
    private int id;
    private Date createTime;
    private String content;
    private int userId;
    private String title;
    private int commentCount;
    private double score;
    private int type;
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "DiscussPost{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", content='" + content + '\'' +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", commentCount=" + commentCount +
                ", score=" + score +
                ", type=" + type +
                ", status=" + status +
                '}';
    }
}

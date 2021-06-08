package com.esprit.jardinenfant.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    Date createdAt;

    @Column
    Date editedAt;

    @Column
    Date deletedAt;

    @OneToOne(cascade = CascadeType.ALL)
    private PostHeader postHeader;

    @OneToOne(cascade = CascadeType.ALL)
    private PostBody postBody;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<PostAttachement> attachementsList;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<PostComment> commentsList;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<PostReaction> reactionsList;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<PostShare> sharesList;

    @ManyToOne
    private User user;

    public Post() {
    }

    public Post(int id) {
        this.id = id;
    }

    public Post(Date createdAt, Date editedAt, Date deletedAt, PostHeader postHeader, PostBody postBody, User user) {
        this.createdAt = createdAt;
        this.editedAt = editedAt;
        this.deletedAt = deletedAt;
        this.postHeader = postHeader;
        this.postBody = postBody;
        this.user = user;
    }

    public Post(int id, Date createdAt, Date editedAt, Date deletedAt, PostHeader postHeader, PostBody postBody, User user) {
        this.id = id;
        this.createdAt = createdAt;
        this.editedAt = editedAt;
        this.deletedAt = deletedAt;
        this.postHeader = postHeader;
        this.postBody = postBody;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getEditedAt() {
        return editedAt;
    }

    public void setEditedAt(Date editedAt) {
        this.editedAt = editedAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public PostHeader getPostHeader() {
        return postHeader;
    }

    public void setPostHeader(PostHeader postHeader) {
        this.postHeader = postHeader;
    }

    public PostBody getPostBody() {
        return postBody;
    }

    public void setPostBody(PostBody postBody) {
        this.postBody = postBody;
    }

    public List<PostAttachement> getAttachementsList() {
        return attachementsList;
    }

    public void setAttachementsList(List<PostAttachement> attachementsList) {
        this.attachementsList = attachementsList;
    }

    public List<PostComment> getCommentsList() {
        return commentsList;
    }

    public void setCommentsList(List<PostComment> commentsList) {
        this.commentsList = commentsList;
    }

    public List<PostReaction> getReactionsList() {
        return reactionsList;
    }

    public void setReactionsList(List<PostReaction> reactionsList) {
        this.reactionsList = reactionsList;
    }

    public List<PostShare> getSharesList() {
        return sharesList;
    }

    public void setSharesList(List<PostShare> sharesList) {
        this.sharesList = sharesList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", editedAt=" + editedAt +
                ", deletedAt=" + deletedAt +
                ", postHeader=" + postHeader.toString()+
                ", postBody=" + postBody.toString() +
//                ", attachementsList=" + attachementsList +
//                ", commentsList=" + commentsList +
//                ", reactionsList=" + reactionsList +
//                ", sharesList=" + sharesList +
                ", user=" + user +
                '}';
    }
}

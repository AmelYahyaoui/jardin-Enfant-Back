package com.esprit.jardinenfant.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String name;

    @Column
    String photo;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Post> postsList;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<PostComment> commentsList;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<PostShare> sharesList;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<PostReaction> reactionsList;

    public User() {
        super();
    }

    public User(String name, String photo) {
        this.name = name;
        this.photo = photo;
    }

    public User(int id, String name, String photo) {
        this.id = id;
        this.name = name;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public List<Post> getPostsList() {
        return postsList;
    }

    public void setPostsList(List<Post> postsList) {
        this.postsList = postsList;
    }

    public List<PostComment> getCommentsList() {
        return commentsList;
    }

    public void setCommentsList(List<PostComment> commentsList) {
        this.commentsList = commentsList;
    }

    public List<PostShare> getSharesList() {
        return sharesList;
    }

    public void setSharesList(List<PostShare> sharesList) {
        this.sharesList = sharesList;
    }

    public List<PostReaction> getReactionsList() {
        return reactionsList;
    }

    public void setReactionsList(List<PostReaction> reactionsList) {
        this.reactionsList = reactionsList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}

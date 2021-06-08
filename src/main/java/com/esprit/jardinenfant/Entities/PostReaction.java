package com.esprit.jardinenfant.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class PostReaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String content;

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private Post post;

    public PostReaction() {
    }

    public PostReaction(String content, User user, Post post) {
        this.content = content;
        this.user = user;
        this.post = post;
    }

    public PostReaction(int id, String content, User user, Post post) {
        this.id = id;
        this.content = content;
        this.user = user;
        this.post = post;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "PostReaction{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", user=" + user +
                ", post=" + post +
                '}';
    }
}

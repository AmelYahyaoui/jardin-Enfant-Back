package com.esprit.jardinenfant.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
public class PostHeader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String subject;

    @Column
    String category;

    @OneToOne (mappedBy = "postHeader", cascade = CascadeType.ALL)
    @JsonIgnore
    private Post post;

    public PostHeader() {
    }

    public PostHeader(String subject, String category) {
        this.subject = subject;
        this.category = category;
    }

    public PostHeader(int id, String subject, String category) {
        this.id = id;
        this.subject = subject;
        this.category = category;
    }

    public int getId() {
        return id;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "PostHeader{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", category='" + category + '\'' +
//                ", post=" + post.toString() +
                '}';
    }


}

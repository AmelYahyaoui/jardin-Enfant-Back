package com.esprit.jardinenfant.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

import static org.hibernate.annotations.CascadeType.ALL;
import static org.hibernate.annotations.CascadeType.REMOVE;

@Entity
public class PostBody {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String content;

    @OneToOne (mappedBy = "postBody", cascade = CascadeType.ALL)
    @JsonIgnore
    private Post post;

    public PostBody() {
    }

    public PostBody(String content) {
        this.content = content;
    }

    public PostBody(int id, String content) {
        this.id = id;
        this.content = content;
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

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "PostBody{" +
                "id=" + id +
                ", content='" + content + '\'' +
//                ", post=" + post +
                '}';
    }
}

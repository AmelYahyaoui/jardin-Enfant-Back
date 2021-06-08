package com.esprit.jardinenfant.Entities;

import javax.persistence.*;

@Entity
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String Object;

    @Column
    String Body;

    public Feedback() {
    }

    public Feedback(String object, String body) {
        Object = object;
        Body = body;
    }

    public Feedback(int id, String object, String body) {
        this.id = id;
        Object = object;
        Body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObject() {
        return Object;
    }

    public void setObject(String object) {
        Object = object;
    }

    public String getBody() {
        return Body;
    }

    public void setBody(String body) {
        Body = body;
    }
}

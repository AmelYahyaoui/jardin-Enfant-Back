package com.esprit.jardinenfant.Entities;

import javax.persistence.*;

@Entity
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String objetNotif;

    @Column
    Boolean status;

    public Notification() {
    }

    public Notification(String objetNotif, Boolean status) {
        this.objetNotif = objetNotif;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getObjetNotif() {
        return objetNotif;
    }

    public void setObjetNotif(String objetNotif) {
        this.objetNotif = objetNotif;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}

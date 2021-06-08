package com.esprit.jardinenfant.Services;

import com.esprit.jardinenfant.Entities.Notification;

import java.util.List;

public interface NotificationService {


    Notification save(Notification notif);

//    void deleteAllNotif();

    Notification update(Integer id);

    void delete(Integer id);

    List<Notification> findAll();
}

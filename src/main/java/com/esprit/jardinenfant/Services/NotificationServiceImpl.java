package com.esprit.jardinenfant.Services;


import com.esprit.jardinenfant.Entities.Notification;
import com.esprit.jardinenfant.Repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Service
public class NotificationServiceImpl implements NotificationService{
    @Autowired
    NotificationRepository notificationRepository;

    @Override
    public Notification save(Notification notif) {
        return notificationRepository.save(notif);
    }

    @Override
    public Notification update(Integer id){
        Notification oldNotif = notificationRepository.getOne(id);
        oldNotif.setStatus(false);
        return notificationRepository.save(oldNotif);
    }

    @Override
    public void delete(Integer id){
        notificationRepository.deleteById(id);
    }

    @Override
    public List<Notification> findAll() {
        return notificationRepository.findAll();
    }
}

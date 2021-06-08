package com.esprit.jardinenfant.Repositories;

import com.esprit.jardinenfant.Entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository  extends JpaRepository<Notification, Integer> {
}

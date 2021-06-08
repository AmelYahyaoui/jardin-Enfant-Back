package com.esprit.jardinenfant.Controllers;

import com.esprit.jardinenfant.Entities.Notification;
import com.esprit.jardinenfant.Entities.Post;
import com.esprit.jardinenfant.Services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;


@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    NotificationService notificationService;


    @CrossOrigin(origins = "*")
    @RequestMapping(value="/addNotif", method = RequestMethod.POST)
    public Notification saveNotification(@RequestBody Notification notification) throws SQLIntegrityConstraintViolationException {
        System.out.println(notification);
        return notificationService.save(notification);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value="/updateNotif/{id}", method = RequestMethod.PUT)
    public Notification updateNotification(@PathVariable(value = "id") int id) {
        System.out.println(id);
        return notificationService.update(id);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value="/findAllNotif", method = RequestMethod.GET)
    public List<Notification> findAllNotification() {
        return notificationService.findAll();
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value="/deleteNotif/{id}", method = RequestMethod.DELETE)
    public Notification deleteNotification(@PathVariable(value = "id") int id) {
        System.out.println(id);
        return notificationService.update(id);
    }

}

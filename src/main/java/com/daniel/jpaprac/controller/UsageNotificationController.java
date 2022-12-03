package com.daniel.jpaprac.controller;


import com.daniel.jpaprac.entity.UsageNotification;
import com.daniel.jpaprac.service.UsageNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usage")
public class UsageNotificationController {


    @Autowired
    UsageNotificationService usageNotificationService;

    @GetMapping("/usage-list")
    public ResponseEntity<List<UsageNotification>> getUsageNotification() {
        return (ResponseEntity<List<UsageNotification>>) usageNotificationService.getUsageNotification();
    }

}

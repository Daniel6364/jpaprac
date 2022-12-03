package com.daniel.jpaprac.component;

import com.daniel.jpaprac.entity.UsageNotification;
import com.daniel.jpaprac.repository.UsageNotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsageNotificationComponent {

    @Autowired
    UsageNotificationRepository usageNotificationRepository;
    public List<UsageNotification> getUsageNotification() {
        return usageNotificationRepository.findAll();
    }
}

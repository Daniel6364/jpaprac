package com.daniel.jpaprac.service;

import com.daniel.jpaprac.component.UsageNotificationComponent;
import com.daniel.jpaprac.entity.UsageNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsageNotificationService {

    @Autowired
    UsageNotificationComponent usageNotificationComponent;
    public List<UsageNotification> getUsageNotification() {
        return usageNotificationComponent.getUsageNotification();
    }
}

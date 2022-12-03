package com.daniel.jpaprac.service;

import com.daniel.jpaprac.component.UsageNotificationComponent;
import com.daniel.jpaprac.entity.UsageNotification;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsageNotificationServiceTest {

    @Autowired
    UsageNotificationComponent usageNotificationComponent;

    @Test
    public void getUsageNotification() {
        List<UsageNotification> result = usageNotificationComponent.getUsageNotification();
        System.out.println(result);
    }
}
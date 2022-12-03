package com.daniel.jpaprac.repository;

import com.daniel.jpaprac.entity.UsageNotification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsageNotificationRepository extends JpaRepository<UsageNotification, Long> {
}

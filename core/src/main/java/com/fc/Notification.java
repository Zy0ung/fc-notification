package com.fc;

import java.time.Instant;

enum NotificationType {
    LIKE,
    COMMENT,
    FOLLOW,
}

public class Notification {
    /**
     * 알림 id
     */
    public String id;
    /**
     * 알림 유저 id
     */
    public Long userId;
    /**
     * 알림 타입
     */
    public NotificationType type;
    /**
     * 생성 시간
     */
    public Instant createdAt;
    /**
     * 삭제 될 시간(TTL)
     */
    public Instant deleteAt;

    public Notification(String id, Long userId, NotificationType type, Instant createdAt, Instant deleteAt) {
        this.id = id;
        this.userId = userId;
        this.type = type;
        this.createdAt = createdAt;
        this.deleteAt = deleteAt;
    }
}
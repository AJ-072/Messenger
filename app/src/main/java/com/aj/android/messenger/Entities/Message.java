package com.aj.android.messenger.Entities;

public class Message {
    private String user;
    private String message;
    private long time;

    public Message(String user, String message) {
        this.user = user;
        this.message = message;
        this.time = System.currentTimeMillis();
    }

    public String getUser() {
        return user;
    }

    public String getMessage() {
        return message;
    }

    public long getTime() {
        return time;
    }
}

package com.aj.android.messenger.Entities;

public class ChatUserItem {
    private String lastMessage;
    private String name;
    private long time;
    private int count;

    public ChatUserItem(String lastMessage, String name, long time, int count) {
        this.lastMessage = lastMessage;
        this.name = name;
        this.time = time;
        this.count = count;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }
}

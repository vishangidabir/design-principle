package com.bridgelaz;

public class Subscriber {
    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    public void update() {
        System.out.println("Hey " + name + ", video Uploaded");
    }

    public void subscribeChannel(Channel channel) {
        this.channel = channel;
    }
}


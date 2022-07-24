package com.bridgelaz;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Subscriber> subscriberList = new ArrayList<>();
    private String title;

    public void subscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    public void unSubscriber(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscriberList) {
            subscriber.update();
        }
    }

    public void upload(String title) {
        this.title = title;
        notifySubscribers();
    }
}

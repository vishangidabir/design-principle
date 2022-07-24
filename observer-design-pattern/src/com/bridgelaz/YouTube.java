package com.bridgelaz;

public class YouTube {
    public static void main(String[] args) {
        Channel telusko = new Channel();
        Subscriber subscriber1 = new Subscriber("Swapnil");
        Subscriber subscriber2 = new Subscriber("Shubham");
        Subscriber subscriber3 = new Subscriber("Kunal");
        Subscriber subscriber4 = new Subscriber("Niraj");

        telusko.subscriber(subscriber1);
        telusko.subscriber(subscriber2);
        telusko.subscriber(subscriber3);
        telusko.subscriber(subscriber4);

        telusko.unSubscriber(subscriber3);

        subscriber1.subscribeChannel(telusko);
        subscriber2.subscribeChannel(telusko);
        subscriber3.subscribeChannel(telusko);
        subscriber4.subscribeChannel(telusko);

        telusko.upload("How to learn Programming ?");
    }
}

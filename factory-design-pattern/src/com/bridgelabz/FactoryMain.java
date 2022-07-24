package com.bridgelabz;

public class FactoryMain {
    public static void main(String [] args) {
        OperatingSystemFactory ops = new OperatingSystemFactory();
        //OS os = new Android();
        OS os = ops.getInstance("Open");
        os.spec();
    }
}

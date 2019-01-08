package com.lti.thread.practice;

public class ThreadJob {

    public static void main(String[] args) {

        MyThread myThread=new MyThread();
        myThread.start();
        for(int i=0; i<10; i++) {
            System.out.println("Main Thread");
            Thread.yield();
        }
    }

}

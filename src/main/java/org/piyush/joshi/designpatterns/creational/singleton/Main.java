package org.piyush.joshi.designpatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonDemo obj = SingletonDemo.getInstance();
                System.out.println("object from thread1 ->" + obj);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonDemo obj = SingletonDemo.getInstance();
                System.out.println("object from thread2 ->" + obj);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonDemo obj = SingletonDemo.getInstance();
                System.out.println("object from thread3 ->" + obj);
            }
        }).start();

    }
}
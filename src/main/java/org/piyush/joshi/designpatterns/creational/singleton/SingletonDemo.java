package org.piyush.joshi.designpatterns.creational.singleton;

public final class SingletonDemo {

    static volatile SingletonDemo instance = null;

    private SingletonDemo() {

    }

    public static synchronized SingletonDemo getInstance() {
        if (instance == null) {
            synchronized(SingletonDemo.class) {
                if(instance == null){
                    instance = new SingletonDemo();
                }
            }
        }
        return instance;
    }
}

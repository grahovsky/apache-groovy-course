package com.therealdanvega.service;

public interface IPersonService {

    // in Java8 default implementation interface method
    default public void doSomething(){
        System.out.println("doing something...");
    }

}

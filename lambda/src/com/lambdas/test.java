package com.lambdas;

public class test {

    static Runnable helloWorld = () -> System.out.println("Hello, World!");


    public static void main(String[] args) {
       // greetingFunction = () -> System.out.println("Hello Dog");
        helloWorld.run();
    }
}

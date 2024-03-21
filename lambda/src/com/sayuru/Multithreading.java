package com.sayuru;

import java.io.IOException;
import java.nio.CharBuffer;

public class Multithreading extends Thread{
    private int threadNo;

    public Multithreading(int threadNo){
        this.threadNo= threadNo;
    }



    @Override
    public void run(){
        if(threadNo==3){



        }
        for(int i=0;i<6;i++){
            System.out.println(i+" from thread "+threadNo);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

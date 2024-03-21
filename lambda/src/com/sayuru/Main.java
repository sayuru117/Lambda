package com.sayuru;



public class Main {

    public static void main(String[] args) {
       new Thread(()-> System.out.println("printing from the Runnable")).start();



    }


}



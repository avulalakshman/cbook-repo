package com.heraizen.cj;
public class App {
    public String getGreeting(String name) {
        return "Hello : "+name +"how are you?";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}

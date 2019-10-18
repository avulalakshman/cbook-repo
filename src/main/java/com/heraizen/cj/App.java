package com.heraizen.cj;
public class App {
    public String getGreeting(String name) {
        
        return new StringBuilder(name).append(" how are you?").toString();
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting(args[0]));
    }
}

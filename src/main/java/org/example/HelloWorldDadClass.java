package org.example;

public class HelloWorldDadClass implements IHelloWorld {
    @Override
    public int GetMessage() {
        return 10010;
    }

    @Override
    public void SendMessage(String message) {

        System.out.println( message + "Hello Dad Of World!" );
    }
}

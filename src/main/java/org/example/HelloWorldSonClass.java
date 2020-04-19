package org.example;

public class HelloWorldSonClass implements IHelloWorld {
    @Override
    public int GetMessage() {
        return 10010;
    }

    @Override
    public void SendMessage(String message) {

        System.out.println( message + "Hello Son Of World!" );
    }
}

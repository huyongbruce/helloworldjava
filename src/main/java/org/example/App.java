package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        IHelloWorld t = new HelloWorldDadClass();
        t.SendMessage("My name is Dad!!");
        t = new HelloWorldSonClass();
        t.SendMessage("My name is Son!!");

        HelloWorldGrantSonClass h = new HelloWorldGrantSonClass();
        t.SendMessage(h.GrantSonMessage());

    }
}

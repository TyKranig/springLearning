package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
        LocalTime date = new LocalTime();
        System.out.println("The current time is " + date);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
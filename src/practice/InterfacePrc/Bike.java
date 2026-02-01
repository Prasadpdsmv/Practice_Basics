package practice.InterfacePrc;

// Bike.java
public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bike has stopped.");
    }

}
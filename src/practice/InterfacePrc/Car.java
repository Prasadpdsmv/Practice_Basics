package practice.InterfacePrc;

// Car.java
public class Car implements Vehicle,AnanymousPrc {

    public void start() {
        System.out.println("Car is starting...");
    }


    public void stop() {
        System.out.println("Car has stopped.");
    }

    public void engine(){
        System.out.println("this is car engine");
    }

    public void forAnanymousClass() {
        System.out.println("this for anonymous");
    }
}
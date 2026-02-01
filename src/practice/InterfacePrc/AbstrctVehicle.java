package practice.InterfacePrc;

public abstract class AbstrctVehicle {


        int speed=0;

        // abstract method
        abstract void start();

        // concrete method
        void stop() {
            System.out.println("Vehicle stopped"+speed);
        }


}

package practice.InterfacePrc;

// InterfaceDemo.java
public class InterfaceDemo {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
        myCar.stop();
       // myCar.engine();  //we can't declare like this   insted ((Car)myCar).engine()
        Vehicle myBike = new Bike();
        myBike.start();
        myBike.stop();
        Vehicle myCar2=myCar;

        AnanymousPrc obj = new AnanymousPrc() {      // we have not implemented this method in child so we directly creating ananymous class
            @Override
            public void forAnanymousClass() {
                System.out.println("this inside ananymous class");
            }
        };
        //obj.forAnanymousClass();


        // functional interface and lamda expression
        /*PrcFunctionalInterface objInter=new PrcFunctionalInterface() {
            @Override
            public void show(int i) {
                System.out.println("show the value"+ 5);
            }
        };*/
        PrcFunctionalInterface objInter= (i) -> System.out.println("show the value"+ i);


        objInter.show(5);

    }
}
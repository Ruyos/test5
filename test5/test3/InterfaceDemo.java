package test3;

 class Bike {
    public void start() {
        System.out.println("Bike start");
    }
    public void stop() {
        System.out.println("Bike stop");
    }
}
class Bus {
    public void start() {
        System.out.println("Bus start");
    }
    public void stop() {
        System.out.println("Bus stop");
    }
}
public class InterfaceDemo{
public static void main(String[] args) {
    Bike bike = new Bike();
    bike.start();
    bike.stop();
    Bus bus = new Bus();
    bus.start();
    bus.stop();
   }
 }

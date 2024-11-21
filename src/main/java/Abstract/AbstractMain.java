package Abstract;

abstract class Device {
    abstract void start();
}

class Smartphone extends Device {
    @Override
    void start() {
        System.out.println("Smartphone is starting with a welcome screen.");
    }
}

class Laptop extends Device {
    @Override
    void start() {
        System.out.println("Laptop is booting up with a logo.");
    }
}

public class AbstractMain {
    public static void main(String[] args) {
        Device smartphone = new Smartphone();
        Device laptop = new Laptop();

        smartphone.start();
        laptop.start();
    }
}

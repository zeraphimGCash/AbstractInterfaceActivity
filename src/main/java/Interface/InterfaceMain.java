package Interface;

interface Device {
    void start();
}

class Smartphone implements Device {
    @Override
    public void start() {
        System.out.println("Smartphone is starting with a welcome screen.");
    }
}

class Laptop implements Device {
    @Override
    public void start() {
        System.out.println("Laptop is booting up with a logo.");
    }
}

public class InterfaceMain {
    public static void main(String[] args) {
        Device smartphone = new Smartphone();
        Device laptop = new Laptop();

        smartphone.start();
        laptop.start();
    }
}

package Ss10Rikke;

public class Car {
    int currentSpeed = 0;

    public void accelerate() {
        currentSpeed += 10;
        System.out.println("Car accelerates by default: +10 km/h");
    }

    public void accelerate(int speed) {
        currentSpeed += speed;
        System.out.println("Car accelerates by " + speed + " km/h");
    }

    public void accelerate(int speed, int seconds) {
        int increase = speed * seconds;
        currentSpeed += increase;
        System.out.println("Car accelerates " + increase + " km/h (speed x time)");
    }
    public void printStatus() {
        System.out.println("Current speed: " + currentSpeed + " km/h");
    }

    public static void main(String[] args) {
        Car c = new Car();

        c.accelerate();
        c.printStatus();
        System.out.println();
        c.accelerate(20);
        c.printStatus();
        System.out.println();
        c.accelerate(5,4);
        c.printStatus();
    }
}

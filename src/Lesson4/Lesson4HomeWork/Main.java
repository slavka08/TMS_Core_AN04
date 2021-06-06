package Lesson4.Lesson4HomeWork;

import Lesson4.Lesson4HomeWork.Classes.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(55);
        car.setModel("vaz2101");
        car.turnOn();
        car.driveToDestination();

        System.out.println();

        car.addFuel(11);

        System.out.println();

        car.turnOn();
        car.driveToDestination();
        car.turnOff();

        System.out.println();

        car.printCarInfo();
        car.driveToDestination();
        car.printCarInfo();

        System.out.println();

        car.turnOn();
        car.driveToDestination();
        car.printCarInfo();

        System.out.println();

        //тут заканчивается бензин
        car.driveToDestination();

        System.out.println();

        car.turnOn();

        System.out.println();

        car.turnOff();
    }
}

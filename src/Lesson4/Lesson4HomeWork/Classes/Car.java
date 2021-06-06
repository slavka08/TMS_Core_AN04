package Lesson4.Lesson4HomeWork.Classes;

import Lesson4.Lesson4HomeWork.Classes.CarParts.Engine;

//для упрощения объем и пробеги будем считать целым
public class Car extends Engine {
    private int odo;
    private String model;

    public Car(int maxCapacity) {
        super(maxCapacity, "zzxxtt");
        odo = 0;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void driveToDestination() {
        if (getEngineStatus()) {
            System.out.println("CAR: car running... arrived at destination");
            odo += 20;
            carUseEngine();

        } else {
            System.out.println("CAR: cant move without started engine");
        }
    }

    public void printCarInfo() {
        System.out.println("model: " + model + " odo: " + odo + "km" + " engine: " + getEngineType() + " fuel: " + getCurrentFuelCapacity() + "L");
    }

    public void turnOn(){
        super.startEngine();
    }

    public void turnOff(){
        stopEngine();
    }
}

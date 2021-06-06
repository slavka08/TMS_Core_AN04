package Lesson4.Lesson4HomeWork.Classes.CarParts;

public class FuelTank {
    private int maxCapacity;
    private int currentCapacity;

    FuelTank(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    protected void setCurrentFuelCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public int getCurrentFuelCapacity() {
        return currentCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void addFuel(int value) {
        currentCapacity += value;
        if (currentCapacity > maxCapacity) {
            currentCapacity = maxCapacity;
        }
        System.out.println("FUEL TANK: fuel added: " + value+"L");
        System.out.println("FUEL TANK: current fuel: " + currentCapacity+"L");
    }
}

package Lesson4.Lesson4HomeWork.Classes.CarParts;

public class Engine extends FuelTank {
    private String engineName;
    private boolean status;

    public Engine(int maxCapacity, String engineName) {
        super(maxCapacity);
        status = false;
        this.engineName = engineName;
    }

    @Override
    protected void setCurrentFuelCapacity(int currentCapacity) {
        super.setCurrentFuelCapacity(currentCapacity);
        if (getCurrentFuelCapacity() <= 0) {
            if (status) {
                System.out.println("WARNING low fuel");
                stopEngine();
            }
        }
    }

    protected void carUseEngine() {
        setCurrentFuelCapacity(getCurrentFuelCapacity() - 5);
    }

    public String getEngineType() {
        return engineName;
    }

    public boolean getEngineStatus() {
        return status;
    }

    protected void startEngine() {
        if (getCurrentFuelCapacity() > 0) {
            if (status) {
                System.out.println("ENGINE: engine already started");
            } else {
                System.out.println("ENGINE: starting engine...");
                System.out.println("ENGINE: ready to go");
                status = true;
            }
        } else {
            System.out.println("ENGINE: cant start engine, need fuel");
            status = false;
        }
    }

    protected void stopEngine() {
        if (status) {
            System.out.println("ENGINE: engine stopped");
            status = false;
        } else {
            System.out.println("ENGINE: already engine stopped");
        }
    }
}

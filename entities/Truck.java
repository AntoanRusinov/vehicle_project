package polymorphism.exercises.vehicles_extended.entities;

public class Truck extends polymorphism.exercises.vehicles_extended.entities.Vehicle {

    public Truck(double fuelReserve, double fuelConsumption, double tankCapacity) {
        super(fuelReserve, fuelConsumption, tankCapacity);
    }

    @Override
    public void refuel(double quantity) {
        // .... specific for Truck
    }


}

package polymorphism.exercises.vehicles_extended.entities;


public class Car extends polymorphism.exercises.vehicles_extended.entities.Vehicle {

    public Car(double fuelReserve, double fuelConsumption, double tankCapacity) {
        super(fuelReserve, fuelConsumption, tankCapacity);
    }

    @Override
    public void refuel(double quantity) {
        // TODO: this method is specific for car ONLY
    }

}
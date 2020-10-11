package polymorphism.exercises.vehicles_extended.entities;

import polymorphism.exercises.vehicles_extended.enums.BusMode;
import polymorphism.exercises.vehicles_extended.utils.Validator;

public class Bus extends polymorphism.exercises.vehicles_extended.entities.Vehicle {

    private BusMode busMode;

    public Bus(double fuelReserve, double fuelConsumption, double tankCapacity) {
        super(fuelReserve, fuelConsumption, tankCapacity);
        this.busMode = BusMode.FULL;
    }

    @Override
    public void refuel(double quantity) {
        // TODO: this refuel method is ONLY FOR Bus
    }


}
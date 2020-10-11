package polymorphism.exercises.vehicles_extended.entities;

import polymorphism.exercises.vehicles_extended.enums.AirConditionerMode;

public abstract class Vehicle {
    private final String VEHICLE_TYPE;
    private final Double TANK_CAPACITY;
    private final Double FUEL_CONSUMPTION;
    private Double fuelReserve;
    private AirConditionerMode airConditionerMode;

    public Vehicle(double fuelReserve, double fuelConsumption, double tankCapacity) {
        this.VEHICLE_TYPE = this.getClass().getSimpleName();
        this.FUEL_CONSUMPTION = fuelConsumption;
        this.TANK_CAPACITY = tankCapacity;
        this.fuelReserve = fuelReserve;
        this.airConditionerMode = AirConditionerMode.ON;
    }

    public void drive(Vehicle vehicle, double distance) {
        // TODO: implement. All vehicles like CAr, Bus, Truck use the same method!
    }

    public void switchAirConditionerMode() {
        if (this.getAirConditionerMode().equals(AirConditionerMode.ON)) {
//            this.setAirConditionerMode(AirConditionerMode.OFF);

//            airConditionerMode = AirConditionerMode.OFF;

            this.airConditionerMode = AirConditionerMode.OFF;

        } else {
//            this.setAirConditionerMode(AirConditionerMode.ON);
            airConditionerMode = AirConditionerMode.ON;
        }
    }

    public abstract void refuel(double quantity);

    public AirConditionerMode getAirConditionerMode() {
        return this.airConditionerMode;
    }

    public void setAirConditionerMode(AirConditionerMode airConditionerMode) {
        this.airConditionerMode = airConditionerMode;
    }

    public String getVehicleType() {
        return this.VEHICLE_TYPE;
    }

    public double getTankCapacity() {
        return this.TANK_CAPACITY;
    }

    public double getFuelReserve() {
        return this.fuelReserve;
    }

    public void setFuelReserve(double fuelReserve) {
        this.fuelReserve = fuelReserve;
    }

    public double getFuelConsumption() {
        return this.FUEL_CONSUMPTION;
    }

    public String getFuelReport() {
        return String.format("%s: %.2f", this.VEHICLE_TYPE, this.fuelReserve);
    }



}

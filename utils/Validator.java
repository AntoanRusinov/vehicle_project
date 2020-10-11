package polymorphism.exercises.vehicles_extended.utils;

public class Validator {

    public static boolean validateRefuelQuantity(double availableFuel, double tankCapacity, double quantity) {

        if (quantity <= 0) {
            polymorphism.exercises.vehicles_extended.utils.Report.invalidRefuelQuantity();
            return false;
        } else if (quantity + availableFuel > tankCapacity) {
            polymorphism.exercises.vehicles_extended.utils.Report.notEnoughTankCapacity();
            return false;
        } else {
            return true;
        }
    }

}

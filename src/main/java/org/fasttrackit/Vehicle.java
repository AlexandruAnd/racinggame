package org.fasttrackit;

public class Vehicle {
    // class variable
    static int totalCount;

    //    instance varables
    String name;
    String color;
    double mileage;
    double maxSpeed;
    double fuelLevel;
    double travelDistance;
    boolean running;

    public Vehicle() {
        totalCount++;
    }

    //    semnatura metodei
    public double accelerate(double speed, double durationInHours){

        double milageMultiplier = 1;

        System.out.println(name + " is accelerating with: " + speed + " for " + durationInHours + " h.");

        if (speed > maxSpeed) {
            System.out.println("Sorry. Maximum speed exceeded");
            return 0;
        }
        else if (speed == maxSpeed){
            System.out.println("Careful! Max Speed reached");
        }
        else {
            System.out.println("Valid speed entered!");
        }
        if (fuelLevel <= 0){
            System.out.println("You don't have enough fuel");
            return 0;
                    }

        if (speed > 120) {
            System.out.println("Going fast...you'll use more fuel");
//            inceasing mileage multiplier with percenteage of acceleration speed
            milageMultiplier = speed/100;


        }

// local variabile, (declared inside a method)
        double distance = speed * durationInHours;

        travelDistance = travelDistance + distance;
//        same resulte as the statment above
//        travelDistance += distance;
        System.out.println(" Total travel distance: "+ travelDistance);

        double usedFuelWithStandardMileage = distance * mileage / 100;

        System.out.println(" Used fuel With Standard Milage: " + usedFuelWithStandardMileage);

        double userdFuelWithCurrentMileage = usedFuelWithStandardMileage * milageMultiplier;
        System.out.println("Used fuel with current mileage:" + userdFuelWithCurrentMileage);

        fuelLevel -= userdFuelWithCurrentMileage;
//        ++ si --

        System.out.println(" Remaining fule level: " + fuelLevel);

        return distance;

    }

}

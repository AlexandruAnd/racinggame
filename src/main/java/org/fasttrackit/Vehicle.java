package org.fasttrackit;

public class Vehicle {

    //    instance varables
    String name;
    String color;
    double mileage;
    double maxSpeed;
    double fuelLevel;
    double travelDistance;
    boolean running;

//    semnatura metodei
    public double accelerate(double speed, double durationInHours){
        System.out.println(name + " is accelerating with: " + speed + " for " + durationInHours + " h.");
// local variabile, (declared inside a method)
        double distance = speed * durationInHours;

        travelDistance = travelDistance + distance;
//        same resulte as the statment above
//        travelDistance += distance;
        System.out.println(" Total travel distance: "+ travelDistance);

        double usedFuel = distance * mileage / 100;

        System.out.println(" Used fuel: " + usedFuel);

        fuelLevel -= usedFuel;
//        ++ si --

        System.out.println(" Remaining fule level: " + fuelLevel);

        return distance;

    }

}

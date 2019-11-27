package org.fasttrackit;

public class Mechanic {

    public void repairVehicle(Vehicle vehicle){
        System.out.println(" Reparing vehicle " + vehicle.getName());
        vehicle.setTravelDistance(0);



    }
}

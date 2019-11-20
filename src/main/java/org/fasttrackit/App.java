package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( " Welcome to the Reacing Game!" );

       Car carReference = new Car();
       carReference.name = "Dacia";
       carReference.color = "red";
       carReference.mileage = 9.8;
       carReference.fuelLevel = 60;
       carReference.maxSpeed = 200;
       carReference.running = false;
       carReference.doorCount = 2;

       Engine carEngine = new Engine();
       carEngine.manufacturer = "Renault";
       carEngine.capacity = 1.5;

       carReference.engine = carEngine;
        System.out.println("Engine details...");
        System.out.println(carReference.engine.manufacturer);
        System.out.println(carReference.engine.capacity);

        double accelationDistance = carReference.accelerate(60,1);

        System.out.println(" Acceleration distance: " + accelationDistance);

        Mechanic mechanic = new Mechanic();
        mechanic.repairVehicle(carReference);

        System.out.println(" Total travel distance after repair :" + carReference.travelDistance);


       Car car2 = new Car();
       car2.name = "BMW";
       car2.mileage = 14;
       car2.color = null;

// cancatenation
        System.out.println(carReference);
        System.out.println("First car name: " + carReference.name);
        System.out.println(carReference.color);
        System.out.println(carReference.mileage);
        System.out.println(carReference.fuelLevel);
        System.out.println(carReference.maxSpeed);
        System.out.println(carReference.maxSpeed);
        System.out.println(carReference.running);
        System.out.println(carReference.travelDistance);

        System.out.println("Second car name: " + car2.name);
        System.out.println(car2.color);
        System.out.println(car2.mileage);
        System.out.println(car2.fuelLevel);
        System.out.println(car2.maxSpeed);
        System.out.println(car2.maxSpeed);
        System.out.println(car2.running);
        System.out.println(car2.travelDistance);

        car2.name = "VW";
        System.out.println(car2.name);

        Car car3 = car2;
        car3.name = "Audi";
        System.out.println("Car2 name: " + car2.name);
        System.out.println("Car3 name: " + car3.name);

// exemple for NullPointerExemption
//        Car car4 = null;
//        System.out.println(car4.name);

    }
}

package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {

//        Engine engine = new Engine();
//        engine.manufacturer = "VW";

        System.out.println( " Welcome to the Reacing Game!" );

        Game game = new Game();
        game.start();

        // *****

// method implamentetion taken from object class not from variable's class**********

//        Vehicle joker = new JokerVehicle();
//        joker.setName("Joker");
//        joker.setFuelLevel(80);
//
//        joker.accelerate(60,1);
//        System.out.println("Jokers total distance: " + joker.getTravelDistance());
//
//        //variable's class determines war methods can be invoked
//        // type casting :
//        ((JokerVehicle) joker).fly();
//
//        Car carWithDefaultEngine = new Car();
//
//        Engine carEngine = new Engine();
//        carEngine.manufacturer = "Renault";
//        carEngine.capacity = 1.5;
//
//       Car carReference = new Car(carEngine);
//
//       carReference.setName("Dacia");
//       carReference.setColor("red");
//       carReference.setMileage(9.8);
//       carReference.setFuelLevel(60);
//       carReference.setMaxSpeed(200);
//       carReference.isRunning();
//       carReference.doorCount = 2;
//
//
//
//
//        System.out.println("Engine details...");
//        System.out.println("Engine is: " + carReference.engine.manufacturer);
//        System.out.println("Capacity is: " + carReference.engine.capacity);
//
//        double accelationDistance = carReference.accelerate(200,1);
//
//        System.out.println(" Acceleration distance: " + accelationDistance);
//        double accelationDistance1 = carReference.accelerate(120,1);
//
//        Mechanic mechanic = new Mechanic();
//        mechanic.repairVehicle(carReference);
//
//        System.out.println(" Total travel distance after repair :" + carReference.getTravelDistance());
//
//        Engine car2Engine = new Engine();
//        car2Engine.manufacturer = "Bavaria Motors";
//        car2Engine.capacity = 2;
//
//       Car car2 = new Car(car2Engine);
//       car2.setName("BMW");
//       car2.setMileage(14);
//       car2.setColor(null);
//
//// cancatenation
//        System.out.println(carReference);
//        System.out.println("First car name: " + carReference.getName());
//        System.out.println(carReference.getColor());
//        System.out.println(carReference.getMileage());
//        System.out.println(carReference.getFuelLevel());
//        System.out.println(carReference.getMaxSpeed());
//        System.out.println(carReference.getMaxSpeed());
//        System.out.println(carReference.isRunning());
//        System.out.println(carReference.getTravelDistance());
//
//        System.out.println("Second car name: " + car2.getName());
//        System.out.println(car2.getColor());
//        System.out.println(car2.getMileage());
//        System.out.println(car2.getFuelLevel());
//        System.out.println(car2.getMaxSpeed());
//        System.out.println(car2.getMaxSpeed());
//        System.out.println(car2.isRunning());
//        System.out.println(car2.getTravelDistance());
//
//        car2.setName("VW");
//        System.out.println(car2.getName());
//
//        Car car3 = car2;
//        car3.setName("Audi");
//        System.out.println("Car2 name: " + car2.getName());
//        System.out.println("Car3 name: " + car3.getName());
//
//// exemple for NullPointerExemption
////        Car car4 = null;
////        System.out.println(car4.name);
//
////        System.out.println(" Modulo example :");
////        System.out.println(4 % 2);
////        System.out.println(4 % 3);
////        System.out.println(4 % 2 == 0);
//
//        System.out.println(" Studying class variables(static variable..)");
//        Vehicle vehicle1 = new Vehicle();
//        vehicle1.totalCount =10;
//
//        Vehicle vehicle2 = new Vehicle();
//        vehicle2.totalCount = 20;
//        Vehicle.totalCount = 30;
//
//        System.out.println("Total vehicle count vechicle:1 " + vehicle1.totalCount);
//        System.out.println("Total vehicle count vechicle2: " + vehicle2.totalCount);
//        System.out.println("Total vehicle count Vechicle class : " + Vehicle.totalCount);


    }
}

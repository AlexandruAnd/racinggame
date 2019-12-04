package org.fasttrackit;

public class Vehicle {
    // class variable
    static int totalCount;

    //    instance varables
   private String name;
   private String color;
   private double mileage;
   private double maxSpeed;
   private double fuelLevel;
   private double travelDistance;
   private boolean running;

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
    // co-variant return type
    public Vehicle clone () {
        return new Vehicle();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTravelDistance() {
        return travelDistance;
    }

    public void setTravelDistance(double travelDistance) {
        this.travelDistance = travelDistance;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
// suprascrierea la sfarsitul clasei
    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                ", maxSpeed=" + maxSpeed +
                ", fuelLevel=" + fuelLevel +
                ", travelDistance=" + travelDistance +
                ", running=" + running +
                '}';
    }

}

package org.fasttrackit;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Game {

    public void start(){
        System.out.println("Starting Game...");
        int playerCount = getPlayerCountFromUser();
        System.out.println("Number of players:"+ getPlayerCountFromUser());

        String vehicleName = getVehicleNameFromUser();

        System.out.println("Name from user: " + getVehicleNameFromUser());
    }

    private String getVehicleNameFromUser(){
        System.out.println("Please enter vehicle name.");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        return scanner.nextLine();

    }

    private int getPlayerCountFromUser(){
        System.out.println("Please enter vehicle count.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();


    }
}

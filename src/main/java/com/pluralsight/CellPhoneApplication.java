package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        // New cell phone object and scanner
        CellPhone myCellPhone = new CellPhone();
        Scanner infoScanner = new Scanner(System.in);

        // Prompts for user info and stores with getters
        System.out.println("What is the serial number?");
        myCellPhone.setSerialNumber(infoScanner.nextInt());
        infoScanner.nextLine();

        System.out.println("What model is the phone?");
        myCellPhone.setModel(infoScanner.nextLine());

        System.out.println("Who is the carrier?");
        myCellPhone.setCarrier(infoScanner.nextLine());

        System.out.println("What is the phone number?");
        myCellPhone.setPhoneNumber(infoScanner.nextLine());

        System.out.println("Who is the owner of the phone?");
        myCellPhone.setOwner(infoScanner.nextLine());


        // Prints user info using setters
        System.out.println("Serial number: " + myCellPhone.getSerialNumber());
        System.out.println("Model: "+ myCellPhone.getModel());
        System.out.println("Carrier: "+ myCellPhone.getCarrier());
        System.out.println("Phone number: "+ myCellPhone.getPhoneNumber());
        System.out.println("Owner: "+ myCellPhone.getOwner());

        infoScanner.close();
    }
}
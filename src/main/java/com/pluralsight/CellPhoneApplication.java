package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        // New cell phone object and scanner
        CellPhone myCellPhone1 = new CellPhone();
        Scanner infoScanner = new Scanner(System.in);

        // Prompts for user info and stores with getters
        System.out.println("What is the serial number?");
        myCellPhone1.setSerialNumber(infoScanner.nextInt());
        infoScanner.nextLine();

        System.out.println("What model is the phone?");
        myCellPhone1.setModel(infoScanner.nextLine());

        System.out.println("Who is the carrier?");
        myCellPhone1.setCarrier(infoScanner.nextLine());

        System.out.println("What is the phone number?");
        myCellPhone1.setPhoneNumber(infoScanner.nextLine());

        System.out.println("Who is the owner of the phone?");
        myCellPhone1.setOwner(infoScanner.nextLine());

        // Creates 2nd cellphone and adds chosen information
        CellPhone myCellPhone2 = new CellPhone();
        myCellPhone2.setSerialNumber(5104928);
        myCellPhone2.setModel("Motorola Razr V3");
        myCellPhone2.setCarrier("Verizon");
        myCellPhone2.setPhoneNumber("555-550-5050");
        myCellPhone2.setOwner("Bobby Robert");


        // Prints user info using setters
        System.out.println("Serial number: " + myCellPhone1.getSerialNumber());
        System.out.println("Model: "+ myCellPhone1.getModel());
        System.out.println("Carrier: "+ myCellPhone1.getCarrier());
        System.out.println("Phone number: "+ myCellPhone1.getPhoneNumber());
        System.out.println("Owner: "+ myCellPhone1.getOwner());

        // Display info for both phones
        display(myCellPhone1);
        display(myCellPhone2);


        infoScanner.close();
    }

    // Display method
    public static void display(CellPhone phone){
        System.out.println();
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Number: " + phone.getPhoneNumber());
        System.out.println();
    }
}
package com.pluralsight;


public class CellPhone {
    // private fields
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    // constructor
    public CellPhone() {
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
    }

    // Getter methods
    public int getSerialNumber(){
        return serialNumber;
    }
    public String getModel(){
        return model;
    }
    public String getCarrier(){
        return carrier;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getOwner(){
        return owner;
    }

    // Setter methods
    public void setSerialNumber(int newSerialNumber){
        this.serialNumber = newSerialNumber;
    }
    public void setModel(String newModel){
        this.model = newModel;
    }
    public void setCarrier(String newCarrier){
        this.carrier = newCarrier;
    }
    public void setPhoneNumber(String newPhoneNumber){
        this.phoneNumber = newPhoneNumber;
    }
    public void setOwner(String newOwner){
        this.owner = newOwner;
    }

    // Phone dial method
    public void dial(String phoneNumber){
        System.out.println(owner + "'s phone is calling " + phoneNumber);
    }
}

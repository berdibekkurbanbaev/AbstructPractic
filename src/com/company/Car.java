package com.company;

import java.util.Arrays;

public class Car extends AbstractTransport{
    TaxiDriver[]taxiDrivers;

    public Car(int id, int yearOfIssue, String color, String number, TaxiDriver[] taxiDrivers) {
        super(id, yearOfIssue, color, number);
        this.taxiDrivers = taxiDrivers;
    }

    public Car(int id, int yearOfIssue, String color, String number) {
        super(id, yearOfIssue, color, number);
    }

    @Override
    public void rides() {
        System.out.println("the car drives along the road");
    }

    @Override
    public void stops() {
        System.out.println("and stops in the parking lot ");

    }

    @Override
    public String toString() {
        return "Car - " +getId()+", car's color "+getColor()+", number of the car  "+getNumber()+
                " _" + Arrays.toString(taxiDrivers) +
                " ";
    }
}

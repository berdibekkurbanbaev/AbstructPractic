package com.company;

import java.util.Arrays;

public class Bus extends AbstractTransport{
    Salesman[]salesmen;
    Driver[]drivers;


    public Bus(int id, int yearOfIssue, String color, String number, Driver[] drivers, Salesman[] salesmen) {
        super(id, yearOfIssue, color, number);
        this.drivers = drivers;
        this.salesmen=salesmen;

    }



    @Override
    public void rides() {
        System.out.println("the bus travels around the big city ");
    }

    @Override
    public void stops() {
        System.out.println("and stops at bus stops ");
    }

    @Override
    public String toString() {
        return "Bus - " +getId()+", year of issue bus - "+getYearOfIssue()+", bus № - "+getNumber()+", bus color "+getColor()+" "+
                "_" + Arrays.toString(salesmen) +
                " _" + Arrays.toString(drivers) +
                " " ;
    }
}

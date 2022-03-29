package com.company;

import java.util.Arrays;

public class Trolleybus extends AbstractTransport{
    Salesman[]salesmen;
    Driver[]drivers;

    public Trolleybus(int id, int yearOfIssue, String color, String number, Driver[] drivers, Salesman[] salesmen) {
        super(id, yearOfIssue, color, number);
        this.drivers = drivers;
    }

    public Trolleybus(int id, int yearOfIssue, String color, String number, Salesman[] salesmen) {
        super(id, yearOfIssue, color, number);
        this.salesmen = salesmen;
    }

    public Trolleybus(int id, int yearOfIssue, String color, String number) {
        super(id, yearOfIssue, color, number);
    }

    @Override
    public void rides() {
        System.out.println("the Trolleybus travels around the big city");

    }

    @Override
    public void stops() {
        System.out.println("and stops at bus stops");

    }

    @Override
    public String toString() {
        return "Trolleybus - " +getId()+", year of issue  - "+getYearOfIssue()+", trolleybus № - "+getNumber()+", trolleybus color "+getColor()+" "+
                "_" + Arrays.toString(salesmen) +
                " _" + Arrays.toString(drivers) +
                " ";
    }
}

package com.company;

public class  Driver extends AbstractHuman{

    public Driver(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String toString() {
        return "Driver is "+  getName()+", he is "+getAge()+", ID № "+getId();
    }
}

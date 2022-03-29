package com.company;

public class TaxiDriver extends AbstractHuman{
    public TaxiDriver(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String toString() {
        return "TaxiDriver is "+getName() +", he is "+ getAge()+", ID № - "+getId();
    }
}

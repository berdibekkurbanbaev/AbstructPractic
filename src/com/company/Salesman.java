package com.company;

public class Salesman extends AbstractHuman{
    public Salesman(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String toString() {
        return "Salesman is - "+getName()+", she is "+getAge()+", ID № "+getId();
    }
}

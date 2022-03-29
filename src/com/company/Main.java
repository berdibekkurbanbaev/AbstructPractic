package com.company;

public class Main {

    public static void main(String[] args) {
        Salesman salesman = new Salesman(1,"Kat",29);
        Salesman salesman1 = new Salesman(4,"Dan",34);

	Driver driver = new Driver(1,"Jo",28);
	Driver driver1 = new Driver(2,"John",25);
	Driver driver2 = new Driver(3,"Jack",30);
    TaxiDriver taxiDriver = new TaxiDriver(1,"Ron",32);
    TaxiDriver taxiDriver1 = new TaxiDriver(2,"Ted",47);
    TaxiDriver taxiDriver2 = new TaxiDriver(3,"Ron",27);


    Bus bus = new Bus(1,2003,"yellow"," A 123 S ",new Driver[]{driver},new Salesman[]{salesman});
        System.out.println(bus);
        bus.rides();
        bus.stops();

    Trolleybus trolleybus = new Trolleybus(1,2003,"white","A 432 B",new Driver[]{driver1,driver2},new Salesman[]{salesman1});
        System.out.println(trolleybus);
        trolleybus.rides();
        trolleybus.stops();

    Car car = new Car(1,2017,"yellow","AA 312 D",new TaxiDriver[]{taxiDriver});
    Car car1 = new Car(2,2021,"white","E 421 A",new TaxiDriver[]{taxiDriver2});
        System.out.println(car);
        System.out.println(car1);
        car.rides();
        car.stops();

    }
}

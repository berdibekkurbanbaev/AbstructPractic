package com.company;

public abstract class AbstractTransport {

    private int id;
    private int yearOfIssue;
    private String color;
    private String number;

    public AbstractTransport(int id, int yearOfIssue, String color, String number) {
        this.id = id;
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public abstract void rides();
    public abstract void stops();
}

package org.ulpgc.is1.model;

public class Adress {
    private String street;
    private int number;
    private int floor;
    private String city;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", floor=" + floor +
                ", city='" + city + '\'' +
                '}';
    }

    public Adress(String telephone, String email, String street, int number, int floor, String city) {
        super(telephone, email);
        this.street = street;
        this.number = number;
        this.floor = floor;
        this.city = city;

    }

}

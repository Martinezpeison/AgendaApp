package org.ulpgc.is1.model;

public class Person extends Contact{
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName, String email, String phone, String street, int number, int floor, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        setAdress(street, number, floor, city);
        setEmail(email);
        setTelephone(phone);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getName(){return firstName + " " + lastName;}
}

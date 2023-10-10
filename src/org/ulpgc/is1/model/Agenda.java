package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private final List<Contact> contactList;
    private final List<Group> groupList;

    public Agenda(){
        contactList = new ArrayList<>();
        groupList = new ArrayList<>();
    }
    public void addPerson(String firstName, String lastName, String phone, String email, String street, int number, int floor, String city){

    }
    public void addCompany(String name, String description, String phone, String email, String street, int number, int floor, String city){
        contactList.add(new Company(name, description, phone, email, street, number, floor, city));
    }
    public void addGroup(String name){groupList.add(new Group(name));}
    public List<Contact> getContactList(){return contactList;}
    public List<Group> getGroupList(){return groupList;}
}

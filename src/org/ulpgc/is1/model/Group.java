package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<Contact>contactList = new ArrayList<>();
    public List<Contact>getContactList(){return contactList;}
    public void addContact(Contact contact){contactList.add(contact);}
    public void removeContact(int index){contactList.remove(index);}

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

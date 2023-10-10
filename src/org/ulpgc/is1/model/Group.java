package org.ulpgc.is1.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<Member> members = new ArrayList<>();
    public List<Member>members(){return members;}
    public void removeContact(int index){members.remove(index);}
    public List<Member> getMembers(){
        return members;
    }
    public void addContact(Contact contact){members.add(new Member(LocalDateTime.now(), contact));}

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

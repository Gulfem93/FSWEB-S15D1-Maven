package org.example.mobile;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    //myNumber isminde ve String tipinde, myContacts
    String myNumber;
    List <Contact> myContacts = new ArrayList<>();


    public String getMyNumber() {
        return myNumber;
    }
    public void setMyNumber(String myNumber) {
        this.myNumber = myNumber;
    }
    public List<Contact> getMyContacts() {
        return myContacts;
    }
    public void setMyContacts(List<Contact> myContacts) {
        this.myContacts = myContacts;
    }

    
    
    public MobilePhone(String myNumber, List<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    public boolean addNewContact(Contact contact){
        if(!myContacts.contains(contact)) {
            myContacts.add(contact);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateContact(Contact contactOld, Contact contactNew){
        if(myContacts.contains(contactOld)) {
            myContacts.remove(contactOld);
            myContacts.add(contactNew);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact){
        if(myContacts.contains(contact)){
            myContacts.remove(contact);
            return true;
        } else{
            return false;
        }
    }

    public int  findContact(Contact contact){
        if(myContacts.contains(contact)){
            return myContacts.indexOf(contact);
        } else {
            return -1;
        }
    }
    public int findContact(String name){
        for(int i = 0; i< myContacts.size(); i++){
            if(myContacts.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name){
        for(int i = 0; i< myContacts.size(); i++){
            if(myContacts.get(i).getName().equals(name)){
                return myContacts.get(i);
            }
        }
        return null;
    }

    public void printContact(){
        for(int i=0; i<myContacts.size(); i++){
            System.out.println(i+1 +"." + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}

package com.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contactList = new ArrayList<>();

    public void add(Contact contact) {
        contactList.add(contact);
    }

    public void edit(String name1, String name2, String name3, String address,
                     String city, String state, String id, long num, long code){
        for(Contact contact: contactList) {
            if (name1 == contact.firstName) {
                contact.firstName = name2;
                contact.lastName = name3;
                contact.address = address;
                contact.city = city;
                contact.state = state;
                contact.emailId = id;
                contact.phoneNumber = num;
                contact.pinCode = code;
            }
        }
    }

    public void remove(String name){
        contactList.removeIf(contact -> name == contact.firstName);
    }

    public List getContactList() {
        return contactList;
    }
}




package com.addressbook;

import java.util.List;

public class UserInterface {
    public void print(List contactList) {
        for(int i = 0; i < contactList.size(); i++) {
            System.out.println(contactList.get(i));
        }
    }
}
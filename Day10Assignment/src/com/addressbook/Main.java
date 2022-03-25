package com.addressbook;

import java.util.List;

public class Main {
    public static void main(String args[]) {

        System.out.println("Welcome to Address Book Program");

        Contact contact1 = new Contact("Kalimuthu");
        Contact contact2 = new Contact("Geetha");
        Contact contact3 = new Contact("Deepak");
        Contact contact4 = new Contact("Manikandan");
        Contact contact5 = new Contact("Pradeep");
        Contact contact6 = new Contact("Jeevan");
        Contact contact7 = new Contact("Maharaja");

        contact1.lastName = "Ramachandran";
        contact1.address = "25, Bharathiyar 4th street, S.s.colony";
        contact1.city = "Madurai";
        contact1.state = "Tamilnadu";
        contact1.pinCode = 625016;
        contact1.phoneNumber = 7402181662L;
        contact1.emailId = "kalir888@gmail.com";

        contact2.lastName = "Muthukumar";
        contact2.address = "25, Bharathiyar 4th street, S.s.colony";
        contact2.city = "Madurai";
        contact2.state = "Tamilnadu";
        contact2.pinCode = 625016;
        contact2.phoneNumber = 9345667724L;
        contact2.emailId = "rskgeethastores@gmail.com";

        contact3.lastName = "Dinesh Kumar";
        contact3.address = "Aanaiyur";
        contact3.city = "Madurai";
        contact3.state = "Tamilnadu";
        contact3.pinCode = 625010;
        contact3.phoneNumber = 9047364364L;
        contact3.emailId = "deepak@gmail.com";

        contact4.lastName = "Maran";
        contact4.address = "Thiruparangundram";
        contact4.city = "Madurai";
        contact4.state = "Tamilnadu";
        contact4.pinCode = 625020;
        contact4.phoneNumber = 9344121152L;
        contact4.emailId = "madurai_reports@cms.com";

        contact5.lastName = "Kumar";
        contact5.address = "Theppakualam";
        contact5.city = "Madurai";
        contact5.state = "Tamilnadu";
        contact5.pinCode = 625019;
        contact5.phoneNumber = 9042265025L;
        contact5.emailId = "madurairecon@cms.com";

        contact6.lastName = "Ashok";
        contact6.address = "Jaihindpuram";
        contact6.city = "Madurai";
        contact6.state = "Tamilnadu";
        contact6.pinCode = 625029;
        contact6.phoneNumber = 9943443038L;
        contact6.emailId = "jeevan@gmail.com";

        contact7.lastName = "Kesavan";
        contact7.address = "Aundipatti";
        contact7.city = "Theni";
        contact7.state = "Tamilnadu";
        contact7.pinCode = 625512;
        contact7.phoneNumber = 8489124339L;
        contact7.emailId = "maharaja@gmail.com";

        AddressBook homeContacts = new AddressBook();
        AddressBook officeContacts = new AddressBook();
        AddressBook collegeContacts = new AddressBook();
        homeContacts.add(contact1);
        homeContacts.add(contact2);
        officeContacts.add(contact3);
        officeContacts.add(contact4);
        officeContacts.add(contact5);
        collegeContacts.add(contact6);
        collegeContacts.add(contact7);


        UserInterface userInterface = new UserInterface();
        List homeContactList = homeContacts.getContactList();
        List officeContactList = officeContacts.getContactList();
        List collegeContactList = collegeContacts.getContactList();

        System.out.println("Printing home contact list");
        userInterface.print(homeContactList);
        System.out.println("Printing office contact list");
        userInterface.print(officeContactList);
        System.out.println("Printing college contact list");
        userInterface.print(collegeContactList);

        homeContacts.edit("Kalimuthu","Ramachandran", "Rengasamy",
                "25, Bharathiyar 4th street, S.s.colony", "Madurai", "Tamilnadu",
                "rskgeethastores@gmail.com", 9790295762L, 625016);
        System.out.println("printing after editing the home contact list");
        userInterface.print(homeContactList);

        homeContacts.remove("Geetha");
        System.out.println("printing home contact list after removing contact geetha");
        userInterface.print(homeContactList);
    }
}
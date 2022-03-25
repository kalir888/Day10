package com.company;

public class CompanyEmpWage extends EmpWageComputation {

    CompanyEmpWage(String name, int workDays, int workHours, int wage) {

        super(name, workDays, workHours, wage);
    }

    //Driver method
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Builder.");

        //Database Object
        EmpWageBuilder tempStorage = new EmpWageBuilder();

        //Adding to storage
        tempStorage.addRecord("Swiggy" ,25, 110,23);
        tempStorage.addRecord("Zomato" ,22, 100,28);
        tempStorage.addRecord("Ola" ,27, 100,34);

        //Displaying the entries
        tempStorage.getRecord();

    }

}

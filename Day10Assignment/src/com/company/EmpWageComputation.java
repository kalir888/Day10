package com.company;

import java.util.ArrayList;

public class EmpWageComputation {
    //Class constants
    int WAGE_PER_HR;
    int MAX_WORKING_DAYS;
    int MAX_WORKING_HRS;
    String nameOfCompany;
    //class Variables
    int totalHrs = 0;
    int totalDays = 1;
    int totalWage;
    final ArrayList<Integer> dailyWageList = new ArrayList<>();

    //Parametrized - Constructor
    EmpWageComputation(String name, int workDays, int workHours, int wage) {
        this.WAGE_PER_HR = wage;
        this.MAX_WORKING_DAYS = workDays;
        this.MAX_WORKING_HRS = workHours;
        this.nameOfCompany = name;
        calcTotalWage();
    }

    //update employee work hours
    void setHrs(int x) {
        int dailyWage = 0;
        switch (x) {
            case 1 -> {
                if (this.totalHrs <= this.MAX_WORKING_HRS) {
                    this.totalHrs += 8;
                    dailyWage = 8 * WAGE_PER_HR;
                    dailyWageList.add(dailyWage);
                }
            }
            case 2 -> {
                if (this.totalHrs <= this.MAX_WORKING_HRS) {
                    this.totalHrs += 4;
                    dailyWage = 4 * WAGE_PER_HR;
                    dailyWageList.add(dailyWage);
                }
            }
            default -> {
                dailyWageList.add(dailyWage);
            }
        }
    }

    //Calculate employee salary
    int calSalary() {
        return WAGE_PER_HR * this.totalHrs;
    }

    //Random employee choice
    static int empChoice() {
        return (int) Math.floor((Math.random() * 100) % 3);
    }

    //Wage Builder
    void calcTotalWage() {
        while (this.totalDays != this.MAX_WORKING_DAYS && this.totalHrs < this.MAX_WORKING_HRS) {
            this.totalDays++;
            //Performing check
            int empCheck = empChoice();
            //Operations
            this.setHrs(empCheck);
        }
        this.totalWage = calSalary();
    }
}

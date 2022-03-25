package com.company;

import java.util.ArrayList;
import java.util.Scanner;

interface InterfaceCalculateWage {
    void addRecord(String companyName, int empWagePerHour, int workingHours, int workingDays);
    void getRecord();
}

public class EmpWageBuilder implements InterfaceCalculateWage {

    final private ArrayList<CompanyEmpWage> record = new ArrayList();
    Scanner sc = new Scanner(System.in);

    @Override
    public void addRecord(String name, int workDays, int workHours, int wage){
        CompanyEmpWage o = new CompanyEmpWage(name, workDays, workHours, wage);
        record.add(o);
    }

    @Override
    public void getRecord(){
        System.out.print("Enter the Name of company: ");
        String name = sc.nextLine();
        for (CompanyEmpWage company : record) {
            if(company.nameOfCompany.equals(name)){
                System.out.println("Company: " + company.nameOfCompany);
                System.out.println("Days Worked: " + company.totalDays);
                System.out.println("Hours Worked: " + company.totalHrs);
                System.out.println("Salary Earned: " + company.totalWage);
                System.out.println("Daily Wage: " + company.dailyWageList+ "\n");
            }
            else{
                System.out.println("The company data does not exist.");
            }
            break;
        }
    }
}
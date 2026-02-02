package com.example.demo;

public class Employee {
    private int Salary;
    private int ID;
    private String Designation;
    private String Department;


    //Constructor
    Employee(int Salary,int ID,String Dep,String Des){
        this.Department = Dep;
        this.Salary = Salary;
        this.Designation = Des;
        this.ID = ID;
    }


    //Default constructor
    Employee(){};



    //Getters
    public String getDesignation(){
        return Designation;
    }
    public String getDepartment(){
        return Department;
    }
    public int getSalary(){
        return Salary;
    }
    public int getID(){
        return ID;
    }


    //Setters
    public void setSalary(int Salary){
        this.Salary = Salary;
    }
    public void setID(int Id){
        this.ID = Id;
    }
    public void setDesignation(String Des){
        this.Designation = Des;
    }
    public void setDepartment(String Dep){
        this.Department = Dep;
    }


}

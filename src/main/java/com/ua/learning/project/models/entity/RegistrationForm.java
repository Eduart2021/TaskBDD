package com.ua.learning.project.models.entity;


public class RegistrationForm {
    private String firstName;
    private String lastName;
    private String birthday;
    public int age;


    public RegistrationForm(String firstName, String lastName, String birthday, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.age = age;
    }
//Getters

    @Override
    public String toString() {
        return this.firstName;
    }
    @Override
    public int hashCode(){
        return this.age;
    }
    public String fName(){
        return this.firstName;
    }
    public String lName(){
        return this.lastName;
    }
    public String bDay(){
        return this.birthday;
    }
//setter
    public void set_fName(String fn){
        this.firstName = fn;
    }
    public void set_lName(String ln){
        this.lastName = ln;
    }
    public void set_bday(String bd){
        this.birthday = bd;
    }
    public void set_age(int a){
       this.age = a;
    }
// HashCode method test

    public String CheckHashCode(String name){
        String[] letters = name.split("");
        if(letters.length > 3){
            System.out.println("firstName is more than 3 symbols");
            return "0";
        }else {
            System.out.println("hashCode : "+name.hashCode());
           return name;
        }
    }



}

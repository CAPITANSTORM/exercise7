package com.company;

public class Business extends Person{
    private String number;

    public Business(String name, String email, String number) {
        super(name, email);
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public void display() {
        System.out.println("The name is " + super.getName() + ". The email is " + super.getEmail() + ". The phone number is " + number);
    }
}
